import java.security.SecureRandom; //chama gerador randomico

public class Jokenpo{

    static int escolhaComputador() {
            SecureRandom random = new SecureRandom();
            
            //+1 para ser 1 a 3, antes era de 0 a 2
            int computador = random.nextInt(3) + 1; 
            return computador;
    }

    static void jogo(int n1) {
        int computador1 = escolhaComputador();
        String computador2 = "x";
        String n2 = "y";

        if (computador1 == 1) {
            computador2 = "Pedra";
        } else if (computador1 == 2) {
            computador2 = "Papel";
        } else {
            computador2 = "Tesoura";
        }

        if (n1 == 1) {
            n2 = "Pedra";
        } else if (n1 == 2) {
            n2 = "Papel";
        } else {
            n2 = "Tesoura";
        }

        System.out.println("Jogador   : " + n2);
        System.out.println("Computador: " + computador2);

        if ( n1 == computador1) { 
            System.out.println("Resultado : Empate! :o");
        } else if ((n1 == 1 && computador1 == 3) || (n1 == 2 && computador1 == 1) || (n1 == 3 && computador1 == 2)) {
        //jogador: pedra/papel/tesoura | computador: tesoura/pedra/papel
            System.out.println("Resultado : Vitoria! ;)");
        } else {
            //jogador: pedra/papel/tesoura | computador: papel/tesoura/pedra
            System.out.println("Resultado : Derrota! :(");
        }

    }



    public static void main(String[] args) {
        int escolha;

        do{
        System.out.println("|<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>|");
        System.out.println("|<>||<>|                JO-KEN-PO               |<>||<>|");
        System.out.println("|<>||<>|                                        |<>||<>|");
        System.out.println("|<>||<>|         ESCOLHA UMA DAS OPCOES         |<>||<>|");
        System.out.println("|<>||<>|        1 - PEDRA    3 - TESOURA        |<>||<>|");
        System.out.println("|<>||<>|        2 - PAPEL    0 - DESLIGAR       |<>||<>|");
        System.out.println("|<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>||<>|");
        System.out.println();
        System.out.print("Escolha: ");
        escolha = Integer.parseInt(System.console().readLine());
       
        if(escolha < 0 || escolha > 3) System.out.println("escolha invalida!!!!");
        else if(escolha > 0) jogo(escolha);
        System.out.println();
        
        } while (escolha != 0);
    }
}