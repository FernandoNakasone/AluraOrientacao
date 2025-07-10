package exercicios_exemplos.aula1;

public class Main {
    public static void main(String[] args) {
        //Código apresentado no exercicio
        /*  Venda venda1 = Venda();
            venda1.produto = "Camiseta";
            venda1.quantidade = "2";
            venda1.valorUnitario = 25.50;

            System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);
        * */
        //1-Erro: faltou iniciar o objeto venda1: Venda venda1 = new Venda();
        //2-Erro: O atributo quantidade é uma variavel do tipo inteiro (int) e no código ele está preenchendo o valor como se fosse uma string "2"

        //Código corrigido
        Venda venda1 = new Venda();
        venda1.produto = "Camiseta";
        venda1.quantidade = 2;
        venda1.valorUnitario = 25.50;

        System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);

    }
}
