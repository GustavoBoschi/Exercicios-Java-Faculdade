package exercicio36;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.printf("Digite seu %d numero: ", i + 1);
            a[i] = entrada.nextInt();
            //b[i] = a[i]*3; pode ser colocado aqui também.

        }

        for (int i = 0; i < 8; i++) {
            b[i] = a[i] * 3;
            System.out.printf("O triplo do %d numero é: %d\n", i+1, b[i]);

        }
        entrada.close();
    }

}
