package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        int n1, n2, resultado;
        
        System.out.print("Escreva seu primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Escreva seu segundo numero: ");
        n2 = entrada.nextInt();
        
        if (n1==n2) {
            System.out.println("Seus numeros sao iguais");
            
        }else{
            if (n1>n2)
           resultado = n1-n2;
            else
            resultado = n2-n1;
            
                  System.out.println("A diferenca entre os dois numeros é de "+resultado);
                    
        }
    }
    
}
