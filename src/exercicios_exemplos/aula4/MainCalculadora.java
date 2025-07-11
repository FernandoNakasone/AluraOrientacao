package exercicios_exemplos.aula4;

public class MainCalculadora {
    public static void main(String[] args) {

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("Area da sala retangular é de:" + calculadora.calcularArea(10,30));
        System.out.println("O perímetro da sala retangular é de:" + calculadora.calcularPerimetro(10,30));
    }

}
