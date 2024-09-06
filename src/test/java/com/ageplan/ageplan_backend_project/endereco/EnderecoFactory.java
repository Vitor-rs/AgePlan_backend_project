package com.ageplan.ageplan_backend_project.endereco;

/**
 * Classe de fábrica para criar instâncias de Endereco e EnderecoDTO.
 * <p>
 * Esta classe fornece métodos estáticos para criar objetos de Endereco e EnderecoDTO
 * com dados de exemplo. É útil para testes e outras situações onde objetos de exemplo
 * são necessários.
 * </p>
 */
public class EnderecoFactory {

    /**
     * Cria uma instância de Endereco com dados de exemplo.
     *
     * @return uma nova instância de Endereco com dados preenchidos.
     */
    public static Endereco createEndereco() {
        Endereco endereco = new Endereco();
        endereco.setId(1L);
        endereco.setCep("12345-678");
        endereco.setTipoLogradouro("Rua");
        endereco.setNomeLogradouro("Exemplo");
        endereco.setNumero("123");
        endereco.setComplemento("Apto 1");
        endereco.setBairro("Centro");
        endereco.setCidade("Cidade Exemplo");
        endereco.setUf("EX");
        return endereco;
    }

    /**
     * Cria uma instância de EnderecoDTO com dados de exemplo.
     * <p>
     * Este método utiliza a instância de Endereco criada pelo método createEndereco()
     * para inicializar um novo EnderecoDTO.
     * </p>
     *
     * @return uma nova instância de EnderecoDTO com dados preenchidos.
     */
    public static EnderecoDTO createEnderecoDTO() {
        Endereco endereco = createEndereco();
        return new EnderecoDTO(endereco);
    }
}