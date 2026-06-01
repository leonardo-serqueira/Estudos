/*
    A nota final de um estudante é calculada a partir de três notas
    atribuídas, respectivamente, a um trabalho de laboratório, a uma
    avaliação semestral e a um exame final. A média das três notas
    mencionadas obedece aos pesos a seguir:
        Nota Peso
        Trabalho de laboratório | 2
        Avaliação semestral     | 3
        Exame final             | 5
    Faça um programa que receba as três notas, calcule e mostre a média
    ponderada e o conceito que segue a tabela:
        Média Ponderada Conceito
        8,0 (inclusive) a 10,0 (inclusive) | A
        7,0 (inclusive) a 8,0              | B
        6,0 (inclusive) a 7,0              | C
        5,0 (inclusive) a 6,0              | D
        0,0 (inclusive) a 5,0              | E
*/

public class ConversorMedia {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;

        System.out.println("\nPROGRAMA MEDIA EM LETRA");

        System.out.print("\nDigite a nota do trabalho de laboratorio: ");
        nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite a nota da avaliacao semestral: ");
        nota2 = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite nota do exame final: ");
        nota3 = Double.parseDouble(System.console().readLine());

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

        if (media >= 8) {
            System.out.print("\nSua nota: A\n");
        } else if (media >= 7) {
            System.out.print("\nSua nota: B\n");
        } else if (media >= 6) {
            System.out.print("\nSua nota: C\n");
        } else if (media >= 5) {
            System.out.print("\nSua nota: D\n");
        } else {
            System.out.print("\nSua nota: E\n");
        }
    }
}
