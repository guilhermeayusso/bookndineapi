package br.com.techchallenge.booknDineAPI.model.restaurantes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurantes")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipoDeCozinha;
    private int capacidade;

    @Embedded
    private Funcionamento funcionamento;

    @Embedded
    private Localizacao localizacao;

    // Getters e setters
}
