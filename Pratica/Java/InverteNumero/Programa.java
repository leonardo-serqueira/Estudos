public class Programa {
    public static void main(String[] args) {
        int original = 0;

        System.out.print("Digite um numero para inverter: ");
        original = Integer.parseInt(System.console().readLine());
        int resultado = Inversor.inverterNumero(original);
        
        System.out.println("Original : " + original);
        System.out.println("Invertido: " + resultado);
    }
}
