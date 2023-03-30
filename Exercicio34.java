package exercicio34;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o seu " + (i + 1) + " numero: ");
            num = entrada.nextInt();
            if (num % 2 == 0 && num == 0) {
                par = par + 1;

            } else if (num % 3 == 1) {
                impar = impar + 1;

            }

        }

        System.out.printf("Dos numeros que voce digitou %d são pares\n", par);
        System.out.printf("Dos numeros que voce digitou %d são impares\n", impar);

        entrada.close();

    }

}
