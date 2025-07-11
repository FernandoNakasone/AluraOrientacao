package exercicios_exemplos.aula4;

public class ProdutoFisico implements Calculavel{

    private String nome;
    private double preco;

    public ProdutoFisico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

        taxaAdicional = 10;
        desconto = (preco + taxaAdicional) * 0.10;
        precoFinal = preco + taxaAdicional - desconto;
        return precoFinal;
    }
}
