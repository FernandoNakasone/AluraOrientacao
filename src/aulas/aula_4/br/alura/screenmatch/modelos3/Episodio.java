package aulas.aula_4.br.alura.screenmatch.modelos3;

import aulas.aula_4.br.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie2 serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie2 getSerie() {
        return serie;
    }

    public void setSerie(Serie2 serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
