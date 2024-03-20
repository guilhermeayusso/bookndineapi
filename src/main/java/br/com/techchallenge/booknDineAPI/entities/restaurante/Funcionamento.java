package br.com.techchallenge.booknDineAPI.entities.restaurante;

import jakarta.persistence.Column;
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

    @Column(name = "dias_funcionamento", nullable = false, length = 255)
    private String dias;

    @Column(name = "horario_abertura", nullable = false, length = 5)
    private LocalTime horarioAbertura;

    @Column(name = "horario_fechamento", nullable = false, length = 5)
    private LocalTime horarioFechamento;
}
