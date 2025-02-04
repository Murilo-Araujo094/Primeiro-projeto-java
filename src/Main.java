import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double receberValor;
            double transferirValor;
            double saldo = 2500;


            System.out.println("*" .repeat(33));
            System.out.println("Dados iniciais do cliente:");
            System.out.println();
            System.out.println("Nome:      Murilo de Araujo Silva");
            System.out.println("Tipo de Conta:           Corrente");
            System.out.println("Saldo Inicial:         R$ 2500,00");
            System.out.println();
            System.out.println("*" .repeat(33));
            System.out.println();
            System.out.println();

        while (true)  {
            System.out.println("Operações:");
            System.out.println();
            System.out.println("1-Consultar valores");
            System.out.println("2-Receber Valor");
            System.out.println("3-Transferir Valor");
            System.out.println("4-Sair");
            int operacao = leitura.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Seu saldo é de R$: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja receber R$: ");
                    receberValor = leitura.nextDouble();
                    saldo += receberValor;
                    System.out.println("Valor recebido. Seu novo saldo é de R$: " + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir R$: ");
                    transferirValor = leitura.nextDouble();
                    if (transferirValor > saldo){
                        System.out.println("Saldo insuficiente...");
                    } else {
                        saldo -= transferirValor;
                    }
                        System.out.println("Seu novo saldo atualizdo é de R$ " + saldo);
                        break;

                case 4:
                    System.out.println("Saindo");
                    leitura.close();
                    return;
                default:
                    System.out.println("Opção invalida...Por favor escolha uma opção valida;");

                }

            }
        }
    }



