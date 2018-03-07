
package jogodavelha;

import java.io.IOException;
import java.util.ArrayList;

public class banco_de_dados {
    ArrayList<Jogador> cadastros = new ArrayList<>();
    Salva_le_dados IOinteration = new Salva_le_dados();
    
    public banco_de_dados(){
        ArrayList<String> Dados = this.IOinteration.Le_dados();
        //System.out.println("FOI CHAMADO!!");
        
        for (int i = 0; i < Dados.size(); i++){
            Jogador fulano = new Jogador();
            String dados[] = new String[5];
            dados = Dados.get(i).split(",");
            fulano.setNickName(dados[0]);
            fulano.setVitorias(Integer.parseInt(dados[1]));
            fulano.setDerrotas(Integer.parseInt(dados[2]));
            fulano.setEmpates(Integer.parseInt(dados[3]));
            fulano.setParticipacoes(Integer.parseInt(dados[4]));
            this.cadastros.add(fulano);
        }
        
    }
    
    public void apaga_arquivo() throws IOException{
        this.IOinteration.apaga_arquivo();
    }
    
    public void Imprime_dados(){
        System.out.println("--------------------------");
        for (Jogador cadastro : this.cadastros) {
            System.out.println("NickName: " + cadastro.getNickName());
            System.out.println("Vitorias: " + cadastro.getVitorias());
            System.out.println("Derrotas: " + cadastro.getDerrotas());
            System.out.println("Empates:  " + cadastro.getEmpates());
            System.out.println("Participações: " + cadastro.getParticipacoes());
            System.out.println("--------------------------");
        }
    }
    
    public void logaram(String NickName) throws IOException{
        boolean existe = false;
        for (Jogador cadastro : this.cadastros) {
            if(cadastro.getNickName().equals(NickName)){
                existe = true;
                //System.out.println("Ja cadastrado");
            }
        }
        
        if (existe == false){
            Jogador fulano = new Jogador();
            fulano.setNickName(NickName);
            this.cadastros.add(fulano);
            this.IOinteration.apaga_arquivo();
            for (int i = 0; i < cadastros.size(); i++){
                this.IOinteration.Salva_Dados(cadastros.get(i).Pega_Dados());
                System.out.println(cadastros.size());
            }
        }
    }
    
    public void ganharam(String Vencedor, String Perdedor) throws IOException{
        for (Jogador cadastro : this.cadastros) {
            if (cadastro.getNickName().equals(Vencedor)){
                cadastro.setVitorias(cadastro.getVitorias() + 1);
                cadastro.setParticipacoes(cadastro.getParticipacoes() + 1);
            }
            if (cadastro.getNickName().equals(Perdedor)){
                cadastro.setDerrotas(cadastro.getDerrotas() + 1);
                cadastro.setParticipacoes(cadastro.getParticipacoes() + 1);
            }
        }
        this.IOinteration.apaga_arquivo();
        for (Jogador cadastro : this.cadastros){
                this.IOinteration.Salva_Dados(cadastro.Pega_Dados());
        }
    }
    
    public void empataram(String Jogador1, String Jogador2) throws IOException{
        for (Jogador cadastro : this.cadastros) {
            if (cadastro.getNickName().equals(Jogador1) || cadastro.getNickName().equals(Jogador2)){
                cadastro.setEmpates(cadastro.getEmpates() + 1);
                cadastro.setParticipacoes(cadastro.getParticipacoes() + 1);
            }
        }
        this.IOinteration.apaga_arquivo();
        for (Jogador cadastro : this.cadastros){
                this.IOinteration.Salva_Dados(cadastro.Pega_Dados());
        }
    }
    
    public String menos_vitorias(String Jogador1, String Jogador2){
        int Jogador_um = 0, Jogador_dois = 0;
        for (Jogador cadastro : this.cadastros){
            if (cadastro.getNickName().equals(Jogador1)){
                Jogador_um = cadastro.getVitorias();
                //System.out.println("Jogador um tem " + Jogador_um);
            }
            else{
                if (cadastro.getNickName().equals(Jogador2)){
                    Jogador_dois = cadastro.getVitorias();
                    //System.out.println("Jogador dois tem " + Jogador_dois);
                }
            }
        }
        if (Jogador_um > Jogador_dois){
            return Jogador2;
        }
        return Jogador1;
    }
    
}
