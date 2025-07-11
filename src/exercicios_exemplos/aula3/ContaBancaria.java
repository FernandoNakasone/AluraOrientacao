package exercicios_exemplos.aula3;

import java.text.DecimalFormat;

public class ContaBancaria {
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }

    public void sacar(double valorSaque){
        DecimalFormat dF = new DecimalFormat("R$ #,##0.00");
        if(saldo > valorSaque){
            saldo -= valorSaque;
            System.out.println(dF.format(valorSaque) + " foi sacado, saldo restante:" + dF.format(saldo));
        } else{
            System.out.println("Saldo insuficiente para fazer o saque, saldo disponível:" + dF.format(saldo));
        }
    }

    public void consultarSaldo(){
        DecimalFormat dF = new DecimalFormat("R$ #,##0.00");
        System.out.println("saldo disponível:" + dF.format(saldo) );
    }
}
