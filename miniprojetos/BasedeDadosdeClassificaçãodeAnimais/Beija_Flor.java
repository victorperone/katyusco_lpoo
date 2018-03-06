/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Cliente Preferencial
 */
public class Beija_Flor extends Aves implements Herbivoros {
    
    public String Pega_dados(){
        return this.Nome + "," + "Ave" + "," + "Beija Flor" + "," + this.Peso;
    }

    @Override
    public void Colhe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
