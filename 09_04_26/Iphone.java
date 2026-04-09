public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    
    private String musica;
    private String nome;
    private String url;
    private String TipoNavegador;
    private String conexao;
    private String numero;
    private String modelo;
    private long id;
    private String datafabricacao;
    private String armazenamento;
    
    //REPRODUTOR MUSICAL
    public void selecionarMusica(String musica){
        
        System.out.println("Informe a música desejada: ");
    }

    public void tocar(){
        
        System.out.println("Música tocando"+getMusica());
    }

    public void pausar(){
        
        System.out.println("Pausando música"+getMusica());
    }

     public String getMusica(){
        
        return this.musica;
    }

    public void setMusica(String musica){
        
        this.musica = musica;
    }

    public String getNome(){
        
        return this.nome;
    }

    public void setNome(String nome){
        
        this.nome = nome;
    }

    
    //NAVEGADOR INTERNET
     public String getUrl(){
        
        return this.url;
    }

    public void setUrl(String url){
        
        this.url = url;
    }

    public String getTipoNavegador(){
        return this.TipoNavegador;
    }

    public void setTipoNavegador(String TipoNavegador){
        
        this.TipoNavegador = TipoNavegador;
    }

    public String getConexao(){
        
        return this.conexao;
    }
    
    public void setConexao(String conexao){
        
        this.conexao = conexao;
    }

    public void AdicionarAba(String url){

        System.out.println("Digite o url da página: ");
    }

    public void ExibirPagina(String url){

        System.out.println("Url da página: "+getUrl());
    }

    public void AtualizarPagina(){

        System.out.println("Página atualizada.");
    }
    

    //APARELHO TELEFONICO
     public String getNumero(){
        
        return this.numero;
    }

    public void setNumero(String numero){
        
        this.numero = numero;
    }

    public String getModelo(){
        
        return this.modelo;
    }

    public void setModelo(String modelo){
        
        this.modelo = modelo;
    }

    public void ligar(String numero){

        System.out.println("Qual número você deseja ligar ?");

    }

    public void atender(){

        System.out.println("Você deseja atender "+getNumero());

    }

    public void correioDeVoz(){

        System.out.println("Correio de voz iniciado!");

    }


    //IPHONE
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

    @Override
    public void ligar() {
        System.out.println("Qual número você deseja ligar?");
    }
}

