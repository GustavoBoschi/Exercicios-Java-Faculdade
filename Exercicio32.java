package exercicio32;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, result;

        System.out.print("Digite um valor entre 1 a 10: ");
        num = entrada.nextInt();

        if (num >= 1 && num <= 10) {

            for (int i = 1; i <= 10; i++) {
                result = (num * i);
                System.out.printf("%d X %d = %d\n", num, i, result);

            }

        } else {
            System.out.println("Tente novamente e digite um numero entre 1 e 10");

        }
        
        entrada.close();
    }

}
