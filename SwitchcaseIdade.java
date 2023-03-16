package switchcaseidade;

import java.util.Scanner;

public class SwitchcaseIdade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, i;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        switch (idade) {
            case 1, 2, 3, 4, 5:
                System.out.println("Sua categoria é Infantil");
                break;
            case 6, 7, 8, 9, 10:
                System.out.println("Sua categoria é Juvenil");
                break;
            case 11, 12, 13, 14, 15:
                System.out.println("Sua categoria é Sub-15");
                break;
            default:
                System.out.println("Não esta litado em nenhuma categoria");
        }
        for (i=1;i<=20;i++)
            System.out.printf("O valor da I é %d\n",i);
 
    }
    
}
