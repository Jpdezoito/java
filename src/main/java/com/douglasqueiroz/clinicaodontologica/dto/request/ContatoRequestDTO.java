package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.Data;

@Data
public class ContatoRequestDTO {
    private String telefone;
    private String email;
    // Outros campos relevantes para a criação/atualização de Contato
}