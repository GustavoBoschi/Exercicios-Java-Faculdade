package exercicio33;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade, idadesomada = 0;
        double media;

        for (int d = 0; d < 5; d++) {
            System.out.print("Digite a " + (d + 1) + " idade: ");
            idade = entrada.nextInt();

            idadesomada += idade;

        }

        media = idadesomada / 5;

        System.out.printf("A soma das idades possui a media de %.2f\n", media);

        entrada.close();

    }

}
