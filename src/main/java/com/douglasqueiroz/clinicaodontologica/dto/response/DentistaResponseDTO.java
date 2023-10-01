package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class DentistaResponseDTO {
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private String especialidade;
    private String sexo;
    // Outros campos relevantes para a resposta de Dentista
}