package exercicio57;

import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String alunos[][] = new String[1][3];
        double notas[][] = new double [3][2];
        double medias[] = new double [3];
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o nome do %d aluno: ", j+1);
                alunos[i][j] = entrada.nextLine();
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite a N%d do %s: ", j+1, alunos[0][i]);
                notas [i][j] = entrada.nextDouble();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
              medias[i] = (notas[i][0]*0.4)+(notas[i][1]*0.6);
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("A média de %s é %.2f\n", alunos[0][i], medias[i]);
        }
        
        entrada.close();
    }

}
