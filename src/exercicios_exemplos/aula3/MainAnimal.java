package exercicios_exemplos.aula3;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        dog.emitirSom();
        dog.abanarRabo();

        cat.emitirSom();
        cat.arranharMoveis();
    }
}
