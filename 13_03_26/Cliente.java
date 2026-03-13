public class Cliente extends Pessoas {
    private String email;

    public Cliente(String email, String nome, int idade){
        super(nome,idade);
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Overload
    public void exibirDados(){
        System.out.println("Email: "+this.email+this.getNome());
    }

}
