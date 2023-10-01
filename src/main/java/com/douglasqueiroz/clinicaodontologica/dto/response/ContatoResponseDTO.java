package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class ContatoResponseDTO {
    private UUID id;
    private String telefone;
    private String email;
    // Outros campos relevantes para a resposta de Contato
}
