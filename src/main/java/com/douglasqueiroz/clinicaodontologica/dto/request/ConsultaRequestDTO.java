package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaRequestDTO {
    private LocalDateTime dataConsulta;
    private String descricao;
    private String motivoCancelamento;
    private Boolean cancelada;
    private UUID pacienteId; // Você pode usar UUID para referenciar Paciente, Dentista e Clinica
    private UUID dentistaId;
    private UUID clinicaId;
}
