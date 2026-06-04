/*
    3. Escreva um programa em Java que leia um string contendo um número
    em binário e o mostre em decimal na tela.
*/

public class StringBinariaParaDecimal {
    public static void main(String[] args) {
     String binario;
     int numero;
     
    System.out.println("\nPROGRAMA BINARIO PARA INTEIRO");
    System.out.print("\nDigite o numero em binario(use 0 e 1): ");
    binario = System.console().readLine();

    numero = Integer.parseInt(binario, 2);

    System.out.printf("\n%s em inteiro: %d\n", binario, numero);

    }

}
