package exercicio37;

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        int a1 = 0, b1 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite seu %d numero do Vator A: ", i + 1);
            a[i] = entrada.nextInt();

        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite seu %d numero do Vetor B: ", i + 1);
            b[i] = entrada.nextInt();

        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                c[i] = a[a1];
                a1++;
            } else {
                c[i] = b[b1];
                b1++;
            }

        }
            System.out.print("A ordem intercalada dos vetores é: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i]+" ");

        }

        entrada.close();
    }

}
