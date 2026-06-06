/*
8. Em uma eleição presidencial existem quatro candidatos. Os votos são
informados por meio de um código.

Os códigos utilizados são:
1, 2, 3, 4 Votos para os respectivos candidatos
5 Voto nulo
6 Voto em branco

Faça um programa que calcule e mostre:
o total de votos para cada candidato;
o total de votos nulos;
o total de votos em branco;
a percentagem de votos nulos sobre o total de votos;
a percentagem de votos em branco sobre o total de votos.

Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos,
o programa deverá mostrar uma mensagem.
*/

public class EleicaoPresidente {

    public static void main(String[] args) {
        int codigo = -1;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0, totalVotos = 0;
        double percNulos = 0, percBrancos = 0;

        System.out.println("\n====|PROGRAMA ELEICAO PRESIDENTE|====");


        do {
            System.out.print("\nCodigos: 1 a 4 (Candidatos) | 5 (Nulo) | 6 (Branco) | 0 (Encerrar)");
            System.out.print("\nDigite o codigo do voto: ");
            codigo = Integer.parseInt(System.console().readLine());

            if (codigo > 0) {
                totalVotos++;

                if (codigo == 1) candidato1++;
                if (codigo == 2) candidato2++;
                if (codigo == 3) candidato3++;
                if (codigo == 4) candidato4++;
                if (codigo == 5) nulos++;
                if (codigo == 6) brancos++;
                
                if (codigo < 1 || codigo > 6) {
                    System.out.println("Codigo invalido!!!");
                    totalVotos--;
                }
            }

        } while (codigo != 0);

        if (totalVotos > 0) {
            percNulos = (nulos * 100.0) / totalVotos;
            percBrancos = (brancos * 100.0) / totalVotos;
        }

        System.out.println("\n====|RESULTADO DA ELEICAO|====");
        System.out.print("\nTotal de votos Candidato 1 : " + candidato1);
        System.out.print("\nTotal de votos Candidato 2 : " + candidato2);
        System.out.print("\nTotal de votos Candidato 3 : " + candidato3);
        System.out.print("\nTotal de votos Candidato 4 : " + candidato4);
        System.out.print("\nTotal de votos Nulos       : " + nulos);
        System.out.print("\nTotal de votos em Branco   : " + brancos);
        System.out.printf("\nPorcentagem de votos nulos : %.2f%%", percNulos);
        System.out.printf("\nPorcentagem de votos branco: %.2f%%", percBrancos);
        System.out.println();
    }
}