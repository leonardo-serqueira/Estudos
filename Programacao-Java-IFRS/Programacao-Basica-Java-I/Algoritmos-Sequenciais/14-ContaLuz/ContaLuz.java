/*
    14. Sabe-se que o quilowatt de energia custa um quinto do salário mínimo.
    Faça um programa que receba o valor do salário mínimo e a quantidade
    de quilowatts consumida por uma residência, calcule e mostre:
    a. o valor de cada quilowatt;
    b. o valor a ser pago por essa residência;
    c. o valor a ser pago com desconto de 15%.
*/

public class ContaLuz {
    
    public static void main(String[] args) {
        double qwatt, salarioMinimo, valorQwatt, valorBruto, valorLiquido;

        System.out.println("\nPROGRAMA CONTA DE LUZ");

        System.out.print("\nDigite o salario minimo: ");
        salarioMinimo = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite a quantidade de quilloatts: ");
        qwatt = Double.parseDouble(System.console().readLine());

        valorQwatt   = salarioMinimo / 5;
        valorBruto   = valorQwatt * qwatt;
        valorLiquido = valorBruto * 0.85;

        System.out.printf(
            "\nValor do quillowatt       : %.2f"+
            "\nConta de luz valor bruto  : %.2f"+
            "\nConta de luz valor liquido: %.2f",
            valorQwatt, valorBruto, valorLiquido
        );    
    }
}