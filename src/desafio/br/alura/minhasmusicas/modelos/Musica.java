package desafio.br.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public Musica(String titulo, double duracao, String album, String artista, String genero) {
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int getClassificacao() {
        int classificacao = 0;

        if(getTotalDeReproducoes() != 0) {
            if (getTotalDeReproducoes() > 1 && getTotalDeReproducoes() <= 100) {
                classificacao = 1;
            } else if (getTotalDeReproducoes() > 100 && getTotalDeReproducoes() <= 200) {
                classificacao = 2;
            } else if (getTotalDeReproducoes() > 200 && getTotalDeReproducoes() <= 300) {
                classificacao = 3;
            } else if (getTotalDeReproducoes() > 300 && getTotalDeReproducoes() <= 400) {
                classificacao = 4;
            } else if (getTotalDeReproducoes() > 400 && getTotalDeReproducoes() <= 500) {
                classificacao = 5;
            } else if (getTotalDeReproducoes() > 500 && getTotalDeReproducoes() <= 600) {
                classificacao = 6;
            } else if (getTotalDeReproducoes() > 600 && getTotalDeReproducoes() <= 700) {
                classificacao = 7;
            } else if (getTotalDeReproducoes() > 700 && getTotalDeReproducoes() <= 800) {
                classificacao = 8;
            } else if (getTotalDeReproducoes() > 800 && getTotalDeReproducoes() <= 900) {
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
        aux+= "Artista:" + artista  + "\n";
        aux+= "album:" + album + "\n";
        aux+= "Duração:" + getDuracao() + "\n";
        aux+= "Genero:" + genero + "\n";
        aux+= "Reproduções:" + getTotalDeReproducoes() + "\n";
        aux+= "Curtidas" + getCurtidas() + "\n";
        aux+= "Classificação:" + classifica(getClassificacao()) + "\n";

        return  aux;
    }

}
