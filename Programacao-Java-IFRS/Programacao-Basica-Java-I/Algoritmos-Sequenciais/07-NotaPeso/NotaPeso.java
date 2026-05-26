/*
    7. Faça um programa que receba três notas e seus respectivos pesos,
    calcule e mostre a média ponderada dessas notas. Para calcular a
    média ponderada, multiplique cada nota por seus respectivos pesos,
    some todos os resultados e divida pela soma dos pesos. Por exemplo,
    se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
    estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. 
*/

public class NotaPeso{
    
    public static void main(String[] args) {
        double nota1, nota2, nota3, peso1, peso2, peso3, media;

        System.out.println("\nPROGRAMA MEDIA COM PESO");
        
        System.out.print("\n insira a primeira nota: ");
        nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("\n insira o peso da primeira nota: ");
        peso1 = Double.parseDouble(System.console().readLine());

        System.out.print("\n insira a segunda nota: ");
        nota2 = Double.parseDouble(System.console().readLine());
        System.out.print("\n insira o peso da segunda nota: ");
        peso2 = Double.parseDouble(System.console().readLine());

        System.out.print("\n insira a terceira nota: ");
        nota3 = Double.parseDouble(System.console().readLine());
        System.out.print("\n insira o peso da terceira nota: ");
        peso3 = Double.parseDouble(System.console().readLine());

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 
        (peso1 + peso2 + peso3);

        System.out.printf(
        "\nPrimeira nota: %.2f"+
        "\nSegunda nota : %.2f"+
        "\nTerceira nota: %.2f"+
        "\nPrimeiro peso: %.2f"+
        "\nSegundo peso : %.2f"+
        "\nTeceiro peso : %.2f\n"+
        "\nMedia Final  : %.2f",
        nota1, nota2, nota3, peso1, peso2, peso3, media);
    }
}