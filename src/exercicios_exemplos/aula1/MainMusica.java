package exercicios_exemplos.aula1;

public class MainMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.nome = "Até que durou";
        musica1.artista = "Péricles";
        musica1.anoDeLancamento = 2018;

        musica1.avalia(8);
        musica1.avalia(10);
        musica1.avalia(7);
        musica1.exibeFichaTecnica();
        System.out.println(musica1.calculaMedia());
    }
}
