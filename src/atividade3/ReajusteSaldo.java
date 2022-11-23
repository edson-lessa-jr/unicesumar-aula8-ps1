package atividade3;

import javax.swing.*;
import java.text.ParseException;

public class ReajusteSaldo {
    public static void main(String[] args) {
        try {
            Double saldo = coletarSaldo();
            System.out.printf("O reajuste do R$ %f é de R$ %f", saldo, (saldo*1.01));
        } catch (NumberFormatException e){
            System.out.println("Erro no formato do número");
        }
    }

    private static double coletarSaldo(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo"));
    }
}
