package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TecladoTest {
    private Jugador jugador = new Jugador(0, 0);
    private Teclado teclado = new Teclado(jugador);

    @BeforeEach
    void setUp(){
        jugador.reset();
    }

    @Test
    void dadoUnJugador_AlPresionarLaTeclaAvanzar_ElPersonajeAvanzaCorrectamente() {
        teclado.mover('d');
        assertEquals(1, jugador.getPosX());
        assertEquals(1, jugador.getCantMovimientos());
    }

    @Test
    void dadoUnJugador_AlPresionarLaTeclaRetroceder_ElPersonajeRetrocedeCorrectamente() {
        teclado.mover('d');
        teclado.mover('d');
        teclado.mover('a');
        assertEquals(1, jugador.getPosX());
        assertEquals(3, jugador.getCantMovimientos());
    }

    @Test
    void dadoUnJugador_AlPresionarLaTeclaCorrer_ElPersonajeCorreCorrectamente() {
        teclado.mover('f');
        assertEquals(3, jugador.getPosX());
        assertEquals(4, jugador.getCantMovimientos());
    }

}
