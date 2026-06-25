public class Geladeira extends Eletrodomestico {
    //Construtor de subclasse repassando dados a classe mãe via super()
    public Geladeira (String nome, double volume, double consumo) {
        super(nome, volume, consumo);
    }

    //sobre escreve o metodo ligar(Polimorfismo)
    @Override
    public void ligar(){
        System.out.println("Geladeira " + getNome() + " Esta gelando.");
        System.out.println("Consome: " + getConsumo() + "kWh hora");
    };
    
}
