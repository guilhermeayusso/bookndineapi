package br.com.techchallenge.booknDineAPI.repository.restaurante;

import br.com.techchallenge.booknDineAPI.entities.restaurante.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
