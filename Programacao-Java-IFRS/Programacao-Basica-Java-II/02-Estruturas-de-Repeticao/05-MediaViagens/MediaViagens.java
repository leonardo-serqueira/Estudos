/*
    5. Crie um programa para ler a quantidade de litros de combustível e a
    distância percorrida por um carro em várias viagens. O programa deve
    calcular o consumo médio do carro, que é igual a média de quilômetros
    por litro de todas as viagens. O número de viagens realizado deve ser
    informado pelo usuário.
*/

public class MediaViagens {
    public static void main(String[] args){
        int viagens;
        int contador = 0;

        double media;
        double gasolina = 0;
        double gasolinaTotal = 0;
        double distancia = 0;
        double distanciaTotal = 0;

        System.out.println("\nPROGRAMA MEDIA GASTA DE GASOLINA");

        System.out.print("\nInforme quantas viagens foram feitas: ");
        viagens = Integer.parseInt(System.console().readLine());

        if (viagens > 0) {
            while (contador < viagens) {
                contador = contador + 1;
                System.out.printf("\n%dª Viagem", contador);
                System.out.print("\nQuanta gasolina foi gasta(L): ");
                gasolina = Double.parseDouble(System.console().readLine());
                System.out.print("Qual a distancia rodada(Km): ");
                distancia = Double.parseDouble(System.console().readLine());
                gasolinaTotal = gasolinaTotal + gasolina;
                distanciaTotal = distanciaTotal + distancia;
            }
        media = distanciaTotal / gasolinaTotal;
        System.out.printf(
            "\nQuantidade de viagens: %d"+
            "\nQuantidade de Km por litro: %.2f\n",
            viagens, media);
        }
    }
}