package br.com.techchallenge.booknDineAPI.entities.restaurante;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Builder(toBuilder = true)
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurantes")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "tipoDeCozinha", nullable = false, length = 100)
    private String tipoDeCozinha;
    @Column(name = "capacidade", nullable = false, length = 5)
    private int capacidade;

    @Embedded
    @Valid
    private Funcionamento funcionamento;

    @Embedded
    @Valid
    private Localizacao localizacao;


    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_modificacao")
    private LocalDateTime dataModificacao;

    @Column(name = "criado_por")
    private String criadoPor;

    @Column(name = "modificado_por")
    private String modificadoPor;

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipoDeCozinha='" + tipoDeCozinha + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
