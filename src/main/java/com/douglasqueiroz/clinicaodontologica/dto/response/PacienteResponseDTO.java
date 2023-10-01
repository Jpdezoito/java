package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class PacienteResponseDTO {
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    // Outros campos relevantes para a resposta de Paciente
}