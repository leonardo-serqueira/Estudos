public class SomaFatorial {

    static double calculaFatorial(double n) {
        
        for (int i = 0; i <= 20; i++) {
            int numerador = 100 - i;
            double fat = 1;
            
            for (int f = 1; f <= i; f++){
                fat *= f;
            }

            n += numerador / fat;
        }
        
        return n;
    }

    public static void main(String[] args) {
        double res = 0;

        System.out.println("\n<><><>PROGRAMA SOMA FATORIAL<><><>");

        res = calculaFatorial(res);

        System.out.printf("\nO resultado da soma da série S é: %.4f\n", res);
    }
}