package exercicio44;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int objetos[] = new int[10];
        double precos[] = new double[10];
        double resultPrecos[] = new double[10];
        double totalObjetos = 0, totalVendas = 0, comissao1, comissao2;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe quantas quantidades foram vendidas do %d objeto: ", i + 1);
            objetos[i] = entrada.nextInt();

        }

        System.out.println("");

        System.out.printf("Informe os preços dos objetos vendidos:\n");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Qual o valor do %d objeto: ", i + 1);
            precos[i] = entrada.nextDouble();

        }

        for (int i = 0; i < 10; i++) {
            resultPrecos[i] = objetos[i] * precos[i];
            totalObjetos = totalObjetos + objetos[i];
            totalVendas = totalVendas + resultPrecos[i];

        }

        System.out.println("");

        System.out.printf("Relatorio:\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("o %d objeto teve %d unidades vendidas, cada uma custando %.2f reais\n"
                    + "", i + 1, objetos[i], precos[i]);
            System.out.printf("Tendo seu valor total de: %.2f reais\n"
                    + "", resultPrecos[i]);
            System.out.println("");
        }

        System.out.printf("O valor geral das vendas foi de: %.2f reais\n", totalVendas);

        int maior = objetos[0];
        int indiceMaior = 0;
        for (int i = 0; i < 10; i++) {
            if (objetos[i] > maior) {
                maior = objetos[i];
                indiceMaior = i;
            }
        }
        System.out.println("");
        System.out.printf("O objeto mais vendido foi o %d com %d unidades vendidas\n"
                + "", indiceMaior + 1, maior);

        comissao1 = 0.05 * totalVendas;
        comissao2 = 545.00 + comissao1;

        System.out.println("");
        System.out.printf("Com o salario fixo de R$ 545,00 e um acressimo de 5%% em "
                + "cima das vendas totais\n"
                + "Você obteve um acrécimo de: R$ %.2f\n"
                + "Portanto você receberá R$ %.2f esse mês\n", comissao1, comissao2);

        entrada.close();

    }

}
