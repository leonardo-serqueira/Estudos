/*
    10. Sabe-se que:
    1 pé = 12 polegadas
    1 jarda = 3 pés
    1 milha = 1.760 jardas
    Faça um programa que receba uma medida em pés , faça as
    conversões a seguir e mostre os resultados.
    a. polegadas;
    b. jardas;
    c. milhas.
*/

public class ConversorDistancia{
    
    public static void main(String[] args) {
        double pe, polegada, jarda, milha;

        System.out.println("\nPROGRAMA CONVERSOR DE DISTANCIA");

        System.out.print("\nInforme a distancia em pes: ");
        pe = Double.parseDouble(System.console().readLine());

        polegada = pe * 12;
        jarda = pe / 3;
        milha = jarda / 1760;

        System.out.printf(
        "\nDISTANCIAS\n"+
        "\nPolegadas: %f"+
        "\nJardas   : %f"+
        "\nMilhas   : %f\n",
        polegada, jarda, milha);

    }
}