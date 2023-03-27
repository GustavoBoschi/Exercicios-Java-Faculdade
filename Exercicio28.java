package exercicio28;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 0, o = 1;
        int[] numero = new int[10];

        while (i < 10) {
            System.out.printf("Digite seu %d numero: ", i + 1);
            numero[i] = entrada.nextInt();
            i++;
        }

        int menor = numero[0];
        int indicemenor = 0;
        while (o < 10) {

            if (numero[o] < menor) {
                menor = numero[o];
                indicemenor = o;
            }
            o++;
        }
        
        System.out.printf("O menor numero é %d que está localizado no indice %d\n", menor, indicemenor );
        
        entrada.close();

    }

}
