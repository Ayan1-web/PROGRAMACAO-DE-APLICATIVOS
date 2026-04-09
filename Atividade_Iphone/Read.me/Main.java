import java.util.Scanner;

public class Main{
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);

    AparelhoTelefonico aparelhoTelefonico [] = new AparelhoTelefonico("718763","iphone 7");
    ReprodutorMusical reprodutorMusical[] = new ReprodutorMusical("Giangts", "Spotify");
    Iphone iphone [] = new Iphone (89,"2007","256GB");
    NavegadorInternet navegadorinternt[] = new NavegadorInternet ("2382ueryt","Chrome","Wi-fi");

    for( AparelhoTelefonico i: aparelhoTelefonico){

        i.ligar();
        i.atender();
        i.correioDeVoz();
    }

    for( ReprodutorMusical b : reprodutorMusical){
        
        b.selecionarMusica();
        b.tocar();
        b.pausar();
    }

    for(Iphone a: iphone){
        a.exibir();
    }

    for(NavegadorInternet c: navegadorinternt){

        c.AdicionarAba();
        c.ExibirPagina();
        c.AtualizarPagina();

    }

    }
}
