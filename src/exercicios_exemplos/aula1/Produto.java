package exercicios_exemplos.aula1;

public class Produto {

    //Código
    /*     String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
        } else {
            double precoFinal = preco;
        }
    }
     */
    //Erro: O método pegaPrecoFinal não retorna nenhum valor

    //Correção
    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        double precoFinal = 0;
        if (pagamentoViaPix == true) {
             precoFinal = preco - descontoParaPix;
        } else {
             precoFinal = preco;
        }
        return precoFinal;
    }

}

