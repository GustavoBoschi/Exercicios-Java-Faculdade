package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int n1, n2, resultado;
        
        System.out.print("Escreva seu primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Escreva seu segundo numero: ");
        n2 = entrada.nextInt();
        
        if (n1>n2){
            System.out.println("A ordem decrescente dos numeros é: "+n1+"-"+n2);
                          
        }else{
            System.out.println("A ordem decrescente dos numeros é: "+n2+"-"+n1);
        }
        
    }
    
}
