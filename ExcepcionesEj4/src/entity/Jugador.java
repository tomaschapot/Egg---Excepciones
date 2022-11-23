package entity;

public class Jugador {

    private Integer numeroElegido;
    private Integer cantidadErrores;

    public Jugador() {

    }

    ;

    public Jugador(Integer numeroElegido, Integer cantidadErrores) {
        this.numeroElegido = numeroElegido;
        this.cantidadErrores = cantidadErrores;
    }

    public Integer getNumeroElegido() {
        return numeroElegido;
    }

    public void setNumeroElegido(Integer numeroElegido) {
        this.numeroElegido = numeroElegido;
    }

    public Integer getCantidadErrores() {
        return cantidadErrores;
    }

    public void setCantidadErrores(Integer cantidadErrores) {
        this.cantidadErrores = cantidadErrores;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numeroElegido=" + numeroElegido + ", cantidadErrores=" + cantidadErrores + '}';
    }

}
