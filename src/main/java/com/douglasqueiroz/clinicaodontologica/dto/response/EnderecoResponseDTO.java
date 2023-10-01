package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class EnderecoResponseDTO {
    private UUID id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    // Outros campos relevantes para a resposta de Endereco
}
