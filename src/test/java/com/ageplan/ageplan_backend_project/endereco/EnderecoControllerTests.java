package com.ageplan.ageplan_backend_project.endereco;

import com.ageplan.ageplan_backend_project.exceptions.DataBaseException;
import com.ageplan.ageplan_backend_project.exceptions.ResourceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Classe de testes para o controlador EnderecoController.
 * <p>
 * Esta classe contém testes unitários que verificam o comportamento da classe
 * EnderecoController, que é responsável por gerenciar as operações relacionadas
 * aos endereços. Os testes são realizados utilizando o MockMvc para simular
 * requisições HTTP e verificar as respostas da API.
 * </p>
 * <p>
 * Os testes incluem:
 * <ul>
 *     <li>Atualização de endereços</li>
 *     <li>Busca de endereços por ID</li>
 *     <li>Listagem paginada de endereços</li>
 * </ul>
 * </p>
 * <p>
 * Os testes utilizam mocks do serviço EnderecoService para isolar a lógica
 * de controle da lógica de serviço, permitindo verificar se as respostas
 * da API estão corretas.
 * </p>
 *
 * @see EnderecoController
 */
@WebMvcTest(EnderecoController.class)
class EnderecoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnderecoService service;

    @Autowired
    private ObjectMapper objectMapper;

    private EnderecoDTO enderecoDTO;
    private Long idExistente;
    private Long idInexistente;

    /**
     * Configuração inicial dos testes.
     * <p>
     * Este método é executado antes de cada teste, configurando os dados
     * necessários e as respostas esperadas do serviço mockado.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a configuração.
     */
    @BeforeEach
    void setUp() throws Exception {
        idExistente = 1L;
        idInexistente = 100L;
        Long idDependente = 2L;

        enderecoDTO = EnderecoFactory.createEnderecoDTO();
        PageImpl<EnderecoDTO> page = new PageImpl<>(List.of(enderecoDTO));

        when(service.findAllPaged(any())).thenReturn(page);
        when(service.findById(idExistente)).thenReturn(enderecoDTO);
        when(service.findById(idInexistente)).thenThrow(ResourceNotFoundException.class);

        when(service.update(eq(idExistente), any())).thenReturn(enderecoDTO);
        when(service.update(eq(idInexistente), any())).thenThrow(ResourceNotFoundException.class);

        when(service.insert(any())).thenReturn(enderecoDTO);

        doNothing().when(service).delete(idExistente);
        doThrow(ResourceNotFoundException.class).when(service).delete(idInexistente);
        doThrow(DataBaseException.class).when(service).delete(idDependente);
    }

    /**
     * Testa a atualização de um endereço existente.
     * <p>
     * Este teste verifica se a atualização de um endereço com um ID existente
     * retorna um status 200 OK e se o corpo da resposta contém os dados
     * do endereço atualizado.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a execução do teste.
     */
    @Test
    void updateDeveriaRetornarEnderecoQuandoIdExistente() throws Exception {
        String jsonBody = objectMapper.writeValueAsString(enderecoDTO);
        ResultActions result = mockMvc.perform(put("/endereco/{id}", idExistente)
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.id").exists());
        result.andExpect(jsonPath("$.logradouro").exists());
    }

    /**
     * Testa a atualização de um endereço com um ID inexistente.
     * <p>
     * Este teste verifica se a tentativa de atualização de um endereço com
     * um ID que não existe retorna um status 404 Not Found.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a execução do teste.
     */
    @Test
    void updateDeveriaRetornarNotFoundQuandoIdInexistente() throws Exception {
        String jsonBody = objectMapper.writeValueAsString(enderecoDTO);
        ResultActions result = mockMvc.perform(put("/endereco/{id}", idInexistente)
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
        result.andExpect(status().isNotFound());
    }

    /**
     * Testa a listagem paginada de endereços.
     * <p>
     * Este teste verifica se a requisição para listar todos os endereços
     * retorna um status 200 OK.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a execução do teste.
     */
    @Test
    void findAllPagedDeveriaRetornarPage() throws Exception {
        ResultActions result = mockMvc.perform(get("/endereco")
                .accept(MediaType.APPLICATION_JSON));
        result.andExpect(status().isOk());
    }

    /**
     * Testa a busca de um endereço por ID existente.
     * <p>
     * Este teste verifica se a busca de um endereço com um ID existente
     * retorna um status 200 OK e se o corpo da resposta contém os dados
     * do endereço.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a execuç��o do teste.
     */
    @Test
    void findByIdDeveriaRetornarEnderecoQuandoIdExistente() throws Exception {
        ResultActions result = mockMvc.perform(get("/endereco/{id}", idExistente)
                .accept(MediaType.APPLICATION_JSON));
        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.id").exists());
    }

    /**
     * Testa a busca de um endereço por ID inexistente.
     * <p>
     * Este teste verifica se a busca de um endereço com um ID que não existe
     * retorna um status 404 Not Found.
     * </p>
     *
     * @throws Exception se ocorrer um erro durante a execução do teste.
     */
    @Test
    void findByIdDeveriaRetornarNotFoundQuandoIdInexistente() throws Exception {
        ResultActions result = mockMvc.perform(get("/endereco/{id}", idInexistente)
                .accept(MediaType.APPLICATION_JSON));
        result.andExpect(status().isNotFound());
    }
}