package aulas.aula_4.br.alura.screenmatch.calculo;

import aulas.aula_4.br.alura.screenmatch.modelos3.Titulo2;

public class CalculadoraDeTempo2 {
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

    public void inclui(Titulo2 t){
        System.out.println("Adicionando duração em minuts de " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
