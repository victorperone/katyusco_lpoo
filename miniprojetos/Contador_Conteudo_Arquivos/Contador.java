import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Contador extends Thread{
    private String nome;
    long inicio = System.currentTimeMillis();
    public Contador(String nome){
        this.nome = nome;
    }
    public static int totalpalavras;
    public static int totallinhas;
    public static int totalvogais;
    public static int totalconsoantes;
    public static int totaldigitos;
    public static int totalespacos;
    public static int totalespeciais;
    public static long tempototal;
    
    public void ImprimeTotais(){
        System.out.print("\narquivos " + nome + " processados em " + tempototal + "mseg\n");
            System.out.print("linhas = " + totallinhas);
            System.out.print(", palavras = " + totalpalavras);
            System.out.print(", espacos = " + totalespacos);
            System.out.print(", vogais = " + totalvogais);
            System.out.print(", consoantes = " + totalconsoantes);
            System.out.print(", digitos = " + totaldigitos);
            System.out.print(", caracretes especiais = " + totalespeciais);
            System.out.println("\n---------");
    }
    
    public void run(){
        try (InputStream is = new FileInputStream(nome)) {
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            
            String linha;
            String[] palavras;
            int quantidadepalavras = 0;
            int quantidadelinhas = 0;
            int quantidadevogais = 0;
            int quantidadeconsoantes = 0;
            int qantidadenumeros = 0;
            int quantidadeespacos = 0;
            int quantidadeespeciais = 0;
            long tepoexecucao;
            String digitos = "0123456789";
            String consoantes = "bcdfghjklmnpqrstvxwyz";

            while ((linha = br.readLine()) != null){
                palavras = linha.split("\\s+");
                quantidadepalavras += palavras.length;
                
                quantidadelinhas += 1;
                for(int i = 0; i < linha.length(); i++){

                    if(linha.substring(i, i + 1).toLowerCase().equals("a") || 
                            linha.substring(i, i + 1).toLowerCase().equals("e") || 
                            linha.substring(i, i + 1).toLowerCase().equals("i") || 
                            linha.substring(i, i + 1).toLowerCase().equals("o") || 
                            linha.substring(i, i + 1).toLowerCase().equals("u")){
                        
                        quantidadevogais += 1;
                    } else{
                        if(consoantes.contains(linha.substring(i, i + 1))){
                            quantidadeconsoantes += 1;
                        } else {
                            if(digitos.contains(linha.substring(i, i + 1))){
                                qantidadenumeros += 1;
                            } else {
                                if (linha.substring(i, i + 1).equals(" ") || 
                                        linha.substring(i, i + 1).contains("\t")){
                                    quantidadeespacos += 1;
                                } else {
                                    quantidadeespeciais += 1;
                                }
                            }
                        }
                    }
                } 
            }
            // Fechar o arquivo
            br.close();
            isr.close();
            long fim = System.currentTimeMillis();
            tepoexecucao = (fim - inicio);
            System.out.print("\narquivo " + nome + " processado em " + tepoexecucao + "mseg\n");
            tempototal += tepoexecucao;
            System.out.print("linhas = " + quantidadelinhas);
            totallinhas += quantidadelinhas;
            System.out.print(", palavras = " + quantidadepalavras);
            totalpalavras += quantidadepalavras;
            System.out.print(", espacos = " + quantidadeespacos);
            totalespacos += quantidadeespacos;
            System.out.print(", vogais = " + quantidadevogais);
            totalvogais += quantidadevogais;
            System.out.print(", consoantes = " + quantidadeconsoantes);
            totalconsoantes += quantidadeconsoantes;
            System.out.print(", digitos = " + qantidadenumeros);
            totaldigitos += qantidadenumeros;
            System.out.print(", caracretes especiais = " + quantidadeespeciais);
            totalespeciais += quantidadeespeciais;
            System.out.println("\n---------");

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
