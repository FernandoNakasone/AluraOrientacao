package aulas.aula_4.br.alura.screenmatch.modelos3;

import aulas.aula_4.br.alura.screenmatch.calculo.Classificavel;

public class Filme4 extends Titulo2 implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
