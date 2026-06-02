/*
    3. Crie um programa Java para exibir os quadrados de números digitados
    pelo usuário, até que ele digite um número negativo.
*/



public class QuadradosAteNegativo {
    public static void main(String[] args) {
        double numero, quadrado;

        System.out.println("\nPROGRAMA EXIBE SEU NUMERO AO QUADRADO");

        numero = 0;
        quadrado = 0;

        while (numero >= 0){
            System.out.print("\ndigite um numero: ");
            numero = Double.parseDouble(System.console().readLine());

            if (numero >= 0) {
                quadrado = numero * numero;
                System.out.println("\nNumero ao quadrado: " + quadrado);
            }
        }
    }    
}