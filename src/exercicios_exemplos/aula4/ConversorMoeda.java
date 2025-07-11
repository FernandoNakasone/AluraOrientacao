package exercicios_exemplos.aula4;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.55;
    }
}
