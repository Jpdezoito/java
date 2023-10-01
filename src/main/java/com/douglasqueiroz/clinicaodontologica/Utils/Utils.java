package com.douglasqueiroz.clinicaodontologica.Utils;

import lombok.*;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Logger;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class Utils {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Utils.class);

    public static String formatarData(LocalDate data) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data);
    }

    public static String formatarDataHora(LocalDateTime dataHora) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(dataHora);
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+$";
        return email.matches(regex);
    }

    public static boolean validarSenha(String senha) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.{8,})";
        return senha.matches(regex);
    }

}
