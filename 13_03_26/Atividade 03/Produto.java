public class Produto {
    private String nome;
    private double preco;

    public Produto(){

    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void mostrarProdutos(String nome, double preco){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
    }

}
