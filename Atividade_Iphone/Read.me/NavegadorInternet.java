public class NavegadorInternet{
    
    private String url;
    private String TipoNavegador;
    private String conexao;

    public NavegadorInternet(){

    }

    public NavegadorInternet(String url, String TipoNavegador, String conexao){
        this.url = url;
        this.TipoNavegador = TipoNavegador;
        this.conexao = conexao;
    }

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
}
