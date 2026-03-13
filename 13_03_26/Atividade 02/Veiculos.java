public class Veiculos {
    private String marca;
    private int ano;

    public Veiculos(){

    }

    public Veiculos(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void exibirInformações(String marca, int idade){
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
    }

}
