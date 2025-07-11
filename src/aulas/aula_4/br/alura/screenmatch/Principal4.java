package aulas.aula_4.br.alura.screenmatch;


import aulas.aula_4.br.alura.screenmatch.calculo.FiltroRecomendacao;
import aulas.aula_4.br.alura.screenmatch.calculo.CalculadoraDeTempo2;
import aulas.aula_4.br.alura.screenmatch.modelos3.Episodio;
import aulas.aula_4.br.alura.screenmatch.modelos3.Filme4;
import aulas.aula_4.br.alura.screenmatch.modelos3.Serie2;

import java.text.DecimalFormat;

public class Principal4 {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        Filme4 filme1 = new Filme4();

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

        Serie2 serie1 = new Serie2();

        serie1.setNome("Stranger Things");
        serie1.setAnoDeLancamento(2016);
        serie1.setTemporadas(5);
        serie1.setEpisodiasPorTemporada(9);
        serie1.setMinutosPorEpisodios(50);

        serie1.exibeFichaTecnica();
        System.out.println("Duração em minutos do filme:" + serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo2 calculadora = new CalculadoraDeTempo2();
        calculadora.inclui(filme1);
        System.out.println(calculadora.getTempoTotal());

        Filme4 filme2 = new Filme4();

        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(160);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie1);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

    }
}
