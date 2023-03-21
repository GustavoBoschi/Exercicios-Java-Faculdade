package exercicio26;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double i = 1.50;
        double f = 1.10;
        int anos = 0;
        
        System.out.printf("Fesliberto atualmente possui %.2f e é menor que Anacleto que possui %.2f\n", f, i);

        while (f < i) {
            //Caso queira acompanhar o crescimento dos dois
            // System.out.printf("Felisberto possui %.2f\n", f);
            // System.out.printf("Anacleto possui %.2f\n", i);
            f = f + 0.03;
            i = i + 0.02;
            anos++;

        }

        System.out.printf("Depois de muito tempo. Felisberto agora possui %.2f e demorou %d anos para passar Anacleto no tamanho\n", f, anos);

        entrada.close();

    }

}
