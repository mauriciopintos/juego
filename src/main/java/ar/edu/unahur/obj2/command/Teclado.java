package ar.edu.unahur.obj2.command;

import java.util.Arrays;
import java.util.HashMap;

public class Teclado {
    private HashMap<Character, MovimientoCommand> keysCommand = new HashMap<>();

    public Teclado(Jugador jugador) {
        keysCommand.put('d', new Avanzar(jugador));
        keysCommand.put('a', new Retroceder(jugador));
        keysCommand.put('f', new Correr(jugador, Arrays.asList(
            new Avanzar(jugador),
            new Avanzar(jugador),
            new Avanzar(jugador)
        )));
    }

    public void mover(Character caracter){
        keysCommand.get(caracter).movete();
    }
}
