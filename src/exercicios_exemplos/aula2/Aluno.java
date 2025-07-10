package exercicios_exemplos.aula2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularMedia(){
        int numNotas = 0;
        double totalNotas = 0;
        for(double n : notas){
            totalNotas+= n;
            numNotas++;
        }

        return totalNotas / numNotas;
    }
}
