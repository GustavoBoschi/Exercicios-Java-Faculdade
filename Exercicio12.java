package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner (System.in);
        
         Double salario, anos, vinte, dez;
        
         System.out.print("Insira aqui seu sal�rio: ");
         salario = entrada.nextDouble();
         
         System.out.print("Insira quantos anos voc� trabalha aqui: ");
         anos = entrada.nextDouble();
         
         if (anos>=5){
             vinte = (salario * 0.20);
            
             System.out.println("Seu b�nus � de "+vinte+" reais");
             
         }else{
             dez = (salario * 0.10);
             
             System.out.println("Seu b�nus � de "+dez+" reais");
         }
   

    }
    
}
