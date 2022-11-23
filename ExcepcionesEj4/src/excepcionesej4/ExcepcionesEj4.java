package excepcionesej4;

import entity.Juego;
import service.JuegoService;

public class ExcepcionesEj4 {

    public static void main(String[] args) {

        JuegoService jS = new JuegoService();

        jS.iniciarJuego();

    }
}
