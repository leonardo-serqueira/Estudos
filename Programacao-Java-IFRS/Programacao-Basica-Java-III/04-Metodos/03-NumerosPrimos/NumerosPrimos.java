public class NumerosPrimos {

    static void primos() {
        int cont = 0;

        for (int num = 1; num <= 100; num++) {
            cont = 0;

            for(int i = 1; i <= num; i++) {
                if ((num % i) == 0) {
                    cont++;
                }
            }

            if(cont == 2){
                System.out.println(num + " Eh primo.");
            }
        }
    }

    public static void main(String[] args){

        System.out.println("\n<><><>PROGRAMA NUMEROS PRIMOS<><><>\n");
        primos();
    }
}
