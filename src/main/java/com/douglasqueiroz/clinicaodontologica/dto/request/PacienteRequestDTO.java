package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PacienteRequestDTO {
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    // Outros campos relevantes para a criação/atualização de Paciente
}