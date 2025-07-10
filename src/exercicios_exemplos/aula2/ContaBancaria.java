package exercicios_exemplos.aula2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        saldo += valor;
        System.out.println("Seu saldo agora é de: R$ " + saldo);
    }

    public void saca(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Valor sacado com sucesso, saldo restante:R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
