package exercicio40;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.println("Numero: " + i);

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz buzz");

            }

        }
        
        entrada.close();
        
    }

}
