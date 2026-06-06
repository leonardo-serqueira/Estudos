/*
9. Faça um programa que apresente o menu de opções a seguir, que permita ao
usuário escolher a opção desejada, receba os dados necessários para executar
a operação e mostre o resultado. Verifique a possibilidade de opção inválida.
Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair
Na opção 1, receber o salário de um funcionário, calcular e mostrar o novo
salário usando as regras a seguir:
    Salários        Percentagem de Aumento
        Até R$ 1000,00              15%
        De R$ 1000,01 a R$ 3000,00  10%
        Acima de R$ 3000,00         5%

Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor de
suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de um
terço do salário.
Na opção 3, receber o salário de um funcionário e o número de meses de
trabalho na empresa, no máximo doze, calcular e mostrar o valor do décimo
terceiro salário. Sabe-se que o décimo terceiro salário equivale ao seu salário
multiplicado pelo número de meses de trabalho dividido por 12.
Na opção 4, sair do programa.
*/

public class MenuFuncionario {

    public static void main(String[] args) {
        int opcao = 0, meses = 0;
        double salario = 0, resultado = 0;

        System.out.println("\n====|PROGRAMA MENU GERENCIA FUNCINARIO|====");

        do {
            System.out.println("\nMenu de opcoes:");
            System.out.println("1. Novo salario");
            System.out.println("2. Ferias");
            System.out.println("3. Decimo terceiro");
            System.out.println("4. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o salario atual: ");
                    salario = Double.parseDouble(System.console().readLine());
                    
                    if (salario <= 1000.00) resultado = salario * 1.15;
                    if (salario > 1000.00 && salario <= 3000.00) resultado = salario * 1.10;
                    if (salario > 3000.00) resultado = salario * 1.05;
                    
                    System.out.printf("Novo salario com aumento: %.2f\n", resultado);
                    break;

                case 2:
                    System.out.print("\nDigite o salario do funcionario: ");
                    salario = Double.parseDouble(System.console().readLine());
                    
                    resultado = salario + (salario / 3.0);
                    System.out.printf("Valor das ferias: %.2f\n", resultado);
                    break;

                case 3:
                    System.out.print("\nDigite o salario do funcionario: ");
                    salario = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o numero de meses trabalhados (maximo 12): ");
                    meses = Integer.parseInt(System.console().readLine());
                    
                    if (meses < 1) meses = 1;
                    if (meses > 12) meses = 12;

                    resultado = (salario * meses) / 12.0;
                    System.out.printf("Valor do decimo terceiro: %.2f\n", resultado);
                    break;

                case 4:
                    System.out.println("\nFim...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!!!");
                    break;
            }

        } while (opcao != 4);
    }
}