package exercicio47;

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[][] = new int[3][3];
        int multiplicados[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da %da. linha da %da. coluna: ", i + 1, j + 1);
                numeros[i][j] = entrada.nextInt();

            }

        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiplicados[i][j] = numeros[i][j]*5;
                
            }
            
        }
        
        System.out.println("");
        System.out.printf("Os valores dessa matriz multiplicados por 5 são:\n"); 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d - ", multiplicados[i][j]);
                            
            }
            
        }
        
        entrada.close();

    }

}
