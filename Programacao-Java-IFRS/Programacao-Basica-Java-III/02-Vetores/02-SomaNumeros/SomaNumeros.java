/*
2. Faça um programa que receba cinco números e mostre a saída a seguir:
Digite o 1º número: 5
Digite o 2º número: 3
Digite o 3º número: 2
Digite o 4º número: 0
Digite o 5º número: 2
    Os números digitados foram:
        5 + 3 + 2 + 0 + 2 = 12
*/

public class SomaNumeros {

    public static void main(String[] args) {
        int soma = 0;
        int numeros [] = new int[5];

        System.out.println("\n=-=-=-PROGRAMA=SOMA=NUMERO-=-=-=\n");
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            numeros[i] =  Integer.parseInt(System.console().readLine());
            
            soma += numeros[i];
        }

        System.out.print("\nOs números digitados foram:\n");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + soma);
        System.out.println();
    }
}