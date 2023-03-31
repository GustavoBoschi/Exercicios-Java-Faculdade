package exercicio39;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, result1;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o primeiro numero da subtração: ");
            num1 = entrada.nextInt();

            System.out.printf("Digite o seu segundo numero da subtração: ");
            num2 = entrada.nextInt();

            result1 = num1 - num2;

            System.out.printf("O resultado da subtração entre %d e %d é: %d\n", num1, num2, result1);

        }
        
        entrada.close();
        
    }

}
