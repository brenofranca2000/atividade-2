import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(123, "Breno");

        int opcao;

        do {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    conta.exibirSaldo();
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}