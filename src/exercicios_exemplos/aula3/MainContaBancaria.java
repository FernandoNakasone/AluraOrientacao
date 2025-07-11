package exercicios_exemplos.aula3;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(10);

        conta.depositar(5000);
        conta.consultarSaldo();
        conta.sacar(1500);
        conta.cobrarTaridaMensal();
        conta.consultarSaldo();
        conta.cobrarTaridaMensal();
        conta.consultarSaldo();
        conta.cobrarTaridaMensal();
        conta.consultarSaldo();
        conta.cobrarTaridaMensal();
        conta.consultarSaldo();
    }
}
