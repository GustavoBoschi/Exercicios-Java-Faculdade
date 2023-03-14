package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.print("Digite seu primeiro numero: ");
          n1 = entrada.nextInt();
        
        System.out.print("Digite seu segundo numero: ");
          n2 = entrada.nextInt();
        
        System.out.print("Digite seu terceiro numero: ");
          n3 = entrada.nextInt();
          
             if ((n1==n2) && (n1==n3) && (n2==n3)){
              
              System.out.println("Os numeros são iguais");
              
          }if ((n1>n2) && (n1>n3)){
                 System.out.println("O maior numero é: "+n1);
                 
          }else if ((n2>n1) && (n2>n3)){
                 System.out.println("O maior numero é: "+n2);
                 
          }else if ((n3>n1) && (n3>n2)){
                 System.out.println("O maior numero é: "+n3);
             

              
          }
 
    }
    
}
