/*
4. Faça um programa que leia dois vetores (A e B) com cinco posições.
Cada vetor deverá armazenar números inteiros. O programa deve,
então, subtrair o primeiro elemento de A do último de B, acumulando o
valor; subtrair o segundo elemento de A do penúltimo de B, acumulando
o valor, e assim por diante. Ao final, mostre o resultado de todas as
subtrações realizadas.

*/

public class SubtracaoInversa {

    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        int total = 0;
        int cont = B.length - 1;
        
        System.out.println("\n---------- PROGRAMA - SUBTRACAO - INVERSA ----------");

        for (int i = 0; i < A.length; i++) {
            System.out.printf("\nAdicione o %dº numero do vetor A: ", i + 1);
            A[i] = Integer.parseInt(System.console().readLine());
            System.out.printf("Adicione o %dº numero do vetor B: ", i + 1);
            B[i] = Integer.parseInt(System.console().readLine());
        }
    
        System.out.println("\n---------- RESULTADO ----------");

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[cont];
            total += C[i];
            System.out.printf("\nValor da %dª subtracao do %d(A) pelo %d(B)= %d", i + 1, A[i], B[cont], C[i]);
            cont--;
        }

        System.out.println("\nValor total Acumulado= " + total);
    }
}