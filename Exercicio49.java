package exercicio49;

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numerosMatriz[][] = new int[3][3];
        int numerosVetor[] = new int[3];
        int resultados[][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o %d valor do Vetor: ", i+1);
            numerosVetor[i] = entrada.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da %da. linha da %da. coluna: ", i + 1, j + 1);
                numerosMatriz[i][j] = entrada.nextInt();
                
            }
            
        }
        
        System.out.println("");
        System.out.println("O valor da Multiplicação do Vetor pelas colunas da Matriz é");
            for (int i = 0; i < 3; i++) {
                //resultados[i][j] = numerosMatriz[i][j]*numerosVetor[i];
                resultados[i][0] = numerosMatriz[i][0]*numerosVetor[0];                
                System.out.printf("%da. linha, %da. coluna, vezes o primeiro indice do vetor: %d\n", i+1, 1, resultados[i][0]);
            }
        
        System.out.println("");
       
            for (int i = 0; i < 3; i++) {
                //resultados[i][j] = numerosMatriz[i][j]*numerosVetor[i];
                resultados[i][1] = numerosMatriz[i][1]*numerosVetor[1];                
                System.out.printf("%da. linha, %da. coluna, vezes o segundo indice do vetor: %d\n", i+1, 2, resultados[i][1]);
            }
        
         System.out.println("");
         
            for (int i = 0; i < 3; i++) {
                //resultados[i][j] = numerosMatriz[i][j]*numerosVetor[i];
                resultados[i][2] = numerosMatriz[i][2]*numerosVetor[2];                
                System.out.printf("%da. linha, %da. coluna, vezes o terceiro indice do vetor: %d\n", i+1, 3, resultados[i][2]);
            }
        
        entrada.close();

    }

}
