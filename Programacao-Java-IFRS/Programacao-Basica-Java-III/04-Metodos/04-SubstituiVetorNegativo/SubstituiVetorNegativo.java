public class SubstituiVetorNegativo {
    
    static void substituiNegativo(int n[]) {

        for(int i = 0; i <n.length; i++){
            if(n[i] < 0) n[i] = 0;
        }
    }

    public static void main(String[] args) {
        final int TAMANHO = 25;
        int A[] = new int[TAMANHO];

        System.out.println("\n<><><>PROGRAMA SUBSTITUI NEGATIVO<><><>\n");
        for(int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %dº valor dentro do vetor:", i+1);
            A[i] = Integer.parseInt(System.console().readLine());
        }

        substituiNegativo(A);
        System.out.println("\n<><><>RESULTADO<><><>\n");

        for(int i = 0; i < A.length; i++) {
            System.out.printf("\n%dº Valor dentro do vetor: %d", i+1, A[i]);
        }

        System.out.println();
    }
}