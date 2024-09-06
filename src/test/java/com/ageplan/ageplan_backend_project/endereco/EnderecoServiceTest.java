package com.ageplan.ageplan_backend_project.endereco;

import com.ageplan.ageplan_backend_project.exceptions.DataBaseException;
import com.ageplan.ageplan_backend_project.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

/**
 * Classe de teste para a classe de serviço EnderecoService.
 * Esta classe contém testes unitários para os métodos do serviço de Endereço.
 */
@ExtendWith(SpringExtension.class)
class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService service;

    @Mock
    private EnderecoRepository repository;

    private long idExistente;
    private long idInexistente;
    private long idDependente;
    private EnderecoDTO enderecoDTO;

    /**
     * Configuração inicial dos mocks e dados de teste.
     * Este método é executado antes de cada teste.
     */
    @BeforeEach
    void setUp() throws Exception {
        idExistente = 1L;
        idInexistente = 1000L;
        idDependente = 4L;
        Endereco endereco = new Endereco();
        enderecoDTO = new EnderecoDTO(endereco);
        PageImpl<Endereco> page = new PageImpl<>(List.of(endereco));

        Mockito.doNothing().when(repository).deleteById(idExistente);
        Mockito.doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(idInexistente);
        Mockito.doThrow(DataIntegrityViolationException.class).when(repository).deleteById(idDependente);

        Mockito.when(repository.findAll((Pageable) ArgumentMatchers.any())).thenReturn(page);
        Mockito.when(repository.save(ArgumentMatchers.any())).thenReturn(endereco);
        Mockito.when(repository.findById(idExistente)).thenReturn(Optional.of(endereco));
        Mockito.when(repository.findById(idInexistente)).thenReturn(Optional.empty());
        Mockito.when(repository.getReferenceById(idExistente)).thenReturn(endereco);
        Mockito.when(repository.getReferenceById(idInexistente)).thenThrow(EntityNotFoundException.class);
    }

    /**
     * Testa se o método delete lança DataBaseException quando o ID é dependente.
     */
    @Test
    void deleteDeveriaLancarDataBaseExceptionQuandoIdDependente() {
        Assertions.assertThrows(DataBaseException.class, () -> service.delete(idDependente));
        Mockito.verify(repository).deleteById(idDependente);
    }

    /**
     * Testa se o método delete lança ResourceNotFoundException quando o ID é inexistente.
     */
    @Test
    void deleteDeveriaLancarResourceNotFoundExceptionQuandoIdInexistente() {
        Assertions.assertThrows(ResourceNotFoundException.class, () -> service.delete(idInexistente));
        Mockito.verify(repository).deleteById(idInexistente);
    }

    /**
     * Testa se o método delete não lança exceção quando o ID é existente.
     */
    @Test
    void deleteDeveriaFazerNadaQuandoIdExistente() {
        Assertions.assertDoesNotThrow(() -> service.delete(idExistente));
        Mockito.verify(repository).deleteById(idExistente);
    }

    /**
     * Testa se o método findAllPaged retorna uma página de EnderecoDTO.
     */
    @Test
    void findAllPagedDeveriaRetornarPagina() {
        Pageable pageable = Mockito.mock(Pageable.class);
        Page<EnderecoDTO> result = service.findAllPaged(pageable);
        Assertions.assertNotNull(result);
        Mockito.verify(repository).findAll(pageable);
    }

    /**
     * Testa se o método findById retorna um EnderecoDTO quando o ID é existente.
     */
    @Test
    void findByIdDeveriaRetornarEnderecoDTOQuandoIdExistente() {
        EnderecoDTO result = service.findById(idExistente);
        Assertions.assertNotNull(result);
        Mockito.verify(repository).findById(idExistente);
    }

    /**
     * Testa se o método findById lança ResourceNotFoundException quando o ID é inexistente.
     */
    @Test
    void findByIdDeveriaLancarResourceNotFoundExceptionQuandoIdInexistente() {
        Assertions.assertThrows(ResourceNotFoundException.class, () -> service.findById(idInexistente));
        Mockito.verify(repository).findById(idInexistente);
    }

    /**
     * Testa se o método insert retorna um EnderecoDTO.
     */
    @Test
    void insertDeveriaRetornarEnderecoDTO() {
        EnderecoDTO result = service.insert(enderecoDTO);
        Assertions.assertNotNull(result);
        Mockito.verify(repository).save(ArgumentMatchers.any());
    }

    /**
     * Testa se o método update retorna um EnderecoDTO quando o ID é existente.
     */
    @Test
    void updateDeveriaRetornarEnderecoDTOQuandoIdExistente() {
        EnderecoDTO result = service.update(idExistente, enderecoDTO);
        Assertions.assertNotNull(result);
        Mockito.verify(repository).getReferenceById(idExistente);
        Mockito.verify(repository).save(ArgumentMatchers.any());
    }

    /**
     * Testa se o método update lança ResourceNotFoundException quando o ID é inexistente.
     */
    @Test
    void updateDeveriaLancarResourceNotFoundExceptionQuandoIdInexistente() {
        Assertions.assertThrows(ResourceNotFoundException.class, () -> service.update(idInexistente, enderecoDTO));
        Mockito.verify(repository).getReferenceById(idInexistente);
    }
}