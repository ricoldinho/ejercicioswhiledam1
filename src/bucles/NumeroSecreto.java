package bucles;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    //EL USUARIO TIENE QUE ADIVINAR EL NUMERO SECRETO
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tienes 3 intentos:");

        int vidas = 3;
        int numeroSecreto = random.nextInt(51);
        int numeroUsuario = 0;
        while(vidas > 0){
            do{
                System.out.println("Adivina el numero secreto: (0-50)");
                numeroUsuario = kb.nextInt();
            }while(numeroUsuario<0 || numeroUsuario>50);
            if(numeroUsuario != numeroSecreto){
                System.out.println("Fallaste el número secreto");
                vidas--;
                if(vidas == 0){
                    System.out.println("Has agotado el número de vidas, has perdido");
                    System.out.println("El numero secreto era: " + numeroSecreto);
                }else{
                    System.out.println("Te quedan " + vidas + " vidas");
                }
            }else{
                vidas = 0;
                System.out.println("Has ganado, el numero secreto era: " + numeroSecreto);
            }
        }
    }
}
