/*
    3. A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de
    funcionários para várias empresas em diversos ramos de atuação. Para facilitar
    o trabalho de identificação do perfil dos candidatos que se inscrevem para as
    vagas, resolveu fazer um programa para registrar alguns dados para obter as
    informações a seguir:
        a. número de candidatos do sexo feminino;
        b. número de candidatos do sexo masculino;
        c. idade média dos homens;
        d. idade média das mulheres com experiência
    Faça um programa para calcular as informações solicitadas anteriormente,
    sabendo que para cada candidato devem ser informados sexo (M ou F), idade e
    tempo de experiência profissional (em anos). Também considere que a cada
    iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato
    ou não. Quando a resposta for negativa, os resultados deverão ser
    apresentados.
*/

public class RecrutamentoCandidatos {
    
    public static void main(String[] args) {
        char sexo = 'x';
        String continuar = "sim";
        int idade = 0;
        int exp = 0;
        int mediaIdadeM = 0;
        int mediaIdadeF = 0;
        int contadorM = 0;
        int contadorF = 0;
        int contadorExpF = 0;

        System.out.println("\n====|PROGRAMA RECRUTAMENTO|====");

        do {
            System.out.print("\nDigite o sexo [masculino = M ou feminino = F]: ");
            sexo = System.console().readLine().charAt(0);
            System.out.print("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());
            System.out.print("Digite a quantidade de exeperiencia de trabalho em anos: ");
            exp = Integer.parseInt(System.console().readLine());

            if (sexo == 'F') {
                contadorF++;

                if (exp > 0) {
                    contadorExpF++;
                    mediaIdadeF += idade;
                }
            }

            if (sexo == 'M') {
                contadorM++;
                mediaIdadeM += idade;
            }

            System.out.print("\nDeseja continuar? [sim ou nao]: ");
            continuar = System.console().readLine();


        } while (!continuar.equals("nao"));

        if (contadorExpF > 0) mediaIdadeF /= contadorExpF;

        if (contadorM > 0) mediaIdadeM /= contadorM;

        System.out.println("\n====|RESULTADO|====\n");
        System.out.print("\nCandidatas femininas                   : " + contadorF);
        System.out.print("\nMedia de idade das mulheres experientes: " + mediaIdadeF);
        System.out.print("\nCandidatos masculinos                  : " + contadorM);
        System.out.print("\nMedia de idade dos homens              : " + mediaIdadeM);
        System.out.println();

    }

}