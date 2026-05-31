/*
    3. Construa um programa que leia três valores numéricos (representados
    pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
    segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
    quantas raízes reais a equação possui (delta < 0 – mostrar uma
    mensagem dizendo que a equação não possui raízes reais, delta > 0 –
    mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
    uma única raiz real). 
*/

public class CalculaDelta {
    public static void main(String[] args) {
        double a, b, c, delta;

        System.out.println("\nPROGRAMA CALCULA DELTA");

        System.out.print("\nInforme o A: ");
        a = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme o B: ");
        b = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme o C: ");
        c = Double.parseDouble(System.console().readLine());

        delta = (b * b) - (4 * a * c);

        System.out.printf("\nDelta = %.3f", delta);
        
        if (delta < 0) {
            System.out.print("\nDelta nao possui raises reais\n");
        } else if (delta == 0) {
            System.out.print("\nDelta possui uma raiz real\n");
        } else {
            System.out.print("\nDelta possui duas raizes reais\n");
        }

    }
}
