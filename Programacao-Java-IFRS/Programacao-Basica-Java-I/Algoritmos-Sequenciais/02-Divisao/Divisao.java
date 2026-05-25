/*
    2. Faça um programa que receba dois números, calcule e mostre a divisão
    do primeiro pelo segundo. Sabe-se que o segundo número não pode ser
    zero, portanto, não é necessário se preocupar com isso neste exercício.
*/

public class Divisao{
    public static void main(String[] args){
        double num1, num2;
        
        System.out.println("\n------------------- PROGRAMA DE DIVISAO -------------------\n");

        System.out.print("Informe o primeiro numero: ");
        num1 = Double.parseDouble(System.console().readLine());

        System.out.print("Informe o segundo numero:");
        num2 = Double.parseDouble(System.console().readLine());

        double divisao = num1 / num2;
        
        System.out.println("\n --------------------RESULTADO:--------------------\n");
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, divisao);


    }
}