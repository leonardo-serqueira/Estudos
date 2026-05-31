/*
    2. Faça um programa que leia um valor numérico inteiro. O programa deve
    apresentar a mensagem “O valor está na faixa permitida”, caso o valor
    informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
    deve apresentar a mensagem “O valor está fora da faixa permitida”.
*/

public class VerificaFaixa {
        public static void main(String[] args) {
            int valor;
            
            System.out.println("\nPROGRAMA VERIFICA FAIXA");

            System.out.print("\nDigite o valor a verificar: ");
            valor = Integer.parseInt(System.console().readLine());

            if (valor >= 1 && valor <= 9) {
                System.out.print("\nO valor esta na faixa permitida\n");
            } else {
                System.out.print("\nO valor esta fora da faixa permitida\n");
            }
        }
}