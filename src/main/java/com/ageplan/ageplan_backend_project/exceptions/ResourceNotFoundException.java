package com.ageplan.ageplan_backend_project.exceptions;

/**
 * Classe de exceção personalizada para lidar com erros de recurso não encontrado.
 * Esta classe estende a classe {@link RuntimeException}.
 */
public class ResourceNotFoundException extends RuntimeException {

    /**
     * Constrói uma nova ResourceNotFoundException com a mensagem detalhada especificada.
     *
     * @param message a mensagem detalhada.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}