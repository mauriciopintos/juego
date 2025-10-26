package ar.edu.unahur.obj2.command;

public class Avanzar extends MovimientoCommand{

    public Avanzar(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void doMovete() {
        jugador.avanzar();
    }

}
