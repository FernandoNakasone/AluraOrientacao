package desafio.br.alura.minhasmusicas.modelos;

public class Podcast extends Audio{

    private String host;
    private String descricao;

    public Podcast(String titulo, double duracao, String host, String descricao) {
        super(titulo, duracao);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getClassificacao() {
        int classificacao = 0;

        if(getCurtidas() != 0) {
            if (getCurtidas() > 1 && getCurtidas() <= 100) {
                classificacao = 1;
            } else if (getCurtidas() > 100 && getCurtidas() <= 200) {
                classificacao = 2;
            } else if (getCurtidas() > 200 && getCurtidas() <= 300) {
                classificacao = 3;
            } else if (getCurtidas() > 300 && getCurtidas() <= 400) {
                classificacao = 4;
            } else if (getCurtidas() > 400 && getCurtidas() <= 500) {
                classificacao = 5;
            } else if (getCurtidas() > 500 && getCurtidas() <= 600) {
                classificacao = 6;
            } else if (getCurtidas() > 600 && getCurtidas() <= 700) {
                classificacao = 7;
            } else if (getCurtidas() > 700 && getCurtidas() <= 800) {
                classificacao = 8;
            } else if (getCurtidas() > 800 && getCurtidas() <= 900) {
                classificacao = 9;
            } else {
                classificacao = 10;
            }
        }

        return classificacao;
    }

    public String toString(){
        String aux = "";
        aux+= "Titulo:" + getTitulo() + "\n";
        aux+= "Host:" + host  + "\n";
        aux+= "Descrição:" + descricao + "\n";
        aux+= "Duração:" + getDuracao() + "\n";
        aux+= "Reproduções:" + getTotalDeReproducoes() + "\n";
        aux+= "Curtidas" + getCurtidas() + "\n";
        aux+= "Classificação:" + classifica(getClassificacao()) + "\n";

        return  aux;
    }
}
