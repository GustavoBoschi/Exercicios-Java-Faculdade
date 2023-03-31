package exercicio46;

import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palavras[][] = new String[1][3];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a sua %da. palavra: ", j + 1);
                palavras[i][j] = entrada.nextLine();

            }

        }

        for (int j = 2; j >= 0; j--) {
            System.out.println("" + palavras[0][j]);

        }
        
        entrada.close();

    }

}
