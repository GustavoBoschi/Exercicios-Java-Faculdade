package exercicio42;

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int vetorA [] = new int[4];
        int vetorB [] = new int [7];
        int vetorC [] = new int [11];
        int a = 0, b = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o %d numero do Vetor A: ", i+1);
            vetorA[i] = entrada.nextInt();
            
        }
        
        System.out.println("");
        
         for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o %d numero do Vetor B: ", i+1);
            vetorB[i] = entrada.nextInt();
            
        }
         
         System.out.println("");
         
          for (int i = 0; i < 11; i++) {
              if (i<4){
                  vetorC[i] = vetorA[a];
                  a++;
                  
              }else{
                  vetorC[i] = vetorB[b];
                  b++;
                  
              } 
        }
          System.out.printf("A junção do Vetor A e B cria o Vetor C em que os "
                  + "numeros são: ");
          for (int i = 0; i < 11; i++) {
              System.out.print(vetorC[i]+" ");
            
        }
          
          System.out.println("");

          entrada.close();
          
    }

}
