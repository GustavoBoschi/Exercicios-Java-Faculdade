package exercicio38;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor da %da. linha da %da. coluna: ", i+1, j+1);
                numeros[i][j] = entrada.nextInt();
                
            }

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("O valor da "+(i+1)+"a. linha da "+(j+1)+"a. coluna é: " +numeros[i][j]);

            }

        }
        entrada.close();
    }

}
