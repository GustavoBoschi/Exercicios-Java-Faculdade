package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Double bruto, prestacao, resultado;
        
        System.out.print("Informe o salario bruto: ");
        bruto = entrada.nextDouble();
        
        System.out.print("Informe o valor da prestacao: ");
        prestacao = entrada.nextDouble();
        
        if (prestacao<=bruto*0.30){
            
            System.out.println("O emprestimo não pode ser concebido");
            
        }else 
            
         System.out.println("O emprestimo pode ser concebido");

    }
    
}
