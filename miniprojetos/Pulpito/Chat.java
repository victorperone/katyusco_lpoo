package chat;

import java.lang.Runnable;
import java.lang.Thread;
import java.io.IOException;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) throws IOException {
        Scanner mensagem = new Scanner(System.in);
        Salva_le_dados Data = new Salva_le_dados();
        
        System.out.println("Por favor se identifique: ");
        String usuario = mensagem.nextLine();
        Data.Salva_Dados(usuario + " chegou!!!");
        
        SimpleThread run = new SimpleThread(usuario);
        run.start();
        
        while(true){
            String Mensagem = mensagem.nextLine();
            Data.Salva_Dados(usuario + ": " + Mensagem);
        }
        
        
    }
    
}
