package br.com.techchallenge.booknDineAPI.repository.restaurante;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.techchallenge.booknDineAPI.entities.restaurante.Funcionamento;
import br.com.techchallenge.booknDineAPI.entities.restaurante.Localizacao;
import br.com.techchallenge.booknDineAPI.entities.restaurante.Restaurante;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;
import java.util.UUID;


class RestauranteRepositoryTest {
    @Mock
    private RestauranteRepository restauranteRepository;

    AutoCloseable openMocks;

    @BeforeEach
    void setUp(){
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    void devePermitirRegistrarRestaurante(){

        var id = UUID.randomUUID();
        var restaurante = gerarRestaurante();
        restaurante.setId(id);

        when(restauranteRepository.save(any(Restaurante.class))).thenReturn(restaurante);

        var restauranteArmazenado = restauranteRepository.save(restaurante);

        verify(restauranteRepository, times(1)).save(restaurante);

        assertThat(restauranteArmazenado).isInstanceOf(Restaurante.class)
                .isNotNull()
                .isEqualTo(restaurante);

        assertThat(restauranteArmazenado).extracting(Restaurante::getId)
                .isEqualTo(restaurante.getId());

        assertThat(restauranteArmazenado).extracting(Restaurante::getCapacidade)
                .isEqualTo(restaurante.getCapacidade());

        assertThat(restauranteArmazenado).extracting(Restaurante::getNome)
                .isEqualTo(restaurante.getNome());

        assertThat(restauranteArmazenado).extracting(Restaurante::getTipoDeCozinha)
                .isEqualTo(restaurante.getTipoDeCozinha());

        assertThat(restauranteArmazenado).extracting(Restaurante::getLocalizacao)
                .isEqualTo(restaurante.getLocalizacao());

        assertThat(restauranteArmazenado).extracting(Restaurante::getFuncionamento)
                .isEqualTo(restaurante.getFuncionamento());

    }



    private Restaurante gerarRestaurante(){

        Funcionamento funcionamento = new Funcionamento();
        Localizacao localizacao = new Localizacao();

        funcionamento.setDias("Segunda à Sexta");
        funcionamento.setHorarioAbertura(LocalTime.of(12,0));
        funcionamento.setHorarioFechamento(LocalTime.of(23,0));

        localizacao.setCep("06210000");
        localizacao.setEndereco("Rua Osvaldo Collino");
        localizacao.setNumero("309");
        localizacao.setCidade("Osasco");
        localizacao.setEstado("SP");
        localizacao.setPais("Brasil");
        localizacao.setComplemento("N/A");

        return Restaurante.builder().nome("Restaurante da Lola")
                .tipoDeCozinha("Brasileira").capacidade(40).funcionamento(funcionamento)
                .localizacao(localizacao).build();
    }
}
