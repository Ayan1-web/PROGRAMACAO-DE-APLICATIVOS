public class Alimento extends Produto{
    private int dataValidade;

    public Alimento(int dataValidade,String nome,double preco){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Overload
    public void mostrarProdutos(){
        System.out.println("Validade em nº de meses: "+this.dataValidade+getNome());
    }
}