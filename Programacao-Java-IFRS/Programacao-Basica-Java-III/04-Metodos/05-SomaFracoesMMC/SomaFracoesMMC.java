public class SomaFracoesMMC {
    
    static int mmc(int x, int y) {
        int mmc1 = 1;
        int mmc2 = 0;

        if ( x > 1 && y > 1) {
            if (x > y) {
                for (int i = 1; mmc1 != mmc2; i++) {
                    mmc1 = x * i;

                    for (int c = 1; mmc1 > mmc2; c++) {
                        mmc2 = y * c;
                    }
                }
            } else if (x < y){
                for (int i = 1; mmc1 != mmc2; i++) {
                    mmc1 = y * i;

                    for (int c = 1; mmc1 > mmc2; c++) {
                        mmc2 = x * c;
                    }
                }
            } else {
                mmc1 = x;
            }

            return mmc1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int num1, num2, dr;
        double n1, n2, d1, d2, nr;

        System.out.println("\n========PROGRAMA SOMA FRACOES MMC========");
        do {
            System.out.println("\nFase calculo de MMC");
            System.out.println("O MMC Deve ser maior que 1");
            System.out.print("\nDigite o primeiro numero: ");
            num1 = Integer.parseInt(System.console().readLine());
            System.out.print("Digite o segundo numero: ");
            num2 = Integer.parseInt(System.console().readLine());

            dr = mmc(num1, num2);
        } while (dr < 1);

        System.out.printf("\nMMC = %d\n", dr);

        System.out.println("\nFase calculo da fracao");
        System.out.print("\nDigite o primeiro numerador: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o Primeiro Denominador: ");
        d1 = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite o Segundo numerador: ");
        n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o Segundo Denominador: ");
        d2 = Double.parseDouble(System.console().readLine());

        nr = ((dr / d1) * n1) + ((dr / d2) * n2);

        System.out.println("\n========RESULTADO========");
        System.out.printf("\nMMC = %d", dr);
        System.out.printf("\nResultado da fracao = %.3f\n", nr);
    }
}
