package Class;

import java.util.Scanner;

public class ContaPolpanca extends Banco {
    private double saldoAtual;

    public ContaPolpanca(double saldo, String nomeTitular, int numeroConta) {
        super(saldo, nomeTitular, numeroConta);
        this.saldoAtual = saldo;
    }

    Scanner sc = new Scanner(System.in);

    public void Poupanca() {
        System.out.println("\s Opções de taxa" +
                "\n1) Juros Simples" +
                "\n2) Juros Composto");

        int opcPolpanca = sc.nextInt();

        switch (opcPolpanca) {

            case 1:
                opcaoJuros(1);
                break;

            case 2:
                opcaoJuros(2);
                break;

            default:
                System.out.println("Opção inválida");
                break;

        }
    }

    public void opcaoJuros(int opc) {
        System.out.println("Digite o valor da taxa desejada");
        double taxa = sc.nextDouble();
        System.out.println("Digite o tempo (meses) desejado");
        int tempo = sc.nextInt();

        if (opc == 1) {
            double resultadoJurosSimples = taxaJurosSimples(tempo, taxa);
            System.out.println("Saldo atual " + resultadoJurosSimples);
        } else if (opc == 2) {
            double resultadoJurosComposto = taxaJurosComposto(tempo, taxa);
            System.out.println("Saldo atual " + resultadoJurosComposto);
        } else {
            System.out.println("Opção inválida");
        }
    }

    public double taxaJurosSimples(int tempo, double taxa) {
        if (taxa > 0) {
            double resultado = saldoAtual + Math.round(saldoAtual * (taxa / 100) * tempo);
            return resultado;

        } else {
            System.out.println("Taxa ou tempo inválido");
            return saldoAtual;

        }
    }

    public double taxaJurosComposto(int tempo, double taxa) {
        double resultado = saldoAtual + Math.round(saldoAtual * Math.pow((1 - (taxa / 100)), tempo));
        return resultado;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
