package atividade4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
        try {
            double[][] pecas = new double[2][2];
            /*pecas[0][0] = 1;
            pecas[0][1] = 32.4;*/
            final double alicotaIPI = 24.75;
            for (int i = 0; i < pecas.length; i++) {
                System.out.println("Informe os dados da peça com código " + (i + 1));
                /* na primeira posição 0 eu quero a quantidade */
                pecas[i][0] = coletaDados("Informe a quantidade");
                /* na segunda posição tem o valor */
                pecas[i][1] = coletaDados("Informe o valor");
            }
            double valorFinal = 0;
            for (int i = 0; i < pecas.length; i++) {
                valorFinal += pecas[i][0] * pecas[i][1];
            }
            System.out.println("Valor dos produtos " + valorFinal);
            System.out.println("Valor final com IPI " + valorFinal * (alicotaIPI / 100 + 1));
        } catch (InputMismatchException e) {
            System.out.println("Dados informado é inválido");
        } catch (Exception e){
            System.out.println("Houve um erro não identificado: "+e.getMessage());

        }
    }

    private static double coletaDados(String mensagem) {
        System.out.println("Informe a quantidade");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
