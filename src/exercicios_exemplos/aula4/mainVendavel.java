package exercicios_exemplos.aula4;

import java.text.DecimalFormat;

public class mainVendavel {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("R$#,##0.00");
        Produto produto = new Produto("Mesa de plástico",250,10);

        System.out.println("O valor total dos produtos é de:" + dF.format(produto.calculaPrecoTotal()));

        Servico servico = new Servico("Buffet de festa",500,10,false);

        System.out.println("O preço final do serviço é de:" + dF.format(servico.calculaPrecoTotal()));

        Servico servico2 = new Servico("Buffet de festa",500,10,true);

        System.out.println("O preço final do serviço é de:" + dF.format(servico2.calculaPrecoTotal()));
    }
}
