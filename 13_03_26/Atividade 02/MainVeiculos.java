public class MainVeiculos {
    public static void main(String[] args) {
        Carro c1 = new Carro(4, "chevrolet", 2009);
        Moto m1 = new Moto(300, "XRE", 2020);

        c1.exibirInformações();
        m1.exibirInformações();
    }
}
