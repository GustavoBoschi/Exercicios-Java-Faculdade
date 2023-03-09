package idade;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner (System.in);
        
        int idade;
        
        System.out.print("Quantos anos voce possui? ");
        idade = entrada.nextInt();
        
        if (idade>17){
            System.out.println("Voce é maior de idade!");
        }else{
            System.out.println("Voce ainda é menor de idade");
        }
    }
    
}
