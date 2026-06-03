/*
    10. Faça um programa que mostre o menu de opções a seguir, receba a opção
    digitada pelo usuário e os dados necessários para executar cada operação.
    Note que dependendo da opção escolhida pelo usuário, um conjunto de
    instruções diferente será executado. DICA: utilize as estruturas escolha e
    switch para executar conjuntos de instruções diferentes, dependendo da opção
    escolhida pelo usuário.
        Menu de opções:
            1. Somar dois números.  
            2. Número ao quadrado.      
            Digite a opção desejada     
*/
public class SwitchOperacoes {
    
    public static void main(String[] args) {
        int seletor;
        int num1 = 0;
        int num2 = 0;
        int soma = 0;
        int quadrado = 0;
        
        System.out.println("\nPROGRAMA OPERACOES MATEMATICAS\n");
        System.out.println("Menu de opcoes:");
        System.out.println("1. Somar dois numeros.");
        System.out.println("2. Número ao quadrado.");
        System.out.print("\nDigite a opcao desejada: ");
        seletor = Integer.parseInt(System.console().readLine());

        switch (seletor) {
            case 1:
                System.out.print("\nDigite o primeiro numero:");
                num1 = Integer.parseInt(System.console().readLine());
                System.out.print("\nDigite o segundo numero:");
                num2 = Integer.parseInt(System.console().readLine());

                soma = num1 + num2;

                System.out.printf("\n%d + %d = %d\n", num1, num2, soma);
                
                break;
            case 2:
                System.out.print("\nDigite o numero:");
                num1 = Integer.parseInt(System.console().readLine());

                quadrado = num1 * num1;

                System.out.printf("\n%d ao quadrado = %d", num1, quadrado);
                
                break;
            default:
                System.out.print("\nopcao invalida\n");
        }

    }

}