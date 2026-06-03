/*
9. A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13,
21, 34, 55, ... etc, onde o próximo número é igual a soma dos dois anteriores.
Escreva um programa que gere os dez primeiros números da série de
Fibonacci, utilizando estruturas repita e do...while.
*/

public class DoWhileFibonacci {

    public static void main(String[] args) {
        int fib = 0;
        int fib2 = 0;
        int fib3 = 1;
        int contador = 0;
        
        System.out.println("\nPROGRAMA FIBONACCI");

        do{
            fib = fib + fib2;

            System.out.println("\nFibonacci: " + fib);

            fib2 = fib3;
            fib3 = fib;

            contador++;
        } while (contador < 10);
    
    }

}
