package aulas.aula_2;

import aulas.aula_2.br.alura.screenmatch.modelos.Filme2;

import java.text.DecimalFormat;

public class Principal2 {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        Filme2 filme1 = new Filme2();

        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Soma das avaliações:" + filme1.getSomaDasAvaliacao());
        System.out.println("Total de avaliações:" + filme1.getTotalDeAvaliacoes());
        System.out.println("Média:" + dF.format(filme1.pegaMedia()));
    }
}
