public class Carro extends Veiculos{
    private int portas;

    public Carro(int portas, String marca, int ano){
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    @Overload
    public void exibirInformações(){
        System.out.println("Nº de portas: "+this.portas+getAno());
    }

}
