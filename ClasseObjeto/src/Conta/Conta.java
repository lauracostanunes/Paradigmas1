public class Conta{
    public String nomeCliente;
    public float saldo;
    public boolean status;
    public int numeroConta, agencia;

    public Conta(String nomeCliente, float saldo, boolean status, int numeroConta, int agencia) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito realizado");
        }
        else{
            System.out.println("Conta inativa");
        }
    }

    public void sacar(float valor) {
        if (this.status && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$" + this.saldo);
        }
        else if (!this.status) {
            System.out.println("Conta inativa");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void encerrarConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada");
        }
        else {
            System.out.println("Conta possui saldo");
        }
    }

    // toString
    public String toString() {
        return "Cliente: " + this.nomeCliente +
                " Número: " + this.numeroConta +
                " Agência: " + this.agencia +
                " Saldo: " + this.saldo +
                " Status: " + this.status;
    }
}