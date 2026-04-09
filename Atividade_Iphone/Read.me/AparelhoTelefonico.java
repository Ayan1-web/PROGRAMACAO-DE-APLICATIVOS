public class AparelhoTelefonico extends Iphone{

    private String numero;
    private String modelo;

    public AparelhoTelefonico(){

    }

    public AparelhoTelefonico(String numero, String modelo){

            this.modelo = modelo;
            this.numero = numero;
    }

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


}
