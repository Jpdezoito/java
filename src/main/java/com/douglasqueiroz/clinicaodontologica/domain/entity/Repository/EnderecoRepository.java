package com.douglasqueiroz.clinicaodontologica.domain.entity.Repository;

import com.douglasqueiroz.clinicaodontologica.domain.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}