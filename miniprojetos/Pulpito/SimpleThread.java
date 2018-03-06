package chat;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThread extends Thread{
    String Ultima_mensagem = "";
    Salva_le_dados Data = new Salva_le_dados();
    String Usuario;

    SimpleThread(String usuario) {
        this.Usuario = usuario;
    }
    
    @Override
    public void run(){
        this.Ultima_mensagem = this.Data.Le_dados();
        while(true){
            if(Data.Le_dados().equals(this.Ultima_mensagem) == false){  //Verifica se há mensagem nova
                if(Data.Le_dados().split(":")[0].equals(this.Usuario) == false){    //Verifica se a mensagem é deste usuário
                    System.out.println(Data.Le_dados());
                }
                Ultima_mensagem = Data.Le_dados();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
