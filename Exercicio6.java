package exercicio6;

import java.util.Scanner;


public class Exercicio6 {


    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner (System.in);
        
        int numero, resultado;
       
        System.out.print("Insira um numero inteiro: ");
        numero = entrada.nextInt();
        
        if (numero>20){
          resultado = numero/2;
         System.out.println("Seu resultado é: "+resultado);
    }else{
            System.out.println("Seu numero é menor que 20!");
            }
      
        
                
    }
    
}
