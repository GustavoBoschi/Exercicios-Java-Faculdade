package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        System.out.print("Digite um numero inteiro: ");
        numero = entrada.nextInt();
        
        if (numero>49 && numero<99){
            System.out.println("Pertence ao intervalo");
    }else{
            System.out.println("Não pertence ao intervalo");
        }
     
    }
    
}
