package chat;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Salva_le_dados {
    
    public String Le_dados(){
        ArrayList<String> Dados_para_retorno = new ArrayList<>();
        try {
            FileReader arq = new FileReader("Dados.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            
            arq.close();
            //System.out.println("linha lida: " + linha);
            return linha;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo", e.getMessage());
            return "Erro ao abrir";
        }
    }
    
    public void apaga_arquivo() throws IOException{
        FileWriter arq = new FileWriter("Dados.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("");
        arq.close();
    }
    
    public void Salva_Dados(String data) throws FileNotFoundException, IOException{
        FileWriter arq = new FileWriter("Dados.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.printf(data + "\n");
        arq.close();
    }
    
}
