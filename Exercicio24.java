package exercicio24;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, i = 0;
        int menor = Integer.MAX_VALUE;

        while (i < 10) {
            System.out.print("Insira o seu " + (i + 1) + " numero: ");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
                
            }
            i++;
        }
        
        System.out.printf("O menor numero é o %d\n", menor);

        entrada.close();

    }

}
