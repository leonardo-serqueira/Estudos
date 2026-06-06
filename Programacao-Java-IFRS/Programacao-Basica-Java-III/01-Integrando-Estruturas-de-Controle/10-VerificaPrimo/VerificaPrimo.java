/*
10. Faça um programa que receba um número inteiro maior que 1, verifique se o
número fornecido é primo ou não. Um número é primo quando é divisível
apenas por 1 e por ele mesmo.

*/

public class VerificaPrimo {
    
    public static void main(String[] args) {
        int numero;
        int contPrimo = 0;

        System.out.println("\n====|PROGRAMA VERIFICA PRIMO|====");
        System.out.print("\nDigite seu numero: ");
        numero = Integer.parseInt(System.console().readLine());


        for(int i = 1; i <= numero && numero > 1; i++) {

            if ((numero % i) == 0) contPrimo++;
        
        }

        if (contPrimo == 2) System.out.printf("\nO numero %d é primo.\n", numero);
        else System.out.printf("\nO numero %d nao é primo.\n", numero);

    }

}
