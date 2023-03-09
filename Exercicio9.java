package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        
        int n1, n2;
        
        System.out.print("Digite um numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite um outro numero: ");
        n2 = entrada.nextInt();
        
        if (n1>n2){
            System.out.println("O numero "+n1+" é maior que numero "+n2);
            
        }else if (n2>n1){
            System.out.println("O numero"+n2+" é maior que o numero"+n1);
            
        }
        
        
        
    }
    
}
