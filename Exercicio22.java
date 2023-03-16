package exercicio22;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        double hemo;

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        // System.out.print("Você está gravida (S/N)? ");
        //char resposta = entrada.next().charAt(0);
        System.out.print("Digite o seu nivel de hemoglobina em g/gl: ");
        hemo = entrada.nextDouble();

        if (idade >= 2 && idade <= 6) {
            if (hemo >= 11.5 && hemo <= 13.5) {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Está em niveis normais");
            } else {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Possui alterações");
            }
        } else if (idade > 6 && idade <= 12) {
            if (hemo >= 11.5 && hemo <= 15.5) {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Está em niveis normais");

            } else {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Possui alterações");
            }
        } else if (sexo == 'M') {
            if (hemo >= 14 && hemo <= 18) {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Está em niveis normais");
            } else {
                System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Possui alterações");
            }
        } else if (sexo == 'F') {
            System.out.print("Você está gravida (S/N)? ");
            char resposta = entrada.next().charAt(0);
            
            if (resposta == 'S'){
                if(hemo>= 11 && hemo <=11){
                    System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Está em niveis normais");
                }else{
                 System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Possui alterações");   
                }
            }if (resposta == 'N'){
                if (hemo>= 12 && hemo <=16){
                    System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Está em niveis normais");
                }else{
                    System.out.println(nome + " o seu nivel de hemoglobina é de " + hemo + " gl/Dl. Possui alterações");
                }
            }
                

        }else{
            System.out.println("Os dados apresentados são invalidos, tente novamente");
        }

    }

}
