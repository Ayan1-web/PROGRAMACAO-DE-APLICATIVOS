public class Funcionario extends Pessoas{
    private String cargo;

    public Funcionario(String cargo,String nome,int idade){
        super(nome, idade);
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Overload
    public void exibirDados(){
        System.out.println("Cargo: "+this.cargo+this.getNome());
    }
}