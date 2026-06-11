/*
5. Faça um programa que receba:
    -> as notas de 15 alunos em cinco provas diferentes e armazene-as
       em uma matriz 15 x 5;
    -> os nomes dos 15 alunos e armazene-os em um vetor de 15
       posições.
O programa deverá calcular e mostrar, para cada aluno, o nome, a
média aritmética das cinco provas e a situação (aprovado, reprovado ou
exame). Um estudante estará aprovado se atingiu média maior ou igual
a sete, estará reprovado se atingiu média inferior a dois e em exame se
atingiu média entre 2 e 7.
*/

public class BoletimAlunos {
    
    public static void main(String[] args) {
        final int ALUNOS = 15;
        final int NOTAS = 5;
        double boletimNotas[][] = new double[ALUNOS][NOTAS];
        String nomeAlunos[] = new String[ALUNOS];
        double media [] = new double[ALUNOS];

        System.out.println("\n|(=)||(=)|PROGRAMA BOLETIM ALUNOS|(=)||(=)|");

        for(int a = 0; a < boletimNotas.length; a++) {
            System.out.printf("\n%dº Aluno:", a + 1);
            System.out.print("\nNome: ");
            nomeAlunos[a] = System.console().readLine();

            for(int n = 0; n < boletimNotas[a].length; n++) {
                System.out.printf("Digite a %dª nota: ", n + 1);
                boletimNotas[a][n] = Double.parseDouble(System.console().readLine());
            }
        }

        System.out.println("\n|(=)||(=)|RESULTADO|(=)||(=)|");
    
        for(int a = 0; a < boletimNotas.length; a++) {
            for(int n = 0; n < boletimNotas[a].length; n++) {
                media[a] += boletimNotas[a][n];
            }
            media[a] /= boletimNotas[a].length;

            System.out.printf("\n%dº Aluno", a + 1);
            System.out.printf("\nNome : %s", nomeAlunos[a]);
            System.out.printf("\nMedia: %.2f", media[a]);

            if(media[a] < 2) System.out.print("\nSituacao: Reprovado\n");
            else if(media[a] < 7) System.out.print("\nSituacao: Exame\n");
            else System.out.print("\nSituacao: Aprovado\n");
        }
    }
}