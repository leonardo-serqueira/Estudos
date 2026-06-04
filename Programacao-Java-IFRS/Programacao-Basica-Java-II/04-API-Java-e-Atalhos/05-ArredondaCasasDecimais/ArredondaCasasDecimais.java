/*
5. Escreva um programa em Java que leia um número real qualquer e um
número de casas decimais (inteiro) e o arredonde o número real para o
número de casas especificado. Por exemplo, caso o usuário informe o
número 1,1379 e 2 casas decimais, o número seria arredondado para
1,14.
*/
public class ArredondaCasasDecimais {
    
    public static void main(String[] args) {
        double numero;
        double arredonda;
        int casas;

        System.out.println("\nPROGRAMA ARREDONDA DECIMAL");
        System.out.print("\nDigite o numero para ser arredondado: ");
        numero = Double.parseDouble(System.console().readLine());
        System.out.print("Digite até que casa arredondar: ");
        casas = Integer.parseInt(System.console().readLine());

        
        arredonda = Math.pow(10, casas);

        numero = Math.round(numero * arredonda) / arredonda;

        System.out.println("\nSeu numero arredondado: " + numero);

    }

}
