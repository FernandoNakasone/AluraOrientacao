package aula1_exercicios_exemplos;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.print("Informe o nome:");
        aluno1.nome = sc.nextLine();

        System.out.print("Informe a idade:");
        aluno1.idade = sc.nextInt();

        aluno1.exibeInformacoes();
    }
}
