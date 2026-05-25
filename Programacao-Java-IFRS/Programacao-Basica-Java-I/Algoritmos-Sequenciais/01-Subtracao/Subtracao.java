/*
    1. Faça um programa que receba dois números, calcule e mostre a
    subtração do primeiro número pelo segundo.
*/

public class Subtracao{

    public static void main(String[] args) {
        double num1, num2;

        System.out.println("\n------------------- PROGRAMA DE SUBTRACAO -------------------\n");
        
        System.out.print("Informe o primeiro numero: ");
        num1 = Double.parseDouble(System.console().readLine());

        System.out.print("Informe o segundo numero: ");
        num2 = Double.parseDouble(System.console().readLine());
        

        double subtr = num1 - num2;
        System.out.printf("\n------------------- RESULTADO: -------------------\n \n %.2f - %.2f = %.2f\n", num1, num2, subtr);
        

    }
}