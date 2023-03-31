package exercicio43;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double alturas[] = new double[8];
        double buscar;

        for (int i = 0; i < 8; i++) {
            System.out.printf("Informe a %da. altura (em metros): ", i + 1);
            alturas[i] = entrada.nextDouble();

        }

        System.out.println("");

        System.out.print("Qual altura deseja procurar? ");
        buscar = entrada.nextDouble();

        System.out.println("");

        int indice = -1;
        double result = 0;

        for (int i = 0; i < 8; i++) {
            if (buscar == alturas[i]) {
                indice = i;
                result = alturas[i];

            }

        }

        if (indice != -1) {
            System.out.printf("A altura que procurava é %.2f e estava no Indice %d\n", result, indice);
        }else{
            System.out.println("A altura não foi encontrada no vetor");
        }

        entrada.close();

    }

}
