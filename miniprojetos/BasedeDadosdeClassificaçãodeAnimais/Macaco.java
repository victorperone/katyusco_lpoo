package animais;

public class Macaco extends Animais implements Carnivoro, Herbivoros{
    public void Macaco(){
        this.Especie = "Macaco";
    }

    @Override
    public void devora() {
        }

    @Override
    public void Colhe() {
    }
    
    public String Pega_dados(){
        return this.Nome + "," + "Mamifero" + "," + "Macaco" + "," + this.Peso;
    }
    
}
