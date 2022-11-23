package entity;

public class Juego {

    private Jugador j1;
    private Computadora c1;

    public Juego() {

        j1 = new Jugador();
        c1 = new Computadora();
    }

    public Juego(Jugador j1, Computadora c1) {
        this.j1 = j1;
        this.c1 = c1;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Computadora getC1() {
        return c1;
    }

    public void setC1(Computadora c1) {
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "Juego{" + "j1=" + j1 + ", c1=" + c1 + '}';
    }

}
