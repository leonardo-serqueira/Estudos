/*
    12. Muitas canções populares são baseadas em padrões repetitivos. Logo é
    possível construir algoritmos que montem suas letras a partir desses padrões
    que se repetem.
    Escreva um programa em Java que gere e mostre no terminal shell
    (console) a letra da popular canção norte-americana de Natal “The Twelve Days
    of Christmas” transcrita abaixo. Utilize estruturas de controle e não
    simplesmente um System.out.print ou println em toda a música. 
*/

public class TwelveDaysChristmas {

    public static void main(String[] args) {
        String dia = "";

        System.out.println("\n====|PROGRAMA CANCAO THE TWELVE DAYS OF CHRISTMAS|====\n");

        for (int i = 1; i <= 12; i++) {
            if (i == 1) dia = "first";
            if (i == 2) dia = "second";
            if (i == 3) dia = "third";
            if (i == 4) dia = "fourth";
            if (i == 5) dia = "fifth";
            if (i == 6) dia = "sixth";
            if (i == 7) dia = "seventh";
            if (i == 8) dia = "eighth";
            if (i == 9) dia = "ninth";
            if (i == 10) dia = "tenth";
            if (i == 11) dia = "eleventh";
            if (i == 12) dia = "twelfth";

            System.out.printf("On the %s day of Christmas, my love gave to me\n", dia);

            switch (i) {
                case 12: System.out.println("twelfth drummers drumming,");
                case 11: System.out.println("eleven pipers piping,");
                case 10: System.out.println("ten lords a-leaping,");
                case 9:  System.out.println("nine ladies waiting,");
                case 8:  System.out.println("eight maids a-milking,");
                case 7:  System.out.println("seven swans a-swimming,");
                case 6:  System.out.println("six geese a-laying,");
                case 5:  System.out.println("five gold rings,");
                case 4:  System.out.println("four calling birds,");
                case 3:  System.out.println("three french hens,");
                case 2:  System.out.println("two turtle doves,");
                         System.out.println("and a partridge in a pear tree.");
                         break;
                case 1:  System.out.println("a partridge in a pear tree.");
                         break;
            }
            System.out.println();
        }
    }
}