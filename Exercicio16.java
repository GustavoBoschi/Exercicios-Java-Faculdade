package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Insira sua idade para saber sua categoria: ");
        idade = entrada.nextInt();
        
        if (idade<5){
            System.out.println("Você possui "+idade+" anos, sua categoria é Bebê");
            
        }else if ((idade>=5) && (idade<=7)){
            System.out.println("Você possui "+idade+" anos, sua categoria é Infantil A");
            
        }else if ((idade>=8) && (idade<=10)){
            System.out.println("Você possui "+idade+" anos, sua categoria é Infantil B");
            
        }else if ((idade>=11) && (idade<=13)){
            System.out.println("Você possui "+idade+" anos, sua categoria é Juvenil A");
            
        }else if ((idade>=14) && (idade<=17)){
            System.out.println("Você possui "+idade+" anos, sua categoria é Juvenil B");
            
        }else if (idade>=18){
            System.out.println("Você possui "+idade+" anos, sua categoria é Sênior");
        }
    }
    
}
