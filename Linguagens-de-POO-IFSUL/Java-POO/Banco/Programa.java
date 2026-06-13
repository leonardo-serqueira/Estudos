class Programa {

    public static void main(String[] args) {
        Banco minhaConta;
        minhaConta = new Banco();

        minhaConta.nome = "Maria Alegre";
        minhaConta.agencia = 1234;
        minhaConta.conta = 99887611;
        minhaConta.saldo = 2300;

        System.out.println("Saldo: " + minhaConta.saldo);

        minhaConta.sacarDinheiro(500);
        System.out.println(minhaConta.saldo);
        
    }
}