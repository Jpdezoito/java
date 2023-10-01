package com.douglasqueiroz.clinicaodontologica.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicaOdontologicaRequestDTO {

    private String nome;


    private String cnpj;


    private String razaoSocial;


    private String descricao;
}
