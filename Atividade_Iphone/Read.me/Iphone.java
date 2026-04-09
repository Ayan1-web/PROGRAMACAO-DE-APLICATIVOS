public class Iphone(){

    private long id;
    private String datafabricacao;
    private String armazenamento;

    public Iphone(){

    }

    public Iphone(long id, String datafabricacao, String armazenamento){

        this.id = id;
        this.datafabricacao = datafabricacao;
        this.armazenamento = armazenamento;

    }

    public long getID(){
            return this.id;
    }

    public void setID(long id){
        this.id = id;
    }

    public String getDatafabricacao(){
        return this.datafabricacao;
    }

    public void setDataFabricacao(String datafabricacao){
        this.datafabricacao = datafabricacao;
    }

    public String getArmazenamento(){
        return this.armazenamento;
    }

    public void setArmazenamento(String armazenamento){
        this.armazenamento = armazenamento;
    }

    public void exibir(long id, String datafabricacao, String armazenamento){

        System.out.println("Id do aparelho: "+this.id);
        System.out.println("Data de Fabricação: "+this.datafabricacao);
        System.out.println("Armazenamento: "+this.armazenamento);
    }
}
