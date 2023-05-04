package exercicio56;

import java.util.Scanner;

public class Exercicio56 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o %d nome: ", i + 1);
            nomes[i] = entrada.next();
        }

        System.out.println("");
        System.out.println("A ordem inversa dos nomes são: ");

        for (int i = 3; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        System.out.println("");
        System.out.println("Os nomes invertidos são: ");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = nomes[linha].length() - 1; coluna >= 0; coluna--) {
                System.out.print(nomes[linha].charAt(coluna));
            }
            System.out.println("");
        }

        entrada.close();

    }

}
