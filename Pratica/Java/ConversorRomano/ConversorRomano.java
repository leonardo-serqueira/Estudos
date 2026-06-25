import java.util.Scanner;

public class ConversorRomano {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("=== CONVERSOR DE NÚMEROS ROMANOS ===");
        System.out.print("Digite um número inteiro para converter: ");
        num = scanner.nextInt();

        String resultado = converterParaRomano(num);
        System.out.println("O número " + num + " em Romano é: " + resultado);
        
        scanner.close();
    }

    public static String converterParaRomano(int numero) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder romano = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                romano.append(simbolos[i]);
                numero -= valores[i];
            }
        }

        return romano.toString();
    }
}