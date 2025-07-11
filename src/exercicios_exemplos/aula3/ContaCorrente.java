package exercicios_exemplos.aula3;

public class ContaCorrente extends ContaBancaria{

    private double tarifa;

    public ContaCorrente(double tarifa) {
        this.tarifa = tarifa;
    }

    public void cobrarTaridaMensal(){
        setSaldo(getSaldo() - tarifa);
    }

}
