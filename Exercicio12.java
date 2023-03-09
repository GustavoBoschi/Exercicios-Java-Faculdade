package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner (System.in);
        
         Double salario, anos, vinte, dez;
        
         System.out.print("Insira aqui seu salário: ");
         salario = entrada.nextDouble();
         
         System.out.print("Insira quantos anos você trabalha aqui: ");
         anos = entrada.nextDouble();
         
         if (anos>=5){
             vinte = (salario * 0.20);
            
             System.out.println("Seu bônus é de "+vinte+" reais");
             
         }else{
             dez = (salario * 0.10);
             
             System.out.println("Seu bônus é de "+dez+" reais");
         }
   

    }
    
}
