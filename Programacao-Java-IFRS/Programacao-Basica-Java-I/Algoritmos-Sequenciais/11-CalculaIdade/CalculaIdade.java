/*
    11. Faça um programa que receba o ano de nascimento de uma pessoa e o
    ano atual, calcule e mostre:
    a. a idade dessa pessoa em anos;
    b. a idade dessa pessoa em meses;
    c. a idade dessa pessoa em dias (considerando que cada ano
    possui 365 dias);
    d. a idade dessa pessoa em semanas (cada ano possui 52
    semanas).
*/


public class CalculaIdade {

    public static void main(String[] args) {
        int nasc, atual, anos, meses, dias, semanas;

        System.out.println("\nPROGRAMA CALCULADORA DE IDADE");

        System.out.print("\nInforme o ano em que nasceu: ");
        nasc = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o ano atual: ");
        atual = Integer.parseInt(System.console().readLine());

        anos    = atual - nasc;
        meses   = anos  * 12;
        semanas = anos  * 52;
        dias    = anos  * 365;
        

        System.out.printf(
            "\nSua idade em anos    : %d"+
            "\nSua idade em meses   : %d"+
            "\nSua idade em semanas : %d"+
            "\nSua idade em dias    : %d",
            anos, meses, semanas, dias
        );
    }
}