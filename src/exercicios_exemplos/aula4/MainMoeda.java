package exercicios_exemplos.aula4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainMoeda {

    public static void main(String[] args) {

        DecimalFormat dF = new DecimalFormat("R$#,##0.00");
        Scanner sc = new Scanner(System.in);


        ConversorMoeda converte = new ConversorMoeda();

        System.out.print("Informe um valor em dolár para ser convertido para real:");
        converte.setValorDolar(sc.nextDouble());

        System.out.println("O valor de " + converte.getValorDolar()+ " doláres é de:" + dF.format(converte.converterDolarParaReal()));
    }

}
