package imc;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float peso, altura, imc;
        
        System.out.print("Insira seu peso (Kg): ");
        peso = entrada.nextFloat();
        
        System.out.print("Insira sua altura (Metros): ");
        altura = entrada.nextFloat();
        
        imc = peso/(altura*altura);
        
        System.out.printf("Seu IMC é de = %.1f\n ", imc);
        
        
    }
    
}
