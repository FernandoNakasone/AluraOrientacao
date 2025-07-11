package exercicios_exemplos.aula3;

public class MainNumero {
    public static void main(String[] args) {
        NumerosPrimos numero = new NumerosPrimos();

        numero.verificaPrimalidade(10);
        System.out.println(numero.verificaPrimalidade(29));

        numero.listaPrimos(100);

        VerificadorPrimo numeroVerifica = new VerificadorPrimo();

        System.out.println();
        numeroVerifica.verificaPrimo(10);
        numeroVerifica.verificaPrimo(9);
        numeroVerifica.verificaPrimo(8);
        numeroVerifica.verificaPrimo(7);

        GeradorPrimo numeroGerado = new GeradorPrimo();

        System.out.println();
        numeroGerado.geraPrimo();

    }
}
