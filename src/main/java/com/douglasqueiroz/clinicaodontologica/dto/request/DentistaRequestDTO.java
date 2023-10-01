package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DentistaRequestDTO {
    private String nome;
    private LocalDate dataNascimento;
    private String especialidade;
    private String sexo;
    // Outros campos relevantes para a criação/atualização de Dentista
}