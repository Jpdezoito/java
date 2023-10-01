package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.Data;

@Data
public class EnderecoRequestDTO {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    // Outros campos relevantes para a criação/atualização de Endereco
}