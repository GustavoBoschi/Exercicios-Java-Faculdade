package exercicio25;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        int numero, um = 1;
        
        System.out.print("Digite um numero inteiro: ");
        numero = entrada.nextInt();
        
        while (i<=numero){
            int val = um * 2;
            System.out.printf("%d\n", val);
            um = um * 2;
            i++;
            
        }
        
        entrada.close();
    }

}
