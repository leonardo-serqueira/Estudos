/*
    4. Escreva um programa em Java que calcule as raízes de uma equação
    de segundo grau utilizando a fórmula de Báskara. A equação de
    segundo grau é uma equação no formato Ax^2
    + Bx + C. O usuário deve
    informar os valores para A, B e C.
*/

public class EquacaoBaskara {
    public static void main(String[] args) {
        double a, b, c, delta;
        double x1 = 0;
        double x2 = 0;
        double equacao1 = 0;
        double equacao2 = 0;

        System.out.println("\nPROGRAMA CALCULO DE EQUACAO USANDO BASKARA");

        System.out.print("\nDigite o  valor de A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("\nDigite o  valor de B: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("\nDigite o  valor de C: ");
        c = Double.parseDouble(System.console().readLine());

        delta = Math.pow(b, 2) - (4*a*c);

        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            equacao1 = a*Math.pow(x1, 2) + b * x1 + c;
            System.out.printf("\nValor da equacao usando bascara x1(%.2f) = %.2f\n", x1, equacao1);

            if (delta > 0) {
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                equacao2 = a*Math.pow(x2, 2) + b * x2 + c;
                System.out.printf("\nValor da equacao usando bascara x2(%.2f) = %.2f\n", x2, equacao2); 
            }

        } else {
            System.out.println("\nDelta negativo, impossivel de calcular!!!\n");
        }

    }

}
