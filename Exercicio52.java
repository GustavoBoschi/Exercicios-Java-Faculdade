package exercicio52;

public class Exercicio52 {

    public static void main(String[] args) {

        int numeros[][] = {
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1}};
        
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("\t0\t1\t2\t3");
                    System.out.println("0\t" + numeros[0][0] + "\t" + numeros[0][1] + "\t" + numeros[0][2] + "\t" + numeros[0][3]);
                    System.out.println("1\t" + numeros[1][0] + "\t" + numeros[1][1] + "\t" + numeros[1][2] + "\t" + numeros[1][3]);
                    System.out.println("2\t" + numeros[2][0] + "\t" + numeros[2][1] + "\t" + numeros[2][2] + "\t" + numeros[2][3]);
                    System.out.println("3\t" + numeros[3][0] + "\t" + numeros[3][1] + "\t" + numeros[3][2] + "\t" + numeros[3][3]);
                    break;

                }

            }
        }

        
        
        }
    
    }
