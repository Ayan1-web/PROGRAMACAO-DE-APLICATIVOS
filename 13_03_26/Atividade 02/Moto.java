public class Moto extends Veiculos{
    private int cilindradas;

    public Moto(int cilindradas, String marca, int ano){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Overload
    public void exibirInformações(){
        System.out.println("Nº de cilindradas: "+this.cilindradas+getAno());
    }

}
