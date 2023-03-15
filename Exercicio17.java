package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Double nota1, nota2, nota3, media;
        
        System.out.print("Apresente sua nota do Trabalho de laboratório: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Apresente sua nota da Avaliação semestral: ");
        nota2 = entrada.nextDouble();
        
        System.out.print("Apresente sua nota do Exame Final: ");
        nota3 = entrada.nextDouble();
        
        media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        //((nota1*2)+(nota2*3)+(nota3*5))/10

         if ((media>=8) && (media<=10)){
            System.out.printf("Sua media foi %.2f\n ela segue o conceito A",media);
            
    }else if ((media>=7) && (media<8)){
             System.out.printf("Sua media foi %.2f\n ela segue o conceito B", media);
        
    }else if ((media>=6) && (media<7)){
        System.out.printf("Sua media foi %.2f\n ela segue o conceito C", media);
        
    }else if ((media>=5) && (media<6)){
        System.out.printf("Sua media foi %.2f\n ela segue o conceito D", media);
        
    }else if ((media>=0) && (media<5)){
        System.out.printf("Sua media foi %.2f\n ela segue o conceito E", media);
        
    }else{
             System.out.println("Os dados colocados são invalidos, porfavor, tente novamente");
    }
        
    }
    
}
