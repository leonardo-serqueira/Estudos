/*
7. Faça um programa que recebe dois números e execute uma das
operações listadas a seguir, de acordo com a escolha do usuário.
Se for digitada uma opção inválida, mostre uma mensagem avisando
sobre isso e termine a execução do programa. As opções são:
    1. O primeiro número elevado ao segundo número.
    2. Raiz quadrada de cada um dos números.
    3. Raiz cúbica de cada um dos números.
*/

public class CalculadoraOperacoes {

    public static void main(String[] args) {
        int seletor;
        double num1, num2;
        double resultado1 = 0;
        double resultado2 = 0;

        System.out.print("\nPROGRAMA MENU DE OPERACOES\n");

        System.out.print("\nInforme o primeiro numero: ");
        num1 = Double.parseDouble(System.console().readLine());
        System.out.print("\nInforme o segundo numero: ");
        num2 = Double.parseDouble(System.console().readLine());

        System.out.println("Menu de opcoes:");
        System.out.println("1. Potenciacao");
        System.out.println("2. Raiz quadrada");
        System.out.println("3. Raiz cubica");
        System.out.print("\nSelecione: ");
        seletor = Integer.parseInt(System.console().readLine());

        switch (seletor) {
            case 1:
                resultado1 = Math.pow(num1, num2);
                
                System.out.println("\nPotenciacao: ");
                System.out.printf("\n %.2f elevado a %.2f = %.2f\n",
                num1, num2, resultado1);
                break;
            case 2:
                resultado1 = Math.sqrt(num1);
                resultado2 = Math.sqrt(num2);

                System.out.println("\nRaiz quadrada: ");
                System.out.printf("\nRaiz quadrada de %.2f = %.2f\n",
                    num1, resultado1);
                System.out.printf("\nRaiz quadrada de %.2f = %.2f\n",
                    num2, resultado2);
                break;
            case 3:
                resultado1 = Math.cbrt(num1);
                resultado2 = Math.cbrt(num2);

                System.out.println("\nRaiz cubica: ");
                System.out.printf("\nRaiz cubica de %.2f = %.2f\n",
                    num1, resultado1);
                System.out.printf("\nRaiz cubica de %.2f = %.2f\n",
                    num2, resultado2);
                break;

            default:
                System.out.println("\nOpcao invalida!!!");
        }

    }

}