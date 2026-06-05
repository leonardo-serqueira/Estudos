/*
    5. Foi realizada uma pesquisa de algumas características físicas da população de
    certa região, a qual coletou os seguintes dados referentes a cada habitante
    para serem analisados:
        sexo (M ou F);
        cor dos olhos (1 – azuis, 2 – verdes, 3 – castanhos);
        cor dos cabelos (L – louros, C – castanhos, P – pretos, R - ruivos);
        idade;
        altura;
        peso.
    Escreva um programa que leia essas informações para cada pessoa e apresente
    a média da idade dos participantes, a média do peso e da altura de seus habitantes, a
    porcentagem de pessoas do sexo feminino, a porcentagem de pessoas do sexo
    masculino e quantas pessoas possuem olhos azuis e cabelos ruivos. A cada iteração
    deverá ser perguntado ao usuário se deseja continuar ou não. Os resultados deverão
    ser mostrados apenas quando o usuário não desejar mais inserir dados.
*/
public class PesquisaCaracteristicas {

    public static void main(String[] args) {
        char sexo, corCabelo;
        int idade, corOlhos, totalParticipantes = 0;
        int homens = 0, mulheres = 0, olhosAzuisCabelosRuivos = 0;
        double altura, peso, somaIdade = 0, somaPeso = 0, somaAltura = 0;
        double percFeminino = 0, percMasculino = 0;
        String continuar = "sim";

        System.out.println("\n====|PROGRAMA PESQUISA CARACTERISTICAS|====");

        do {
            totalParticipantes++;

            System.out.print("\nDigite o sexo [M ou F]: ");
            sexo = System.console().readLine().charAt(0);
            System.out.print("Digite a cor os olhos [1-azuis, 2-verdes, 3-castanhos]: ");
            corOlhos = Integer.parseInt(System.console().readLine());
            System.out.print("Digite a cor dos cabelos [L-louros, C-castanhos, P-pretos, R-ruivos]: ");
            corCabelo = System.console().readLine().charAt(0);
            System.out.print("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());
            System.out.print("Digite a altura: ");
            altura = Double.parseDouble(System.console().readLine());
            System.out.print("Digite o peso: ");
            peso = Double.parseDouble(System.console().readLine());

            somaIdade += idade;
            somaPeso += peso;
            somaAltura += altura;

            if (sexo == 'F' || sexo == 'f') mulheres++;
            if (sexo == 'M' || sexo == 'm') homens++;

            if (corOlhos == 1 && (corCabelo == 'R' || corCabelo == 'r')) olhosAzuisCabelosRuivos++;

            System.out.print("\nDeseja continuar? [sim ou nao]: ");
            continuar = System.console().readLine();

        } while (!continuar.equals("nao"));

        if (totalParticipantes > 0) {
            percFeminino = (mulheres * 100.0) / totalParticipantes;
            percMasculino = (homens * 100.0) / totalParticipantes;

            System.out.println("\n====|RESULTADO|====\n");
            System.out.printf("Media da idade dos participantes : %.2f\n", (somaIdade / totalParticipantes));
            System.out.printf("Media do peso dos participantes  : %.2f\n", (somaPeso / totalParticipantes));
            System.out.printf("Media da altura dos participantes: %.2f\n", (somaAltura / totalParticipantes));
            System.out.printf("Porcentagem de mulheres          : %.2f%%\n", percFeminino);
            System.out.printf("Porcentagem de homens            : %.2f%%\n", percMasculino);
            System.out.printf("Olhos azuis e cabelos ruivos     : %d\n", olhosAzuisCabelosRuivos);
        }
    }
}