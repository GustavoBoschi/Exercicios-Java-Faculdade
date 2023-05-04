package exercicio59;

import java.util.Scanner;

public class Exercicio59 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alarme1, alarme2;
        int horas = 1;

        System.out.print("Informe o tempo de disparo do primeiro alarme: ");
        alarme1 = entrada.nextInt();
        
        System.out.print("Informe o tempo de disparo do segundo alarme: ");
        alarme2 = entrada.nextInt();
        
        while (horas % alarme1 != 0 || horas % alarme2 != 0) {
            horas++;
        }
        
        System.out.printf("O tempo mínimo para que os dois alarmes disparem simultaneamente é: %d horas\n", horas);
        
        
    }

}
