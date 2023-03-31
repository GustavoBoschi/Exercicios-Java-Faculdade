package exercicio45;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int inteiros[][] = new int[2][2];
        int total = 0;
        int result[] = new int[2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor da %da. linha da %da. coluna: ", i + 1, j + 1);
                inteiros[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i] += inteiros[i][j];
                //result[i] = result[i] + inteiros[i][j]
                total += inteiros[i][j];
                //total = total + inteiros[i][j]

            }

        }

        for (int i = 0; i < 2; i++) {
            System.out.printf("A soma da linha %d é igual a: %d\n", i+1, result[i]);
        }
        System.out.printf("O total da soma da Matriz é: %d\n", total);
        
        entrada.close();

    }

}
