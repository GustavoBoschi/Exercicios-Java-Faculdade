package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero, i = 0;
        int todos = 0;
        
        while (i<5){
            System.out.print("Escreva o "+(i+1)+" numero: ");
            numero = entrada.nextInt();
            todos = todos + numero;
            i++;
           
        }
        System.out.printf("A somatoria dos seus numeros é: %d\n",todos);
       

    }

}
