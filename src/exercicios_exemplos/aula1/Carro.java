package exercicios_exemplos.aula1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exiceFichaTecnica(){
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Cor:" + cor);
    }

    int calculaIdade(int ano){
        return  ano - this.ano;
    }
}
