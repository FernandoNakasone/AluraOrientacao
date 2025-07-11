package exercicios_exemplos.aula3;

import java.text.DecimalFormat;

public class Carro {
    protected String modelo;
    protected double[] precos = new double[3];

    public void setPrecos(double ano1, double ano2, double ano3) {
        precos[0] = ano1;
        precos[1] = ano2;
        precos[2] = ano3;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double pegaMenorPreco(){
        double menorPreco = 0;
        for(int i = 0; i< precos.length; i++){
            if(i==0){
                menorPreco = precos[i];
            } else if(menorPreco > precos[i]){
                menorPreco = precos[i];
            }
        }

        return menorPreco;
    }

    public double pegaMaiorPreco(){
        double maiorPreco = 0;

        for(int i = 0; i< precos.length; i++){

            if(maiorPreco < precos[i]){
                maiorPreco = precos[i];
            }
        }
        return maiorPreco;
    }

    public double pegaPrecoMedio(){
        double precoTotal = 0;

        for(int i = 0; i< precos.length; i++){
            precoTotal += precos[i];
        }

        return precoTotal /3;
    }

    public void exibeDetalhes(){
        DecimalFormat dF = new DecimalFormat("R$#,##0.00");
        System.out.println("Maior Preço:" + dF.format(pegaMaiorPreco()));
        System.out.println("Menor Preço:" + dF.format(pegaMenorPreco()));
        System.out.println("Preço médio:" + dF.format(pegaPrecoMedio()));
    }
}
