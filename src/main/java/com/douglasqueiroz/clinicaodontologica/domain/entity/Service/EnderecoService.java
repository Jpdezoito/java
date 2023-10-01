package com.douglasqueiroz.clinicaodontologica.domain.entity.Service;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Endereco;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class EnderecoService implements UserDetails {

    private final EnderecoRepository repository;

    @Autowired
    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Endereco criarEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    @Transactional(readOnly = true)
    public Endereco buscarEnderecoPorId(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Endereco> listarEnderecos() {
        return repository.findAll();
    }

    @Transactional
    public Endereco atualizarEndereco(Endereco endereco) {
        return repository.save(endereco);
    }

    @Transactional
    public void deletarEndereco(UUID id) {
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
