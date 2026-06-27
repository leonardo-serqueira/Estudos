public class AirFryer extends Eletrodomestico implements ControleSmart {
    //Construtor de subclasse repassando dados a classe mãe via super()
    public AirFryer (String nome, double volume, double consumo) {
        super(nome, volume, consumo);
    }

    //sobre escreve o metodo ligar(Polimorfismo)
    @Override
    public void ligar(){
        System.out.println("Air Fryer " + getNome() + " Esta esquentando.");
        System.out.println("Consome: " + getConsumo() + "kWh hora");
    };

    @Override
    public void ligarPorWifi() {
        System.out.println("AirFryer " + getNome() + " ligada à distância via Wifi!");
        System.out.println("Consome: " + getConsumo() + "kWh hora");
    }

    @Override
    public void desligarPorWifi(){
        System.out.println("AirFryer " + getNome() + " Desligada à distância via Wifi...");
    };
    
}