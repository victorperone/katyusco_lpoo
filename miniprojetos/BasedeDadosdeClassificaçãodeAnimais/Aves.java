package animais;

public class Aves extends Animais{
    
    public String Pega_dados(){
        return this.Nome + "," + "Ave" + "," + this.Especie + "," + this.Peso;
    }
}
