package aula_1;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "O poderoso chefão";
        filme1.anoDeLancamento = 1972;
        filme1.duracaoEmMinutos = 180;

        System.out.println(filme1.nome);
        System.out.println(filme1.anoDeLancamento);
    }
}
