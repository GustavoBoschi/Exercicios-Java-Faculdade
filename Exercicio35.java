package exercicio35;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char[] letras = new char[15];

        for (int i = 0; i < 15; i++) {
            System.out.printf("Digite sua %d letra: ", i + 1);
            letras[i] = entrada.next().charAt(0);

        }

        for (int i = 14; i >= 0; i--){
            System.out.printf("A ordem inversa das letras digitadas são %c\n", letras[i]);

        }

        entrada.close();

    }

}
