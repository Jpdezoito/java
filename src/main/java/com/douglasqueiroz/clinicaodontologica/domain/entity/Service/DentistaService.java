package com.douglasqueiroz.clinicaodontologica.domain.entity.Service;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Dentista;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class DentistaService implements UserDetails {

    private final DentistaRepository repository;

    @Autowired
    public DentistaService(DentistaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Dentista criarDentista(Dentista dentista) {
        return repository.save(dentista);
    }

    @Transactional(readOnly = true)
    public Dentista buscarDentistaPorId(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Dentista> listarDentistas() {
        return repository.findAll();
    }

    @Transactional
    public Dentista atualizarDentista(Dentista dentista) {
        return repository.save(dentista);
    }

    @Transactional
    public void deletarDentista(UUID id) {
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
