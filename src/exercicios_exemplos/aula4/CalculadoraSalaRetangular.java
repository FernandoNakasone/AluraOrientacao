package exercicios_exemplos.aula4;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return altura * 2 + largura * 2;
    }
}
