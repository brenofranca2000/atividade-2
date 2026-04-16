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

    }