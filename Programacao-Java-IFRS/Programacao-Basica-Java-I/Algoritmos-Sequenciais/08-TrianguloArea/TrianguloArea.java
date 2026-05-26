/*
    8. Faça um programa que calcule e mostre a área de um triângulo.
     Sabese que: Área = (base x altura) / 2.
     A base e altura devem ser informadas pelo usuário.
*/
public class TrianguloArea {

    public static void main(String[] args) {
        double base, altura, area;

        System.out.println("\nPROGRAMA AREA DE TRIANGULO");

        System.out.print("\nDigite a base do triangulo: ");
        base = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite a altura do triangulo: ");
        altura = Double.parseDouble(System.console().readLine());
        
        area = (base * altura) /2;

        System.out.println("\nArea do seu triangulo: "+
        String.format("%.2f", area));

    }
    
}
