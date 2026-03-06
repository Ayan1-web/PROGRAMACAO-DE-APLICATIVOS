public class ContaBancaria{
        private String numeroConta;
        private String titular;
        private double saldo;
        public static void main(String[] args) {
            
        }

        public ContaBancaria(String numeroConta,String titular,double saldoInicial){
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = saldoInicial;
        }
        public void depositar(double valor)
        {
            if (valor<=0){
                System.out.println("Erro. Não é permitido depósito com valor negativo ou zero");
                return;
            }
             
            saldo += valor;
            System.out.println("Depóstio realizado com sucesso!");
            System.out.println("Saldo atualizado: "+saldo);
        }
        
        public void sacar(double valor)
        {
            if (valor<=0){
                System.out.println("Erro de saque, não é possivel sacar este tipo de valor");
                return;
            }
            if (valor>saldo){
                System.out.println("Erro valor de sauqe é superior ao saldo");
                return;
            }
            saldo-=valor;
            int saque = (int) valor;
            int c100 = saque / 100;
            saque%=100;
            
            int c50 = saque / 50;
            saque%=50;

            int c20 = saque / 20;
            saque%=20;

            int c10 = saque / 10;
            saque%=10;

            int c5 = saque / 5;
            saque%= 5;

            int c2 = saque / 2;
            saque%=2;

            int c1 = saque;

            System.out.println("Saque feito com sucesso!");
            System.out.print((int)valor+"--> ");

            if (c100 > 0) System.out.print(c100+"Cédulas de 100, ");
            if (c50 > 0) System.out.print(c50+" cédulas de 50, ");
            if (c20 > 0) System.out.print(c20+" cédulas de 20, ");
            if (c10 > 0) System.out.print(c10+" cédulas de 10, ");
            if (c5 > 0) System.out.print(c5+" cédulas de 5, ");
            if (c2 > 0) System.out.print(c2+" cédulas de 2, ");
            if (c1 > 0) System.out.print(c1+" moedas de 1 real.");

            System.out.println();
        }
            
        public double getSaldo(){
                return saldo;
        }
    }
