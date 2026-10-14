package bucles;

import java.util.Scanner;

public class ValidacionNotaCine {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ponle una nota entre 0 y 10 a Dune: ");
        double nota = teclado.nextDouble();

        while (nota < 0 || nota > 10){
            System.out.println("Nota introducida NO VALIDA");
            System.out.println("Vuelve a introducir la nota:");
            nota = teclado.nextDouble();
        }
        System.out.println("Estoy fuera del bucle");
    }
}
