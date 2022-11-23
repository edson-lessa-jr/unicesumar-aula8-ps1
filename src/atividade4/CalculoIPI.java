package atividade4;

import javax.swing.*;
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
                System.out.println("Informe a quantidade");
                Scanner scanner = new Scanner(System.in);
                pecas[i][0] = scanner.nextDouble();
                /* na segunda posição tem o valor */
                System.out.println("Informe o valor");
                pecas[i][1] = scanner.nextDouble();
            }
            double valorFinal = 0;
            for (int i = 0; i < pecas.length; i++) {
                valorFinal += pecas[i][0] * pecas[i][1];
            }
            System.out.println("Valor dos produtos "+ valorFinal);
            System.out.println("Valor final com IPI "+valorFinal *(alicotaIPI/100+1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
