public interface NavegadorInternet{

    public void AdicionarAba(String url);

    public void ExibirPagina(String url);

    public void AtualizarPagina();

    public String getUrl();

    public void setUrl(String url);

    public String getTipoNavegador();

    public void setTipoNavegador(String TipoNavegador);

    public String getConexao();

    public void setConexao(String conexao);
    
}
