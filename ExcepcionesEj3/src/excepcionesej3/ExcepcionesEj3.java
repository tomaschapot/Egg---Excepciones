package excepcionesej3;

import entity.DivisionNumero;
import java.util.Scanner;

public class ExcepcionesEj3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Integer numero1;
        Integer numero2;

        try {

            System.out.println("Ingrese el primer numero");
            numero1 = Integer.parseInt(read.next());

            System.out.println("Ingrese el segundo numero");
            numero2 = Integer.parseInt(read.next());

            DivisionNumero ds = new DivisionNumero(numero1, numero2);
            ds.division();

        } catch (NumberFormatException e) {

            System.out.println("Esta mal ingresado el input");

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }

    }
}
