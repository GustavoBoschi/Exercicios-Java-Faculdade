package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int idade;
        
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        
        if (idade < 6){
            System.out.println("Sua categoria é infantil");
            
        }else if (idade > 6 && idade < 10 ){
            System.out.println("Sua categoria é juvenil");
            
        }else if (idade > 10 && idade < 15){
            System.out.println("Sua categoria é sub-15");
            
        }else{
            System.out.println("Voce não está listado em nenhuma categoria");
            
        }
       

    }
    
}
