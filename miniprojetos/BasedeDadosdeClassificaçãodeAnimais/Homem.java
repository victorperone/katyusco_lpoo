package animais;

public class Homem extends Animais implements Carnivoro, Herbivoros, Domesticavel{
    public void Homem(){
        this.Especie = "Ser Humano";
    }

    @Override
    public void devora() {
    }

    @Override
    public void Colhe() {
    }

    @Override
    public void brinca() {
    }
    
    public String Pega_dados(){
        return this.Nome + "," + "Mamífero" + "," + "Humano" + "," + this.Peso;
    }
}
