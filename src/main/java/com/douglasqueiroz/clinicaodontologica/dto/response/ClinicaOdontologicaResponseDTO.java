package com.douglasqueiroz.clinicaodontologica.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Data
@Getter
@Setter
public class ClinicaOdontologicaResponseDTO {
    private UUID id;
    private String nome;
    private String cnpj;
    private String razaoSocial;
    private String descricao;
    private Instant createdAt;
    private Instant updatedAt;

    // Construtor
    public ClinicaOdontologicaResponseDTO(UUID id, String nome, String cnpj, String razaoSocial, String descricao, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.descricao = descricao;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
