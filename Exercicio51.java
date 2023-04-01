package exercicio51;

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[][] = new int[4][4];
        int maiores = 0;
        int menores = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o valor da %da. linha da %da. coluna: ", i + 1, j + 1);
                numeros[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (numeros[i][j] >= 10) {
                    maiores += 1;

                } else {
                    menores += 1;
                }

            }
        }

        System.out.println("");
        System.out.printf("Essa matriz possui %d valores maiores ou iguais a 10\n", maiores);
        System.out.printf("Essa matriz possui %d valores menores do que 10\n", menores);
        System.out.println("");

        System.out.println("Mapa da Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("\t0\t1\t2\t3");
                    System.out.println("0\t" + numeros[0][0] + "\t" + numeros[0][1] + "\t" + numeros[0][2] + "\t" + numeros[0][3]);
                    System.out.println("1\t" + numeros[1][0] + "\t" + numeros[1][1] + "\t" + numeros[1][2] + "\t" + numeros[1][3]);
                    System.out.println("2\t" + numeros[2][0] + "\t" + numeros[2][1] + "\t" + numeros[2][2] + "\t" + numeros[2][3]);
                    System.out.println("3\t" + numeros[3][0] + "\t" + numeros[3][1] + "\t" + numeros[3][2] + "\t" + numeros[3][3]);
                    break;

                }

            }
        }

        entrada.close();

    }

}
