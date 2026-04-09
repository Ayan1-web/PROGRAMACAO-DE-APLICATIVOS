public class Main_Iphone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        ReprodutorMusical musicPlayer = iphone;
        musicPlayer.tocar();
        musicPlayer.pausar();

        AparelhoTelefonico telefone = iphone;
        telefone.ligar("123456789");
        telefone.atender();

        NavegadorInternet navegador = iphone;
        navegador.exibirPagina("https://www.google.com");
    }
}
