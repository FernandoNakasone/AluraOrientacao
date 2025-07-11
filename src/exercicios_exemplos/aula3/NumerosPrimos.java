package exercicios_exemplos.aula3;

public class NumerosPrimos {

    public boolean verificaPrimalidade(int numero){
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void listaPrimos(int numero){
        System.out.print("Primos até " + numero + ":");

            for(int i = 0; i < numero && numero != 2; numero--){
                if(verificaPrimalidade(numero)){
                System.out.print(numero + " - ");
                }
            }
            System.out.println(2);
    }

}
