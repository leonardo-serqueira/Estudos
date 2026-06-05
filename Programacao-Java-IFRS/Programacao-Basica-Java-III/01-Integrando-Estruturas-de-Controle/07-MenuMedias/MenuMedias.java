/*
7. Faça um programa que apresente o menu de opções a seguir:
        Menu de opções:
            1. Média Aritmética
            2. Média ponderada
            3. Sair
    Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles.
    Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a
    média ponderada.
    Na opção 3, sair do programa.
Verifique a possibilidade de opção inválida, Neste caso, o programa deverá
mostrar uma mensagem.

*/

public class MenuMedias {

    public static void main(String[] args) {
        int opcao = 0;
        double n1, n2, n3, p1, p2, p3, media;

        do {
            System.out.println("\nMenu de opcoes:");
            System.out.println("1. Media Aritmetica");
            System.out.println("2. Media ponderada");
            System.out.println("3. Sair");
            System.out.print("\nDigite a opcao desejada: ");
            opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a primeira nota: ");
                    n1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite a segunda nota: ");
                    n2 = Double.parseDouble(System.console().readLine());
                    
                    media = (n1 + n2) / 2.0;
                    System.out.printf("Media Aritmetica = %.2f\n", media);
                    break;

                case 2:
                    System.out.print("\nDigite a primeira nota: ");
                    n1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da nota 1: ");
                    p1 = Double.parseDouble(System.console().readLine());
                    
                    System.out.print("Digite a segunda nota: ");
                    n2 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da nota 2: ");
                    p2 = Double.parseDouble(System.console().readLine());
                    
                    System.out.print("Digite a terceira nota: ");
                    n3 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o peso da nota 3: ");
                    p3 = Double.parseDouble(System.console().readLine());

                    media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
                    System.out.printf("Media Ponderada = %.2f\n", media);
                    break;

                case 3:
                    System.out.println("\nFinalizando o programa...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!!!");
                    break;
            }

        } while (opcao != 3);

    }

}
