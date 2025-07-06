package aula_1;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        Filme filme1 = new Filme();

        filme1.nome = "O poderoso chefão";
        filme1.anoDeLancamento = 1972;
        filme1.duracaoEmMinutos = 180;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Soma das avaliações:" + filme1.somaDasAvaliacao);
        System.out.println("Total de avaliações:" + filme1.totalDeAvaliacoes);
        System.out.println("Média:" + dF.format(filme1.pegaMedia()));
    }
}
