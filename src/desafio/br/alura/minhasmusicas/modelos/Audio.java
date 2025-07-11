package desafio.br.alura.minhasmusicas.modelos;

public abstract class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public Audio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }


    public int getCurtidas() {
        return curtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }

    public  void curte(){
        curtidas++;
    }

    public void repodruz(){
        totalDeReproducoes++;
    }

    public String classifica(int classificacao){
        String classificado;

        if(classificacao <= 5){
            return "É considerado abaixo da média";
        } else if (classificacao <= 8) {
            return  "É considerado na média";
        } else {
            return  "É considerado acima da média";
        }
    }
}
