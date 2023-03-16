package exercicio20;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        int i = 0;
        double notas, medias = 0;
        
        while (i<5){
            System.out.print("Digite a nota do "+(i+1)+" aluno: ");
            notas = entrada.nextDouble();
            medias = medias + notas;
            i++;
          
        }
        System.out.println("A média dos alunos é: "+(medias/i));

    }
    
}
