package exercicio41;

import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[7];
        int vetorB[] = new int[7];
        int vetorC[] = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o seu %d numero do Vetor A: ", i + 1);
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o seu %d numero do Vetor B: ", i + 1);
            vetorB[i] = entrada.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < 7; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.printf("O Indice %d do Vetor A possui: %d\n"
                    + "O Indice %d do Vetor B possui: %d\n "
                    + "A subtração deles gera o Vetor C "
                    + "que no Indice %d possui: %d\n", i, vetorA[i], i, vetorB[i], i, vetorC[i]);

        }

        entrada.close();

    }

}
