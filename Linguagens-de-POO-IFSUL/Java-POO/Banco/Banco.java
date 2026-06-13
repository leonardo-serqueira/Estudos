public class Banco {
    String nome;
    double limite;
    int agencia;
    int conta;
    double saldo;

    public Banco() {

    }

    public void sacarDinheiro(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositarDinheiro() {

    }

    public void efetuarPagamento() {

    }

}