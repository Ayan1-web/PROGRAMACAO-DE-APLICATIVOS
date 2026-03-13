public class MainProduto {
    public static void main(String[] args) {
        Eletronico e1 = new Eletronico(9, "Controle", 18.70);
        Alimento a1 = new Alimento(5, "Abacaxi", 11.87);

        e1.mostrarProdutos();
        a1.mostrarProdutos();
    }
}
