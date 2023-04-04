package exercicio53;

import java.util.Random;

public class Exercicio53 {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int numeros[][] = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                numeros[i][j] = aleatorio.nextInt(100);

            }
        }

        System.out.println("Matriz Aleatoria:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("\t0\t1\t2\t3");
                    System.out.println("0\t" + numeros[0][0] + "\t" + numeros[0][1] + "\t" + numeros[0][2] + "\t" + numeros[0][3]);
                    System.out.println("1\t" + numeros[1][0] + "\t" + numeros[1][1] + "\t" + numeros[1][2] + "\t" + numeros[1][3]);
                    System.out.println("2\t" + numeros[2][0] + "\t" + numeros[2][1] + "\t" + numeros[2][2] + "\t" + numeros[2][3]);
                    System.out.println("3\t" + numeros[3][0] + "\t" + numeros[3][1] + "\t" + numeros[3][2] + "\t" + numeros[3][3]);
                    System.out.println("4\t" + numeros[4][0] + "\t" + numeros[4][1] + "\t" + numeros[4][2] + "\t" + numeros[4][3]);
                    System.out.println("5\t" + numeros[5][0] + "\t" + numeros[5][1] + "\t" + numeros[5][2] + "\t" + numeros[5][3]);
                    System.out.println("6\t" + numeros[6][0] + "\t" + numeros[6][1] + "\t" + numeros[6][2] + "\t" + numeros[6][3]);
                    System.out.println("7\t" + numeros[7][0] + "\t" + numeros[7][1] + "\t" + numeros[7][2] + "\t" + numeros[7][3]);
                    break;

                }

            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (numeros[i][j] % 2 == 0) {
                    numeros[i][j] = 0;

                } else {
                    numeros[i][j] = -1;
                }
            }
        }

        System.out.println("");
        System.out.println("Matriz Substituindo Pares por 0 e Impares por -1:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("\t0\t1\t2\t3");
                    System.out.println("0\t" + numeros[0][0] + "\t" + numeros[0][1] + "\t" + numeros[0][2] + "\t" + numeros[0][3]);
                    System.out.println("1\t" + numeros[1][0] + "\t" + numeros[1][1] + "\t" + numeros[1][2] + "\t" + numeros[1][3]);
                    System.out.println("2\t" + numeros[2][0] + "\t" + numeros[2][1] + "\t" + numeros[2][2] + "\t" + numeros[2][3]);
                    System.out.println("3\t" + numeros[3][0] + "\t" + numeros[3][1] + "\t" + numeros[3][2] + "\t" + numeros[3][3]);
                    System.out.println("4\t" + numeros[4][0] + "\t" + numeros[4][1] + "\t" + numeros[4][2] + "\t" + numeros[4][3]);
                    System.out.println("5\t" + numeros[5][0] + "\t" + numeros[5][1] + "\t" + numeros[5][2] + "\t" + numeros[5][3]);
                    System.out.println("6\t" + numeros[6][0] + "\t" + numeros[6][1] + "\t" + numeros[6][2] + "\t" + numeros[6][3]);
                    System.out.println("7\t" + numeros[7][0] + "\t" + numeros[7][1] + "\t" + numeros[7][2] + "\t" + numeros[7][3]);
                    break;

                }

            }
        }

    }

}
