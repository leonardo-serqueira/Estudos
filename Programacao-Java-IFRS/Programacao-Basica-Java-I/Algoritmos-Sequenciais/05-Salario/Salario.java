/*
    5. Faça um programa que receba o salário base de um funcionário,
    calcule e mostre o salário a receber, sabendo-se que o funcionário tem
    gratificação de 5% sobre o salário base (que será acrescentado ao salário) 
    e paga imposto de 7% sobre este salário (o que será descontado do salário).
*/

public class Salario{
    public static void main(String[] args) {
        double sal, bonus, onus, novosal;

        System.out.println("\nPROGRAMA SALARIO BONUS E ONUS");

        System.out.print("\nInforme seu salario: ");
        sal = Double.parseDouble(System.console().readLine());

        bonus   = (sal * 5) / 100;
        onus    = (sal * 7) / 100;
        novosal = (sal + bonus) - onus;

        System.out.println("\nRESULTADO:\n");

        System.out.printf("Salario base   : %.2f"+
        "\nBonus(5%%)      : %.2f"+
        "\nImposto(7%%)    : %.2f"+
        "\nSalario liquido: %.2f\n"
        , sal, bonus, onus, novosal);



    }
}