public class ContaBancaria {

    int numero;
    String titular;
    double saldo;
    int quantidadeSaques;

    // Construtor com bônus
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.0; // bônus de boas-vindas
        this.quantidadeSaques = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {

        if (quantidadeSaques >= 3) {
            System.out.println("Limite de saques diários atingido.");
            return;
        }

        if (valor > 1000) {
            System.out.println("Valor máximo por saque é R$ 1.000,00.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        quantidadeSaques++;
        System.out.println("Saque realizado com sucesso!");
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}