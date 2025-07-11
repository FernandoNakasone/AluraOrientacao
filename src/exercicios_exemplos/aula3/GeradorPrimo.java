package exercicios_exemplos.aula3;

public class GeradorPrimo extends NumerosPrimos{

    public void geraPrimo() {
        int numero;
         do{
            numero = (int) Math.round(Math.random() * 1000);
        }while (!(verificaPrimalidade(numero)));

        System.out.println("O número primo gerado foi:" + numero);
    }

}
