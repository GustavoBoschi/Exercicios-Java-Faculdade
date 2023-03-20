package exercicio23;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double i = 10;

        while (i <= 20) {
            double metade = i / 2.0;
            System.out.printf("%.2f\n", metade);
            i++;

        }
        entrada.close();
    }

}
