/*
    6. Um funcionário recebe um salário fixo mais 4% de comissão sobre as
    vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
    programa que receba o salário fixo do funcionário e o valor de suas
    vendas, calcule e mostre a comissão e seu salário final.
*/

public class Comissao {
    public static void main(String[] args) {
        double sal, venda, comis, total;

        System.out.println("\nPROGRAMA CALCULADOR DE COMISSAO");

        System.out.print("\nInsira seu salario:");
        sal = Double.parseDouble(System.console().readLine());

        System.out.print("\nInsira o valor da venda: ");
        venda = Double.parseDouble(System.console().readLine());

        comis = (venda * 4) / 100;
        total = sal + comis;

        System.out.println("\nRESULTADO:");

        System.out.printf(
        "\nSeu salario       : %.2f"+
        "\nSua venda         : %.2f"+
        "\nSua comissao(4%%)  : %.2f"+
        "\nSalario + comissao: %.2f\n",
        sal, venda, comis, total);

    }
}
