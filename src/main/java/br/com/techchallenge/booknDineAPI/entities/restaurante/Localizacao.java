package br.com.techchallenge.booknDineAPI.entities.restaurante;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Localizacao {

    @Column(nullable = true, length = 20)
    private String cep;

    @Column(nullable = false, length = 150)
    private String endereco;

    @Column(nullable = true, length = 20)
    private String numero;

    @Column(nullable = true, length = 50)
    private String complemento;

    @Column(nullable = false, length = 100)
    private String cidade;

    @Column(nullable = false, length = 50)
    private String estado;

    @Column(nullable = false, length = 50)
    private String pais;
}

