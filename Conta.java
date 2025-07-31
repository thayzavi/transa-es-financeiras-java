public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
            return true;
        }

        return false;

    }

    
    public void investir(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Investimento de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$" + saldo;
    }
}