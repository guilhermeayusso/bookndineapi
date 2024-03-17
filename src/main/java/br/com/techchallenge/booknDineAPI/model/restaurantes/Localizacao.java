package br.com.techchallenge.booknDineAPI.model.restaurantes;

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

    private Double latitude;
    private Double longitude;
}
