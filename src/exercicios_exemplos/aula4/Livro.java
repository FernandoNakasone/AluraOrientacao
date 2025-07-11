package exercicios_exemplos.aula4;

public class Livro implements Calculavel{

    private String nome;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal;
        double taxaAdicional, desconto;

        taxaAdicional = 25;
        desconto = (preco + taxaAdicional) * 0.05;

        precoFinal = (preco + taxaAdicional) - desconto;

        return precoFinal;
    }

}
