package jogodavelha;

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
    static int linha;
    
    public ArrayList Le_dados(){
        ArrayList<String> Dados_para_retorno = new ArrayList<>();
        try {
            FileReader arq = new FileReader("Jogadores.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
                                              // a variável "linha" recebe o valor "null" quando o processo
                                              // de repetição atingir o final do arquivo texto
            //System.out.println("linha lida: " + linha);                                
            while (linha != null) {
              Dados_para_retorno.add(linha);
              //System.out.println("linha lida: " + linha);
              linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            
            arq.close();
            return Dados_para_retorno;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo", e.getMessage());
            return Dados_para_retorno;
        }
    }
    
    public void apaga_arquivo() throws IOException{
        FileWriter arq = new FileWriter("Jogadores.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("");
        arq.close();
    }
    
    public void Salva_Dados(String data) throws FileNotFoundException, IOException{
        ArrayList<String> dados = new ArrayList<>();
        try {
            FileReader arq = new FileReader("Jogadores.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
                                            // a variável "linha" recebe o valor "null" quando o processo
                                            // de repetição atingir o final do arquivo texto
            int o_cont_q_vai_salvar_meu_codigo = 0;
            while (linha != null) {
                
                    dados.add(linha);
                    System.out.println(linha);
                
                o_cont_q_vai_salvar_meu_codigo += 1;
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo", e.getMessage());
        }
        FileWriter arq = new FileWriter("Jogadores.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        for(int i = 0; i < dados.size(); i++) {
            gravarArq.printf(dados.get(i) + "\n");
        }
        gravarArq.printf(data + "\n");
        arq.close();
    }
    
}
