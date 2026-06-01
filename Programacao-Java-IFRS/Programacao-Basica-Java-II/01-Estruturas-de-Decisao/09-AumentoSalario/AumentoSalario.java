/*
    9. Uma empresa decide dar um aumento de 30% aos funcionários cujo
    salário é inferior a 5000. Escreva um programa que possa ser utilizado
    para efetuar o cálculo do salário reajustado de um funcionário, a partir
    do valor do salário informado pelo usuário.
*/

public class AumentoSalario {
    public static void main(String[] args) {
        double salario, salarioNovo;

        System.out.println("\nPROGRAMA AUMENTO DE SALARIO");

        System.out.print("\nInforme o salario: ");
        salario = Double.parseDouble(System.console().readLine());

        if (salario < 5000) {
            salarioNovo = salario * 1.30;
            System.out.printf("\nSeu novo salario: %.2f\n", salarioNovo);
        } else {
            System.out.printf("\nSeu salario: %.2f\n", salario);
        }
    }    
}
