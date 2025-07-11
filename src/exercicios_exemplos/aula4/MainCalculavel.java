package exercicios_exemplos.aula4;

import java.text.DecimalFormat;

public class MainCalculavel {
    public static void main(String[] args) {

        DecimalFormat dF = new DecimalFormat("R$#,##0.00");
        Livro livro = new Livro("Livro A", "B",150);

        System.out.println("o preço final do livro será:" + dF.format(livro.calcularPrecoFinal()));

        ProdutoFisico produto = new ProdutoFisico("Raquete elétrica",50);

        System.out.println("O preço final do produto " + produto.getNome() + " será:" + dF.format(produto.calcularPrecoFinal()));
    }
}
