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
public class Cavalo extends Mamifero implements Herbivoros{

    @Override
    public void Colhe() {
    }
    
    public String Pega_dados(){
        return this.Nome + "," + "Mamífero" + "," + "Cavalo" + "," + this.Peso;
    }
    
}
