/*
9.  Faça um programa que calcule e mostre a área de um quadrado.
    Sabese que 𝐴 = 𝑙𝑎𝑑𝑜2
*/

public class QuadradoArea {

    public static void main(String[] args) {
        double lado, area;

        System.out.println("\nPROGRAMA AREA DE QUADRADO");

        System.out.print("\nInforme o comprimento de um dos lados do seu quadrado: ");
        lado = Double.parseDouble(System.console().readLine());

        area = lado * lado;

        System.out.printf("\nArea do quadrado: %.2f\n", area);

    }
    
}
