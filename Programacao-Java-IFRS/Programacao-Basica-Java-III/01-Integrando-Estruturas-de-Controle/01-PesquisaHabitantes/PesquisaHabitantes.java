/*
    1. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
    dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas
    informações para cada habitante, calcule e mostre:
        - a média dos salários do grupo;
        - a maior e a menor idade do grupo;
        - a quantidade de mulheres com salário até R$ 1500,00;
        - a idade e o sexo da pessoa que possui o menor salário.
    Finalize a entrada de dados ao ser digitada uma idade negativa.
*/

public class PesquisaHabitantes {
    
    public static void main(String[] args){
        int idade = 0;
        int i = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int menorIdadeTodos = 0;
        int mulheresBaixaRenda = 0;
        double salario = 0;
        double menorSalarioTodos = 0;
        double mediaSalario = 0;
        char sexo = 'I';
        char menorSexoTodos = 'I';

        System.out.println("\n---|PROGRAMA PRESQUISA DE HABITANTES|---");
        System.out.print("\nPara encerrar o programa digite uma idade negativa\n");
        
        do {
            System.out.printf("\n%dª Pessoa", i +1);
            System.out.print("\nDigite a idade: ");
            idade = Integer.parseInt(System.console().readLine());

                if (idade >= 0) {
                    i++;
                    System.out.print("Digite o sexo [masculino = M ou feminino = F]: ");
                    sexo = System.console().readLine().charAt(0);
                    System.out.print("Digite o salario: ");
                    salario = Double.parseDouble(System.console().readLine());

                    mediaSalario += salario;

                    if (i == 1) {
                        maiorIdade = idade;
                        menorIdade = idade;
                        menorSalarioTodos = salario;
                        menorSexoTodos = sexo;
                        menorIdadeTodos = idade;
                    };

                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    };

                    if (idade < menorIdade) {
                        menorIdade = idade; 
                    };

                    if(salario < menorSalarioTodos){
                        menorSalarioTodos = salario;
                        menorSexoTodos = sexo;
                        menorIdadeTodos = idade;
                    };

                    if (salario < 1500 && sexo == 'F'){
                        mulheresBaixaRenda++;
                    };

                };

        } while(idade > 0);

        /*
        - a média dos salários do grupo;
        - a maior e a menor idade do grupo;
        - a quantidade de mulheres com salário até R$ 1500,00;
        - a idade e o sexo da pessoa que possui o menor salário.
        */

        mediaSalario /= i;

        System.out.println("\n---|RESULTADO|---");
        System.out.print("\nMedia salarial      : " + mediaSalario);
        System.out.print("\nMaior idade         : " + maiorIdade);
        System.out.print("\nMenor idade         : " + menorIdade);
        System.out.print("\nMulheres baixa renda: " + mulheresBaixaRenda);
        System.out.println("\n\n---|PESSOA MENOS AFORTUNADA|---");
        System.out.print("\nIdade  :" + menorIdadeTodos);
        System.out.print("\nSexo   :" + menorSexoTodos);
        System.out.print("\nSalario:" + menorSalarioTodos);

    }

}