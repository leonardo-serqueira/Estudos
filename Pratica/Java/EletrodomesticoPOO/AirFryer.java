public class AirFryer extends Eletrodomestico {
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
    
}