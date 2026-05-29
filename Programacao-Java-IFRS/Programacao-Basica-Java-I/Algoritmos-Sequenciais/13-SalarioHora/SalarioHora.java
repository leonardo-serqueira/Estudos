/*
    13. Faça um programa que receba o número de horas trabalhadas e o valor
    do salário mínimo, calcule e mostre o salário a receber seguindo estas
    regras:
    a. a hora trabalhada vale um décimo do salário mínimo;
    b. o salário bruto equivale ao número de horas trabalhadas
    multiplicado pelo valor da hora trabalhada;
    c. o imposto equivale a 3% do salário bruto;
    d. o salário a receber equivale ao salário bruto menos o imposto.
*/

public class SalarioHora {
    
    public static void main(String[] args) {
        double hora, salarioMinimo, salarioBruto, salarioLiquido, imposto;

        System.out.println("\nPROGRAMA HORA TRABALHADA");

        System.out.print("\nDigite as horas trabalhadas: ");
        hora = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite o salario minimo: ");
        salarioMinimo = Double.parseDouble(System.console().readLine());

        salarioBruto   = hora * (salarioMinimo/10);
        imposto        = salarioBruto * 0.03;
        salarioLiquido = salarioBruto - imposto;
        
        System.out.printf("\nSalario a receber: %.2f\n", salarioLiquido);
    }
}