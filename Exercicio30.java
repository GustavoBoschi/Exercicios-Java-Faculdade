package exercicio30;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, result = 1;

        System.out.print("Informe um numero: ");
        num = entrada.nextInt();

        for (int i = num; i >= 1; i--) {
            result = i * result;

        }

        System.out.printf("O fatorial é %d\n", result);
        
        entrada.close();

    }

}
