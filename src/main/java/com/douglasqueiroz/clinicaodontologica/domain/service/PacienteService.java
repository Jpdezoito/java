package com.douglasqueiroz.clinicaodontologica.domain.service;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {


    Paciente criarPaciente(Paciente paciente);
    Optional<Paciente> buscarPorId(Integer id);
    List<Paciente> buscarTodosPacientes();
    void excluirPaciente(Integer id);


}
