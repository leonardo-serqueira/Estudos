/*
3. Faça um programa que receba o nome de oito clientes de uma
videolocadora e armazene-os em um vetor. Em um segundo vetor,
armazene a quantidade de DVDs locados em 2017 por cada um dos oito
clientes. Sabe-se que, para cada dez locações, o cliente tem direito a
uma locação grátis. Faça um programa que mostre o nome de todos os
clientes, com a quantidade de locações grátis a que ele tem direito.
*/

public class Locadora {
    public static void main(String[] args) {
        String nomes[] = new String[2];
        int dvds[] = new int[2];
    
        System.out.println("\n<><><>PROGRAMA<>LOCADORA<><><>");

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("\n<><><>%dº<>CLIENTE<><><>\n", i + 1);
            System.out.print("Nome do Cliente            : ");
            nomes[i] = System.console().readLine();
            System.out.print("Quantidade de DVDs alugados: ");
            dvds[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("\n============ LOCACOES ============");

        for (int i = 0; i < dvds.length; i++) {
            System.out.printf("\n<><><>%dº<>CLIENTE<><><>\n", i + 1);
            System.out.println("Nome                  : " + nomes[i]);
            System.out.println("DVDs alugados         : " + dvds[i]);
            System.out.println("Locacoes grátis       : " + (dvds[i] / 10));
        }
    }    
}