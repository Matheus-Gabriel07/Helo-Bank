package HeloBank;

public class Banco {
    private double saldo;
    private String nomeTitular;
    private int numeroConta;

    public Banco(double saldo, String nomeTitular, int numeroConta) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido. Sua conta está zerada");
        }
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
