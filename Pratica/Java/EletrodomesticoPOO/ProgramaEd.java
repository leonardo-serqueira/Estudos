public class ProgramaEd {
    public static void main(String[] args) {
        //lista aparelhos do tipo Eletrodomestido
        Eletrodomestico[] aparelhos = new Eletrodomestico[2];

        System.out.println("Programa teste de Polimorfismos e outros conceitos");
        System.out.println();

        aparelhos[0] = new Geladeira("Brastemp", 44, 42);
        aparelhos[1] = new AirFryer("Ninja", 4.2, 1.5);

        for (int i = 0; i < aparelhos.length; i++) {
            Eletrodomestico aparelhoUsado = aparelhos[i];
            
            aparelhoUsado.ligar(); 
            aparelhoUsado.desligar();
            System.out.println();
        }

        ControleSmart airFryersmart = (AirFryer) aparelhos[1];

        airFryersmart.ligarPorWifi();
        airFryersmart.desligarPorWifi();
    }
}