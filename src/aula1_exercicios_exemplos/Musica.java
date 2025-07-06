package aula1_exercicios_exemplos;

public class Musica {
    String nome;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome:" + nome);
        System.out.println("Artista:" + artista);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacao / numAvaliacoes;
    }
}
