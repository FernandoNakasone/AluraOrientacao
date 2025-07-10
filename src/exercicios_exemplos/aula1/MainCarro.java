package exercicios_exemplos.aula1;

public class MainCarro {
    public static void main(String[] args) {


    Carro carro = new Carro();

    carro.modelo = "Modelo A";
    carro.ano = 2010;
    carro.cor = "Vermelho";

    carro.exiceFichaTecnica();
    System.out.println("Idade:" + carro.calculaIdade(2025));
    }
}
