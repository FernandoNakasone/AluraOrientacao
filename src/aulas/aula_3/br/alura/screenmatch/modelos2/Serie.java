package aulas.aula_3.br.alura.screenmatch.modelos2;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiasPorTemporada;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiasPorTemporada() {
        return episodiasPorTemporada;
    }

    public void setEpisodiasPorTemporada(int episodiasPorTemporada) {
        this.episodiasPorTemporada = episodiasPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiasPorTemporada * minutosPorEpisodios;
    }
}
