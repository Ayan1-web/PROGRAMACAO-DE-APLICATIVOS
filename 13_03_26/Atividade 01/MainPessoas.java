public class MainPessoas {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("zelador","Ayan",18);
        Cliente c1 = new Cliente("Jeovane","jeovane@gmail.com",27);

        f1.exibirDados();
        c1.exibirDados();

    }
}
