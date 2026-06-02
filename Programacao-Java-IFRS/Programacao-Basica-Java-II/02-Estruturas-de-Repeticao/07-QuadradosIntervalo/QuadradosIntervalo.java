/*
    7. Faça um programa que apresente os quadrados dos números inteiros de
    15 a 200.
*/

public class QuadradosIntervalo {
    public static void main(String[] args) {
        int numero = 15;
        int quadrado = 0;
        
        System.out.println("\nPROGRAMA QUADRADOS DE 15 A 200");

        while (numero <= 200) {
            quadrado = numero * numero;
            System.out.printf("\nQuadrado de %d = %d", numero, quadrado);
            numero = numero + 1;
        }    
    }
}
