/*
    1. Escreva um programa em Java que calcule e mostre a raiz quadrada
    dos números de 1 a 100. Em cada linha de saída, o programa deve
    mostrar o número e sua raiz quadrada.
*/
public class RaizQuadrada1A100 {
    
    public static void main(String[] args) {
        double quadrado = 0;
        
        System.out.println("\nPROGRAMA MOSTRA RAIZ QUADRADA DE 1 A 100");
        
        for (int i = 1; i <= 100; i++){
            quadrado = Math.sqrt(i);
            
            System.out.printf("\nRaiz quadrada de %d = %.3f", i, quadrado);
        }

        System.out.println();
        System.out.println("\nFim...");

    }

}