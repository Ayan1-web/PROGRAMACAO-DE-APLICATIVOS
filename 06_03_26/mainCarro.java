import java.util.Scanner;

public class mainCarro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Digite a velocidade máxima: ");
        int vmax = sc.nextInt();

        Carro carro = new Carro(marca, vmax);

        int opcao;

        do {
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Velocidade Atual");
            System.out.println("4 - Velocidade Máxima");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor para acelerar: ");
                    int acelerar = sc.nextInt();
                    carro.acelerar(acelerar);
                    break;

                case 2:
                    System.out.print("Valor para frear: ");
                    int frear = sc.nextInt();
                    carro.frear(frear);
                    break;

                case 3:
                    System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
                    break;

                case 4:
                    System.out.println("Velocidade máxima: " + carro.getVelocidadeMaxima() + " km/h");
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}