package com.douglasqueiroz.clinicaodontologica.Security;

import com.douglasqueiroz.clinicaodontologica.domain.entity.ClinicaOdontologica;
import com.douglasqueiroz.clinicaodontologica.domain.entity.Repository.ClinicaOdontologicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClinicaOdontologicaRepository clinicaOdontologicaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        ClinicaOdontologica clinicaOdontologica = clinicaOdontologicaRepository.findByCnpj(username);

        if (clinicaOdontologica == null) {
            throw new UsernameNotFoundException("Clínica não encontrada");
        }

        return clinicaOdontologica;
    }
}
