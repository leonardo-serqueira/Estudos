/*
    8. Faça um algoritmo e um programa, utilizando as estruturas repita e do..while
    que repita a leitura de uma senha até que o usuário digite o número 1234. Após
    isso, mostrar a mensagem “Senha correta, acesso liberado.”
*/

public class DoWhileSenha {

    public static void main(String[] args) {
        int senha;

        System.out.println("\nPROGRAMA VERIFICA SENHA");

        do {
            System.out.print("\nDigite a senha correta: ");
            senha = Integer.parseInt(System.console().readLine());
            System.out.println("...");
        } while (senha != 1234);

        System.out.println("\nSenha correta, acesso liberado.");

    }

}