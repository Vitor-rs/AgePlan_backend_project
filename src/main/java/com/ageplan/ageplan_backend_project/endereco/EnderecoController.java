package com.ageplan.ageplan_backend_project.endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Controlador REST para gerenciar endereços.
 * <p>
 * Esta classe fornece endpoints para operações CRUD (Create, Read, Update, Delete)
 * relacionadas aos endereços. Utiliza o serviço EnderecoService para realizar as operações
 * de negócio e retorna respostas HTTP apropriadas.
 * </p>
 */
@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    /**
     * Endpoint para listar todos os endereços de forma paginada.
     *
     * @param pageable parâmetros de paginação.
     * @return uma resposta HTTP contendo uma página de EnderecoDTO.
     */
    @GetMapping
    public ResponseEntity<Page<EnderecoDTO>> findAllPaged(Pageable pageable) {
        Page<EnderecoDTO> list = service.findAllPaged(pageable);
        return ResponseEntity.ok().body(list);
    }

    /**
     * Endpoint para buscar um endereço por ID.
     *
     * @param id o ID do endereço a ser buscado.
     * @return uma resposta HTTP contendo o EnderecoDTO correspondente ao ID fornecido.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoDTO> findById(@PathVariable Long id) {
        EnderecoDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    /**
     * Endpoint para inserir um novo endereço.
     *
     * @param dto        o objeto EnderecoDTO contendo os dados do novo endereço.
     * @param uriBuilder objeto para construir a URI do novo recurso criado.
     * @return uma resposta HTTP contendo o EnderecoDTO criado e a URI do novo recurso.
     */
    @PostMapping
    public ResponseEntity<EnderecoDTO> insert(@RequestBody EnderecoDTO dto, UriComponentsBuilder uriBuilder) {
        dto = service.insert(dto);
        URI uri = uriBuilder.path("/enderecos/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    /**
     * Endpoint para atualizar um endereço existente.
     *
     * @param id  o ID do endereço a ser atualizado.
     * @param dto o objeto EnderecoDTO contendo os novos dados do endereço.
     * @return uma resposta HTTP contendo o EnderecoDTO atualizado.
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<EnderecoDTO> update(@PathVariable Long id, @RequestBody EnderecoDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    /**
     * Endpoint para deletar um endereço por ID.
     *
     * @param id o ID do endereço a ser deletado.
     * @return uma resposta HTTP sem conteúdo.
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
