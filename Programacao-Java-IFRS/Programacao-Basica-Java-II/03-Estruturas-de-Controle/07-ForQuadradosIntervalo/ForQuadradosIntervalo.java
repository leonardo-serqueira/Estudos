/*
    7. Faça um programa que apresente os quadrados dos números inteiros de
    15 a 200.
*/

public class ForQuadradosIntervalo {

    public static void main(String[] args) {
        int quadrado = 0;
        
        System.out.println("\nPROGRAMA QUADRADOS DE 15 A 200");

        for (int i = 15; i <= 200; i++) {
            quadrado = i * i;
            System.out.printf("\nQuadrado de %d = %d", i, quadrado);
        }    
    }
    
}