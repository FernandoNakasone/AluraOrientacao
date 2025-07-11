package exercicios_exemplos.aula4;

public class ConversorMoeda implements ConversaoFinanceira{

    private double valorDolar;

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return valorDolar * 5.55;
    }
}
