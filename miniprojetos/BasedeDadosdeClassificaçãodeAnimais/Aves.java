package animais;

public class Aves extends Animais implements Herbivoros{
    
    public String Pega_dados(){
        return this.Nome + "," + "Ave" + "," + this.Especie + "," + this.Peso;
    }

    @Override
    public void Colhe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
