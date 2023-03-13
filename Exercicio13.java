package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        Double altura, resultado1, resultado2;
        
        System.out.printf("Digite seu sexo (M/F): ");
        char sexo = entrada.next().charAt(0);
        
        System.out.printf("Digite sua altura (em metros): ");
        altura = entrada.nextDouble();
        
        if (sexo == 'M'){
        
            System.out.printf("Seu peso ideal é de %.1f kg", ((72.7*altura)-58));
        }else if (sexo == 'F') {
            
            System.out.printf("Seu peso ideal é de %.1f kg", ((62.1*altura)-44.7));
        }else 
            
            System.out.println("Os dados apresentados são invalidos, tente novamente");

    }
    
}
