public class Exemplo01 { 

     public static void main(String[] args) {

          double N1, N2, N3, N4, RES;     

          System.out.println("\nBem vindo ao calculador de média!\n");

          System.out.print("informa a nota do primeiro bimestre: ");

          N1 = Double.parseDouble(System.console().readLine());

          System.out.print("informa a nota do segundo bimestre: ");

          N2 = Double.parseDouble(System.console().readLine());

          System.out.print("informa a nota do terceiro bimestre: ");

          N3 = Double.parseDouble(System.console().readLine());

          System.out.print("informa a nota do quarto bimestre: ");

          N4 = Double.parseDouble(System.console().readLine());
          

          RES = (N1 + N2 + N3 + N4) / 4;       


          System.out.printf("\nMedia das notas = %.1f\n", RES);


     }

}