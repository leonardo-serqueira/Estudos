/*
6. Escreva um programa em Java que simule o lançamento de um dado,
ou seja, sorteie um número entre 1 e 6.
*/

public class SimuladorDado {
    
    public static void main(String[] args) {
        int dado;

        System.out.println("\nPROGRAMA SIMULADOR DADO");

        dado = (int) (Math.random() * 6) + 1;
        
        System.out.println("\nDado = " + dado);

    }   

}
