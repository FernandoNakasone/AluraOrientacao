package aulas.aula_3.br.alura.screenmatch.calculo;

import aulas.aula_3.br.alura.screenmatch.modelos2.Filme3;
import aulas.aula_3.br.alura.screenmatch.modelos2.Serie;
import aulas.aula_3.br.alura.screenmatch.modelos2.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

   /* public void inclui(Filme3 f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    } */

    public void inclui(Titulo t){
        System.out.println("Adicionando duração em minuts de " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
