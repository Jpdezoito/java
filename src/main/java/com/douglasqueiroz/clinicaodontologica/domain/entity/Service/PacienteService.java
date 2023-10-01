package com.douglasqueiroz.clinicaodontologica.domain.entity.Service;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Paciente;
import com.douglasqueiroz.clinicaodontologica.domain.entity.Repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class PacienteService implements UserDetails {

    private final PacienteRepository repository;

    @Autowired
    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Paciente criarPaciente(Paciente paciente) {
        return repository.save(paciente);
    }

    @Transactional(readOnly = true)
    public Paciente buscarPacientePorId(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Paciente> listarPacientes() {
        return repository.findAll();
    }

    @Transactional
    public Paciente atualizarPaciente(Paciente paciente) {
        return repository.save(paciente);
    }

    @Transactional
    public void deletarPaciente(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
