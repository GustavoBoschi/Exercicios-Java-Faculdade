package exercicio54;

import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String alunos[] = new String[5];
        double notas[] = new double[5];
        double medias = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome do %d aluno: ", i + 1);
            alunos[i] = entrada.nextLine();

        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a média final do %s: ", alunos[i]);
            notas[i] = entrada.nextDouble();
            medias += notas[i];

        }

        medias = medias / 5;
        System.out.println("");
        System.out.printf("A média da turma é %.1f\n",medias);
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            if (notas[i] >= medias) {
                System.out.printf("Parabéns %s\n",alunos[i]);
            }else{
                System.out.printf("Estude mais %s\n",alunos[i]);
            }
        }
        
        entrada.close();

    }

}
