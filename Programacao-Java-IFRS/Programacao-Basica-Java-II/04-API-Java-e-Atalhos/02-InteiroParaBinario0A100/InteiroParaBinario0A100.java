/*
    2. Escreva um programa em Java que mostre os números de
    0 a 100 e seus correspondentes em binário.
*/

public class InteiroParaBinario0A100 {
    
    public static void main(String[] args) {
        String binario = "0";
        
        System.out.println("\nPROGRAMA INTEIRO PARA BINARIO");
        
        for (int i = 0; i <= 100; i++){
            binario = Integer.toString(i, 2);

            
            System.out.printf("\nBinario de %d = %s", i, binario);
        }

        System.out.println();
        System.out.println("\nFim...");

    }

}