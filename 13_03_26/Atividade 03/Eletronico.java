public class Eletronico extends Produto{
    private int garantia;

    public Eletronico(int garantia, String nome, double preco){
        super(nome, preco);
        this.garantia = garantia;
    }

    @Overload
    public void mostrarProdutos(){
        System.out.println("Tempo de garantia em meses: "+this.garantia+getNome());
    }

}
