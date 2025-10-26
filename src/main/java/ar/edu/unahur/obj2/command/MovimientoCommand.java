package ar.edu.unahur.obj2.command;

public abstract class MovimientoCommand {
    protected Jugador jugador;

    public MovimientoCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    public void movete(){
        this.doMovete();
        jugador.incMovimientos();
    }

    public abstract void doMovete();
}
