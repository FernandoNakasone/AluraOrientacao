package exercicios_exemplos.aula1;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora num1 = new Calculadora();

        num1.numero = 10;
        System.out.println("O dobro de " + num1.numero + " é:" + num1.dobrarNumero());
    }
}
