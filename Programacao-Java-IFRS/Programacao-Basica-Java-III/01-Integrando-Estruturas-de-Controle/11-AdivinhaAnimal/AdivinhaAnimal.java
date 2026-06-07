/*
11.Construa um programa em Java que seja capaz de concluir qual dentre os
seguintes animais foi escolhido, através de perguntas e respostas. Animais
possíveis: leão, cavalo, homem, macaco, morcego, baleia, avestruz pingüim,
pato, águia, tartaruga, crocodilo e cobra. 
*/

public class AdivinhaAnimal {

    public static void main(String[] args) {
        char resp = 'x';

        System.out.println("\n====|PROGRAMA ADIVINHA ANIMAL|====");
        System.out.println("\nResponda as perguntas com [S para Sim ou N para Nao]");

        System.out.print("\nE mamifero? ");
        resp = System.console().readLine().charAt(0);

        if (resp == 'S' || resp == 's') {
            System.out.print("E quadrupede? ");
            resp = System.console().readLine().charAt(0);

            if (resp == 'S' || resp == 's') {
                System.out.print("E carnivoro? ");
                resp = System.console().readLine().charAt(0);
                
                if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Leao.");
                else System.out.println("\nO animal escolhido foi o Cavalo.");
            
            } else if (resp == 'N' || resp == 'n') {
                System.out.print("E bipede? ");
                resp = System.console().readLine().charAt(0);

                if (resp == 'S' || resp == 's') {
                    System.out.print("E onivoro? ");
                    resp = System.console().readLine().charAt(0);

                    if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Homem.");
                    else System.out.println("\nO animal escolhido foi o Macaco.");
                
                } else if (resp == 'N' || resp == 'n') {
                    System.out.print("E voador? ");
                    resp = System.console().readLine().charAt(0);

                    if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Morcego.");
                    else System.out.println("\nO animal escolhido foi a Baleia.");
                }
            }

        } else if (resp == 'N' || resp == 'n') {
            System.out.print("E ave? ");
            resp = System.console().readLine().charAt(0);

            if (resp == 'S' || resp == 's') {
                System.out.print("E nao-voador? ");
                resp = System.console().readLine().charAt(0);

                if (resp == 'S' || resp == 's') {
                    System.out.print("E tropical? ");
                    resp = System.console().readLine().charAt(0);

                    if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Avestruz.");
                    else System.out.println("\nO animal escolhido foi o Pinguim.");
                
                } else if (resp == 'N' || resp == 'n') {
                    System.out.print("E nadador? ");
                    resp = System.console().readLine().charAt(0);

                    if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Pato.");
                    else System.out.println("\nO animal escolhido foi a Aguia.");
                }

            } else if (resp == 'N' || resp == 'n') {
                System.out.print("E com casco? ");
                resp = System.console().readLine().charAt(0);

                if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi a Tartaruga.");
                else {
                    System.out.print("E carnivoro? ");
                    resp = System.console().readLine().charAt(0);

                    if (resp == 'S' || resp == 's') System.out.println("\nO animal escolhido foi o Crocodilo.");
                    else System.out.println("\nO animal escolhido foi a Cobra.");
                }
            }
        }
    }
}