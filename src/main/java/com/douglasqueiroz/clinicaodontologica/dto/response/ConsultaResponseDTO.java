package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaResponseDTO {
    private UUID id;
    private LocalDateTime dataConsulta;
    private String descricao;
    private String motivoCancelamento;
    private Boolean cancelada;
    private UUID pacienteId;
    private UUID dentistaId;
    private UUID clinicaId;
    private Instant createdAt;
    private Instant updatedAt;
}
