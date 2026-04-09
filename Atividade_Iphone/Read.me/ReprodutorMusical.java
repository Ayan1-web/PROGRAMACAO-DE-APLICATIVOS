public class ReprodutorMusical extends Iphone{

    private String musica;
    private String nome;

    public ReprodutorMusical(){

    }

    public ReprodutorMusical(String musica, String nome){

        this.musica = musica;
        this.nome = nome;
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

    public setNome(String nome){
        this.nome = nome;
    }

    public void selecionarMusica(String musica){

        System.out.println("Informe a música desejada");

    }

    public void tocar(){

            System.out.println("Música tocando "+getMusica());
    }

    public void pausar(){

        System.out.println("Música Pausada "+getMusica());
    }
}
