/*
15. Faça um programa que receba uma temperatura em Celsius, calcule e
mostre essa temperatura em Fahrenheit. Sabe-se que
𝐹 = ((9 × 𝐶) / 5)+ 32
*/

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        double celsius, fahrenheit;

        System.out.println("\nPROGRAMA CONVERSOR DE TEMPERATURA");

        System.out.print("\nDigite a temperatura em celcius: ");
        celsius = Double.parseDouble(System.console().readLine());

        fahrenheit = ((9 * celsius) / 5)+ 32;

        System.out.printf("\nTemperatura em Fahrenheit: %.2f", fahrenheit);
    }
}