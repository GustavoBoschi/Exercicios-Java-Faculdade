package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Insira sua idade para saber sua categoria: ");
        idade = entrada.nextInt();
        
        if (idade<5){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � Beb�");
            
        }else if ((idade>=5) && (idade<=7)){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � Infantil A");
            
        }else if ((idade>=8) && (idade<=10)){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � Infantil B");
            
        }else if ((idade>=11) && (idade<=13)){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � Juvenil A");
            
        }else if ((idade>=14) && (idade<=17)){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � Juvenil B");
            
        }else if (idade>=18){
            System.out.println("Voc� possui "+idade+" anos, sua categoria � S�nior");
        }
    }
    
}
