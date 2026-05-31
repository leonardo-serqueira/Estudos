/*
    4. Construa um programa que leia três valores para os lados de um
    triângulo (A, B e C). O programa deve verificar se os lados fornecidos
    formam realmente um triângulo. Em caso positivo, deve mostrar a
    mensagem “Os lados formam um triângulo” e caso contrário “Os valores
    informados não podem formar um triângulo”. Para que três valores de
    lados formem um triângulo, cada par de lados somados não pode ser
    menor ou igual ao terceiro lado.
*/

public class VerificaTriangulo {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;

        System.out.println("\nPROGRAMA VERIFICA TRIANGULO");

        System.out.print("\nInforme o lado A: ");
        ladoA = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme o lado B: ");
        ladoB = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme o lado C: ");
        ladoC = Double.parseDouble(System.console().readLine());
        
        if ((ladoA + ladoB) <= ladoC || (ladoA + ladoC) <= ladoB || (ladoB + ladoC) <= ladoA) {
            System.out.print("\nOs valores informados nao podem formar um triangulo\n");
        } else  {
            System.out.print("\nOs lados formam um triangulo\n");
        }
    }
}