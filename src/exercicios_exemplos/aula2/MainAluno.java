package exercicios_exemplos.aula2;

import java.text.DecimalFormat;

public class MainAluno {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        Aluno aluno = new Aluno();

        aluno.setNome("Fernando");
        aluno.adicionarNota(9.4);
        aluno.adicionarNota(10);
        aluno.adicionarNota(7.9);

        System.out.println("A média final do aluno:" + aluno.getNome() + " é de: " + dF.format(aluno.calcularMedia()));
    }
}
