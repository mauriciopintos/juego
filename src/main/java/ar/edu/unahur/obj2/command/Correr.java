package ar.edu.unahur.obj2.command;

import java.util.ArrayList;
import java.util.List;

public class Correr extends MovimientoCommand{
    private List<MovimientoCommand> movimientos = new ArrayList<>();

    public Correr(Jugador jugador, List<MovimientoCommand> movimientos) {
        super(jugador);
        this.movimientos = movimientos;
    }

    @Override
    public void doMovete() {
        movimientos.forEach(MovimientoCommand::movete);
    }

}
