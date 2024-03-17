package br.com.techchallenge.booknDineAPI.model.restaurantes;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Funcionamento {

    private LocalTime horarioDeAbertura;
    private LocalTime horarioDeFechamento;

}
