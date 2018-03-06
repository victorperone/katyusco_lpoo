package animais;

public class Mamifero extends Animais{
    final String tipo = "Mamifero";
    
    public String Pega_dados(){
        return this.Nome + "," + "Mamifero" + "," + this.Especie + "," + this.Peso;
    }
}
