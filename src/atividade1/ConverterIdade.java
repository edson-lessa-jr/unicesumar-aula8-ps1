package atividade1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterIdade {
    public static void main(String[] args) {
        try {
            estrategia1();
            estrategia2();
        } catch (InputMismatchException e){
            System.out.println("Informe números inteirros");
        } catch (NumberFormatException e){
            System.out.println("Infome os dados no formato indicado");
        } catch (Exception e){
            System.out.println("Ocorreu um erro desconhecido");
            System.out.println(e.getMessage());
        }
    }

    private static void estrategia2() {
        System.out.println("Informe sua idade como ano;mês;dia");
        Scanner scanner = new Scanner(System.in);
        String dados = scanner.nextLine();
        String[] arrayString = dados.split(";");
        int ano = Integer.parseInt(arrayString[0]);
        int mes = Integer.parseInt(arrayString[1]);
        int dias = Integer.parseInt(arrayString[2]);
        resultado(ano , mes, dias);
    }

    private static void resultado(int ano, int mes, int dias) {
        System.out.println("Você tem " + (ano * 365) + (mes * 30) + dias + " Dias");
    }

    private static void estrategia1() {
        int ano = coletarDados("Informe quantos anos você tem");
        int mes = coletarDados("Informe quantos meses você tem");
        int dias = coletarDados("Informe quantos dias você tem");
        resultado(ano , mes, dias);
    }

    private static int coletarDados(String mensagem) {
        System.out.println(mensagem);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
