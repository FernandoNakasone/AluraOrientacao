package exercicios_exemplos.aula3;

public class VerificadorPrimo extends  NumerosPrimos{
    public void verificaPrimo(int numero){
        if(verificaPrimalidade(numero)){
            System.out.println("O número " + numero + " é um número primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
    }
}
