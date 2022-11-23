package service;

import entity.Juego;

public class JuegoService {

    ComputadoraService cS = new ComputadoraService();
    JugadorService jS = new JugadorService();

    public JuegoService() {
    }

    public void iniciarJuego() {

        System.out.println("Bienvenido al Juego");

        Juego j1 = new Juego();

        j1.getC1().setNumeroElegido(cS.generateRandomNumber());

        compareNumbers(j1);

    }

    public void compareNumbers(Juego j1) {

        Integer compNumber = j1.getC1().getNumeroElegido();
        System.out.println(compNumber);
        Integer numeroElegido = 0;

        while (numeroElegido != compNumber) {

            try {
                numeroElegido = jS.elegirNumero();
                j1.getJ1().setNumeroElegido(numeroElegido);

            } catch (Exception e) {
                System.out.println("Invalid input");

            }

        }

    }

}
