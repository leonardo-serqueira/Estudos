/*
    1. Escreva um programa em Java (utilizando switch)
    que leia três números inteiros que representam uma data
    com dia, mês e ano respectivamente. O programa deve escrever esta data da
    seguinte forma:
    dia de nome do mês de ano
*/

public class SwitchDiaMesAno {
    
    public static void main(String[] args) {
        int dia, mes, ano;

        System.out.println("\nPROGRAMA DIA MES ANO");

        System.out.print("\nDigite do dia: ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.print("\nDigite do mes(em numero): ");
        mes = Integer.parseInt(System.console().readLine());
        System.out.print("\nDigite do ano: ");
        ano = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                System.out.printf("\n%d de Janeiro de %d\n", dia, ano);
                break;
            case 2:
                System.out.printf("\n%d de Fevereiro de %d\n", dia, ano);
                break;
            case 3:
                System.out.printf("\n%d de Marco de %d\n", dia, ano);
                break;
            case 4:
                System.out.printf("\n%d de Abril de %d\n", dia, ano);
                break;
            case 5:
                System.out.printf("\n%d de Maio de %d\n", dia, ano);
                break;
            case 6:
                System.out.printf("\n%d de Junho de %d\n", dia, ano);
                break;
            case 7:
                System.out.printf("\n%d de Julho de %d\n", dia, ano);
                break;
            case 8:
                System.out.printf("\n%d de Agosto de %d\n", dia, ano);
                break;
            case 9:
                System.out.printf("\n%d de Setembro de %d\n", dia, ano);
                break;
            case 10:
                System.out.printf("\n%d de Outubro de %d\n", dia, ano);
                break;
            case 11:
                System.out.printf("\n%d de Novembro de %d\n", dia, ano);
                break;
            case 12:
                System.out.printf("\n%d de Dezembro de %d\n", dia, ano);
                break;
            default:
                System.out.print("\nMes invalido!!!\n");
        }
    }
}