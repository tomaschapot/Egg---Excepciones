package service;

import entity.Jugador;
import java.util.Scanner;

public class JugadorService {

    private Scanner read;

    public JugadorService() {

        read = new Scanner(System.in).useDelimiter("\n");
    }

    public Integer elegirNumero() {

        System.out.println("Ingrese un numero");
        Integer numeroElegido = (Integer) Integer.parseInt(read.next());

        return numeroElegido;

    }

}
