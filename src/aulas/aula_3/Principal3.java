package aulas.aula_3;

import aulas.aula_3.br.alura.screenmatch.calculo.CalculadoraDeTempo;
import aulas.aula_3.br.alura.screenmatch.modelos2.Filme3;
import aulas.aula_3.br.alura.screenmatch.modelos2.Serie;

import java.text.DecimalFormat;

public class Principal3 {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        Filme3 filme1 = new Filme3();

        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração em minutos do filme:" + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Soma das avaliações:" + filme1.getSomaDasAvaliacao());
        System.out.println("Total de avaliações:" + filme1.getTotalDeAvaliacoes());
        System.out.println("Média:" + dF.format(filme1.pegaMedia()));

        Serie serie1 = new Serie();

        serie1.setNome("Stranger Things");
        serie1.setAnoDeLancamento(2016);
        serie1.setTemporadas(5);
        serie1.setEpisodiasPorTemporada(9);
        serie1.setMinutosPorEpisodios(50);

        serie1.exibeFichaTecnica();
        System.out.println("Duração em minutos do filme:" + serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        System.out.println(calculadora.getTempoTotal());

        Filme3 filme2 = new Filme3();

        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(160);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());


    }
}
