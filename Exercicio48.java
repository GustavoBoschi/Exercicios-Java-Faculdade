package exercicio48;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palavras[][] = new String[1][2];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite a sua %da. palavra: ", j + 1);
                palavras[i][j] = entrada.nextLine();

            }

        }

        boolean iguais = palavras[0][0].equals(palavras[0][1]);

        if (iguais) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
        }

        entrada.close();

    }

}
