package exerciciomediasnotas;

import java.util.Scanner;

public class ExercicioMediasNotas {

    public static void main(String[] args) {
     
           
        Scanner entrada = new Scanner (System.in);
        
        //variaveis
        String nome;
        Double nota1, nota2, media;
     
        //entrada dos dados
        System.out.print("Insira seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Insira sua primeira nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Insira sua segunda nota: ");
        nota2 = entrada.nextDouble();
        
        //processamento
        media = (nota1 + nota2)/2;
        
        //saida dos dados
        System.out.println(nome+" sua média é: "+media);
    }
    
}
