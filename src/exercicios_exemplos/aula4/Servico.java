package exercicios_exemplos.aula4;

public class Servico implements Vendavel{

    private String nome;
    private double precoHora;
    private double horas;
    private boolean desconto;

    public Servico(String nome, double precoHora, double horas, boolean desconto) {
        this.nome = nome;
        this.precoHora = precoHora;
        this.horas = horas;
        this.desconto = desconto;
    }



    @Override
    public double calculaPrecoTotal() {
        double precoTotal;

        if(desconto){
            precoTotal = precoHora * horas - (precoHora * horas * 0.10);
        } else {
            precoTotal = precoHora * horas;
        }

        return precoTotal;
    }
}
