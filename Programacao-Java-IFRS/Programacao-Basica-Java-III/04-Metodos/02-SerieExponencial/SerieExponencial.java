public class SerieExponencial {
    static double calculaSerieExp(double n) {
        double fat = 1;
        double exp = 0;
        double res = 1;

        for(int i = 1; i <= 15; i++) {
            exp = Math.pow(n, i);
            fat = 1;

            for(int f = 1; f <= i; f++){
            fat *= f;
            }

            res += exp / fat;
        }
        
        return res;

    }


    public static void main(String[] args){
        double x;
        double total;

        System.out.println("\n<><><>PROGRAMA SERIE FATORIAL<><><>");
        System.out.print("\nDigite o valor de X: ");
        x = Double.parseDouble(System.console().readLine());

        total = calculaSerieExp(x);

        System.out.printf("\nTotal da serie calculada = %.4f", total);

    }
}