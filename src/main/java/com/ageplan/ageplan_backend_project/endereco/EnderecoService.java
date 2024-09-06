package com.ageplan.ageplan_backend_project.endereco;

import com.ageplan.ageplan_backend_project.exceptions.DataBaseException;
import com.ageplan.ageplan_backend_project.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional(readOnly = true)
    public List<EnderecoDTO> findAll() {
        List<Endereco> list = enderecoRepository.findAll();
        return list.stream().map(EnderecoDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Page<EnderecoDTO> findAllPaged(Pageable pageable) {
        Page<Endereco> list = enderecoRepository.findAll(pageable);
        return list.map(EnderecoDTO::new);
    }

    @Transactional(readOnly = true)
    public EnderecoDTO findById(Long id) {
        Optional<Endereco> obj = enderecoRepository.findById(id);
        Endereco entity = obj.orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado"));
        return new EnderecoDTO(entity);
    }

    @Transactional
    public EnderecoDTO insert(EnderecoDTO dto) {
        Endereco entity = new Endereco();
        return getEnderecoDTO(dto, entity);
    }


    private EnderecoDTO getEnderecoDTO(EnderecoDTO dto, Endereco entity) {
        entity.setCep(dto.getCep());
        entity.setTipoLogradouro(dto.getTipoLogradouro());
        entity.setNomeLogradouro(dto.getNomeLogradouro());
        entity.setNumero(dto.getNumero());
        entity.setComplemento(dto.getComplemento());
        entity.setBairro(dto.getBairro());
        entity.setCidade(dto.getCidade());
        entity.setUf(dto.getUf());
        entity = enderecoRepository.save(entity);
        return new EnderecoDTO(entity);
    }

    @Transactional
    public EnderecoDTO update(Long id, EnderecoDTO dto) {
        try {
            Endereco entity = enderecoRepository.getReferenceById(id);
            return getEnderecoDTO(dto, entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Endereço com ID = " + id + " não encontrado");
        }
    }

    public void delete(Long id) {
        try {
            enderecoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Endereço com ID = " + id + " não encontrado");
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException("Não é possível excluir o endereço, pois está em uso");
        }
    }
}