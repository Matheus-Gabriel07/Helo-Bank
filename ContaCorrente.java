package HeloBank;

public class ContaCorrente extends Banco {
    private double saldoAtualComposto;

    public ContaCorrente(double saldo, String nomeTitular, int numeroConta) {
        super(saldo, nomeTitular, numeroConta);
        this.saldoAtualComposto = saldo;
    }

    public double getSaldoAtualComposto() {
        return saldoAtualComposto;
    }


    public double cobrarTaxa(double valor){
        saldoAtualComposto -= valor * 5/100; 
        return saldoAtualComposto;
    }

    public void resultado(){
        System.out.println("Foi retirado 5% do saldo da conta R$: " + "\n" + getSaldoAtualComposto());
    }

}