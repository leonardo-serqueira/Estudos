/*
13. As Ilhas Weblands formam um reino independente nos mares do Pacífico.
Como é um reino recente, a sociedade é muito influenciada pela informática. A
moeda oficial é o Bit; existem notas de B$ 50,00, B$10,00, B$5,00 e B$1,00.
Você foi contratado(a) para ajudar na programação dos caixas automáticos de
um grande banco das Ilhas Weblands.
Os caixas eletrônicos das Ilhas Weblands operam com todos os tipos de
notas disponíveis, mantendo um estoque de cédulas para cada valor (B$ 50,00,
B$10,00, B$5,00 e B$1,00). Os clientes do banco utilizam os caixas eletrônicos para
efetuar retiradas de um certo número inteiro de Bits.
Sua tarefa é escrever um algoritmo e um programa que, dado o valor de
Bits desejado pelo cliente, determinem o número de cada uma das notas
necessário para totalizar esse valor, de modo a minimizar a quantidade de cédulas
entregues. Por exemplo, se o cliente deseja retirar B$50,00, basta entregar uma
única nota de cinquenta Bits. Se o cliente deseja retirar B$72,00, é necessário
entregar uma nota de B$50,00, duas de B$10,00 e duas de B$1,00. Notas cuja
quantidade for zero não devem ser mostradas.
Todos os caixas iniciam sua operação com um número de 100 notas de cada
valor. O programa não deve permitir saques que utilizam mais notas do que o
contido no caixa. Além disso, o valor máximo que pode ser sacado a cada retirada é
de B$ 1000,00.
O programa deve permitir que o usuário entre com diversos valores, até
que ele digite um número negativo ou atinja o número limite de saques, que é de
100. A cada saque, o número de notas no caixa de cada valor deve ser
decrementado de acordo com o valor retirado.
Ao final, o algoritmo/programa deve mostrar o total de cada nota que resta
no caixa. Como exemplo, consideremos um caso em que três saques foram feitos,
no valor de 100, 20 e 7 bits. O relatório deveria mostrar:
Restam 98 notas de B$ 50, 98 notas de B$ 10, 99 notas
de R$ 5 e 98 notas de B$ 1.
*/

public class CaixaIlhasWeblands {
    
    public static void main(String[] args) {
        int caixaBit1 = 3, caixaBit5 = 2, caixaBit10 = 2, caixaBit50 = 2;
        int valor = 0, guardaValor = 0;
        int limiteSaque = 10;
        boolean caixaVazio = false;

        System.out.println("\n|<>||<>||<>|PROGRAMA<>CAIXA<>WEBLANDS|<>||<>||<>|");
        
        do{
            int bit1 = 0,bit5 = 0, bit10 = 0, bit50 = 0;

            System.out.println("\n|<>||<>||<>|CAIXA|<>||<>||<>|");
            System.out.printf("Restam %d notas de B$ 50, %d notas de B$ 10, %d notas de R$ 5 e %d notas de B$ 1.\n",
            caixaBit50, caixaBit10, caixaBit5, caixaBit1);
            System.out.printf("\n%d Saques restantes", limiteSaque);
            System.out.print("\nDigite o valor do saque: ");
            valor = Integer.parseInt(System.console().readLine());
            
            if (valor < 1000) {
                if (valor > 0) {

                    guardaValor = valor;

                    while (caixaBit50 > 0 && valor >= 50) {
                        valor -= 50;
                        bit50++;
                        caixaBit50--;
                    };

                    while (caixaBit10 > 0 && valor >= 10) {
                        valor -= 10;
                        bit10++;
                        caixaBit10--;
                    };

                    while (caixaBit5 > 0 && valor >= 5) {
                        valor -= 5;
                        bit5++;
                        caixaBit5--;
                    };


                    while (caixaBit1 > 0 && valor >= 1) {
                        valor -= 1;
                        bit1++;
                        caixaBit1--;
                    };

                    if (valor > 0) {
                        System.out.printf("\nNao a notas o suficiente para o saque de %d bits. tente outro valor.\n", guardaValor);
                        
                        caixaBit1 += bit1;
                        caixaBit5 += bit5;
                        caixaBit10 += bit10;
                        caixaBit50 += bit50;

                    } else {
                        System.out.println("\n|<>||<>|<>|QUANTIDADE DE NOTAS SAQUADAS|<>||<>||<>|");
                        if (bit50 > 0) System.out.print("\nNotas de 50: " + bit50);
                        if (bit10 > 0) System.out.print("\nNotas de 10: " + bit10);
                        if (bit5 > 0)  System.out.print("\nNotas de 5 : " + bit5);
                        if (bit1 > 0)  System.out.print("\nNotas de 1 : " + bit1);
                        System.out.print("\nSeu Valor  : " + guardaValor);
                        System.out.println();

                        limiteSaque--;
                    }

                }

                if (caixaBit1 == 0 && caixaBit5 == 0 && caixaBit10 == 0 && caixaBit50 == 0) {
                    System.out.print("\nCaixa vazio...\n");
                    caixaVazio = true;
                }
            
            } else {
                System.out.println("\nValor deve ser menor que 1000!!!");
            }

        } while (valor >= 0 && limiteSaque > 1 && caixaVazio == false);
        
        System.out.println("\nFim...\n");

    }

}