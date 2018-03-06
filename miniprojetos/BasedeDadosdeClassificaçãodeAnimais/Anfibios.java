package animais;

public class Anfibios extends Animais{
    
    public String Pega_dados(){
        return this.Nome + "," + "Anfibio" + "," + this.Especie + "," + this.Peso;
    }
}
