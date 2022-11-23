package entity;

public class Computadora {

    private Integer numeroElegido;

    public Computadora() {
    }

    public Computadora(Integer numeroElegido) {
        this.numeroElegido = numeroElegido;
    }

    public Integer getNumeroElegido() {
        return numeroElegido;
    }

    public void setNumeroElegido(Integer numeroElegido) {
        this.numeroElegido = numeroElegido;
    }

    @Override
    public String toString() {
        return "Computadora{" + "numeroElegido=" + numeroElegido + '}';
    }

}
