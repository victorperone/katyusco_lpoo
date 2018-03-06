
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContadorConteudo {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String arquivos = br.readLine();
        String[] nomes = arquivos.split(" ");
        Thread contadores = null;
        for(String livro : nomes){
            contadores = new Contador(livro);
            contadores.start();
        }

        try{
            while(contadores.isAlive()){
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ContadorConteudo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        new Contador("totais").ImprimeTotais();

    }
}
