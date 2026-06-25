public abstract class Eletrodomestico {
    //Encapsulamento, atributos privados
    private String nome;
    private double volume;
    private double consumo;

    //contrutor de objetos,usa os atributos
    public Eletrodomestico (String nome, double volume, double consumo) {
        this.nome = nome;
        this.volume = volume;
        this.consumo = consumo;

    }

    //Polimorfismo, metodo abstrato para subclasses modificarem
    public abstract void ligar();

    public void desligar(){
        System.out.println("Desligando...");
    }

    //portões de Encapsulamento(Getters e Setters)

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

}