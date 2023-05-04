package exercicio55;

import java.util.Random;

public class Exercicio55 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numeros[] = new int[15];

        for (int i = 0; i < 15; i++) {
            numeros[i] = aleatorio.nextInt(100);
        }

        int maior = numeros[14];
        int menor = numeros [0];
        
        for (int i = 0; i < 15; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }else if (numeros [i] < menor){
                menor = numeros[i];
            }

        }
        
        System.out.printf("Dentre 15 valores gerados de forma aleatória o maior "
                + "é %d e o menor numero é %d\n", maior, menor);
    }

}
