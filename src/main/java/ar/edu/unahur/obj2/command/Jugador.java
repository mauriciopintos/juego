package ar.edu.unahur.obj2.command;

public class Jugador {
    private Integer posX;
    private Integer posY;
    private Integer cantMovimientos =0;
    
    public Jugador(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public Integer getCantMovimientos() {
        return cantMovimientos;
    }
    

    public void avanzar(){ posX++;} // posX = posX + 1
    public void retroceder(){ posX--;}
    public void subir(){ posY++;}
    public void bajar(){ posY--;}

    public void incMovimientos(){ cantMovimientos++;}

    public void reset(){ 
        posX = 0;
        posY = 0;
        cantMovimientos = 0;
    }

    @Override
    public String toString() {
        return "Jugador [posX=" + posX + ", posY=" + posY + ", cantMovimientos=" + cantMovimientos + "]";
    }

}
