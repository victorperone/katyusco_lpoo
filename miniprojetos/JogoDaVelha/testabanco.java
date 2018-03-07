/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testabanco {
    public static void main(String[] args){
        banco_de_dados Data = new banco_de_dados();
        try {
            Data.logaram("rr");
            Data.logaram("wr");
            Data.logaram("Rrss");
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(testabanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
