package exercicios_exemplos.aula3;

public class MainCarro {
    public static void main(String[] args) {
        ModeloCarro civic = new ModeloCarro("Honda Civic", 95000.0, 97000.0, 94000.0);
        civic.exibeDetalhes();

        System.out.println();

        ModeloCarro corolla = new ModeloCarro("Toyota Corolla", 100000.0, 102000.0, 98000.0);
        corolla.exibeDetalhes();
    }
}
