/*
    6. Faça um programa que mostre os conceitos finais dos alunos de uma turma de
    75 pessoas, considerando a tabela a seguir. Para isso, a nota final e o código do
    aluno deverão ser fornecidos pelo usuário. Ao final do programa, apresente a
    quantidade de alunos e a média de nota alcançada para cada conceito.
        Nota Conceito
            De 0,0 a 2,9 E
            De 3,0 a 4,9 D
            De 5,0 a 6,9 C
            De 7,0 a 8,9 B
            De 9,0 a 10,0 A
*/

public class ConceitosTurma {

    public static void main(String[] args) {
        int codigo;
        double nota;
        int contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
        double somaA = 0, somaB = 0, somaC = 0, somaD = 0, somaE = 0;

        System.out.println("\n====|PROGRAMA CONCEITOS DA TURMA|====");

        for (int cont = 1; cont <= 5; cont++) {
            System.out.printf("\nAluno %d\n", cont);
            System.out.print("Digite o codigo do aluno: ");
            codigo = Integer.parseInt(System.console().readLine());
            System.out.print("Digite a nota final do aluno: ");
            nota = Double.parseDouble(System.console().readLine());

            if (nota >= 0.0 && nota <= 2.9) {
                System.out.println("Conceito: E");
                contE++;
                somaE += nota;
            } else if (nota <= 4.9) {
                System.out.println("Conceito: D");
                contD++;
                somaD += nota;
            } else if (nota <= 6.9) {
                System.out.println("Conceito: C");
                contC++;
                somaC += nota;
            } else if (nota <= 8.9) {
                System.out.println("Conceito: B");
                contB++;
                somaB += nota;
            } else if (nota <= 10.0) {
                System.out.println("Conceito: A");
                contA++;
                somaA += nota;
            }
        }

        System.out.println("\n====|ESTATISTICAS DOS CONCEITOS|====\n");
        System.out.printf("Conceito A -> Total: %d | Media: %.1f\n", contA, (contA > 0 ? somaA / contA : 0.0));
        System.out.printf("Conceito B -> Total: %d | Media: %.1f\n", contB, (contB > 0 ? somaB / contB : 0.0));
        System.out.printf("Conceito C -> Total: %d | Media: %.1f\n", contC, (contC > 0 ? somaC / contC : 0.0));
        System.out.printf("Conceito D -> Total: %d | Media: %.1f\n", contD, (contD > 0 ? somaD / contD : 0.0));
        System.out.printf("Conceito E -> Total: %d | Media: %.1f\n", contE, (contE > 0 ? somaE / contE : 0.0));
    }
}