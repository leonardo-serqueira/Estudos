/*
4. A prefeitura da cidade A realizou um concurso para seleção de técnicos
em informática. O concurso consistiu em uma prova contendo dez
questões objetivas com cinco alternativas cada (A, B, C, D ou E). Ao
todo, dez candidatos fizeram as provas.
Faça um programa em Java que leia uma matriz 10x10 contendo as
respostas de todos os candidatos. Cada linha da matriz conterá as
respostas de um candidato à cada uma das questões. O programa
também deve ler um vetor de 10 posições contendo o gabarito da prova.
Ao final, o programa deve mostrar o total de pontos obtidos por cada
candidato.
*/

public class ConcursoInformatica {
    public static void main(String[] args) {
        final int QUESTOES = 10;
        final int CANDIDATOS = 10;
        char gabarito[] = new char[QUESTOES];
        char respostas[][] = new char[CANDIDATOS][QUESTOES];
        int nota [] = new int[CANDIDATOS];

        System.out.println("\n|=<>=|=<>=|=<>=|PROGRAMA CONCURSO INFORMATICA|=<>=|=<>=|=<>=|\n");

        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Digite a %dª resposta corrreta: ", i + 1);
            gabarito[i] = System.console().readLine().toUpperCase().charAt(0);

        }

        System.out.println("\n|=<>=|=<>=|=<>=|RESPOSTAS DOS CANDIDATOS|=<>=|=<>=|=<>=|");

        for (int l = 0; l < respostas.length; l++) {
            System.out.printf("\n%dº Candidato:\n", l + 1);
            for(int c = 0; c < respostas[l].length; c++){
                System.out.printf("Digite a %dª resposta: ", c + 1);
                respostas[l][c] = System.console().readLine().toUpperCase().charAt(0);

            }
        }

        for (int l = 0; l < respostas.length; l++) {
            for(int c = 0; c < respostas[l].length; c++){
                if(respostas[l][c] == gabarito[c]) nota[l]++;
            }
  
        }

        System.out.println("\n|=<>=|=<>=|=<>=|RESULTADO|=<>=|=<>=|=<>=|");

        for (int l = 0; l < respostas.length; l++) {
            System.out.printf("\n%dº candidato:", l + 1);
            for(int c = 0; c < respostas[l].length; c++){
                System.out.printf("%4c", respostas[l][c]);
            }
            System.out.printf("\nNota: %d\n", nota[l]);
        }

    }
}