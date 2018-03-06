
package animais;

import java.io.IOException;
import java.util.ArrayList;

public class banco_de_dados {
    ArrayList<Animais> cadastros = new ArrayList<>();
    Salva_le_dados IOinteration = new Salva_le_dados();
    
    public banco_de_dados(){
        ArrayList<String> Dados = this.IOinteration.Le_dados();
        //System.out.println(Dados);
        for (int i = 0; i < Dados.size(); i++){
            Animais animal = new Animais();
            String dados[] = new String[2];
            dados = Dados.get(i).split(",");
            animal.setNome(dados[0]);
            animal.setTipo(dados[1]);
            animal.setEspecie(dados[2]);
            animal.setPeso(Float.parseFloat(dados[3]));
            this.cadastros.add(animal);
        }
        
    }
    
    public void Remove_animal(String Nome) throws IOException{
        for(int i = 0; i < this.cadastros.size(); i ++){
            if(this.cadastros.get(i).getNome().equals(Nome)){
                System.out.println("Removendo: " + this.cadastros.get(i).getNome());
                this.cadastros.remove(i);
            }
        }
        
        this.IOinteration.apaga_arquivo();
        for (int i = 0; i < cadastros.size(); i++){
            this.IOinteration.Salva_Dados(cadastros.get(i).Pega_dados());
        }
    }
    
    public void Adiciona_animal(Animais animal) throws IOException{
        this.cadastros.add(animal);
        this.IOinteration.apaga_arquivo();
        for (int i = 0; i < cadastros.size(); i++){
            this.IOinteration.Salva_Dados(cadastros.get(i).Pega_dados());
        }
    }
    
    public void Imprime_dados(){
        System.out.println("------------------");
        System.out.println("------ANIMAIS!----");
        for (Animais cadastro : this.cadastros){
            cadastro.imprime_dado();
        }
    }
    
    public void apaga_arquivo() throws IOException{
        this.IOinteration.apaga_arquivo();
    }
    
    /*
    public void logaram(String NickName) throws IOException{
        boolean existe = false;
        for (Animais cadastro : this.cadastros) {
            if(cadastro.getNickName().equals(NickName)){
                existe = true;
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
    */
    
    public void alterar(String Nome, String Novo_nome, float peso) throws IOException{
        for (Animais cadastro : this.cadastros) {
            if (cadastro.getNome().equals(Nome)){   //encontrou o animal na lista
                if (Nome.equals("NO_NAME") == false){
                    cadastro.setNome(Novo_nome);
                }
                if (peso > 0){
                    cadastro.setPeso(peso);
                }
            }
        }
        this.IOinteration.apaga_arquivo();
        for (Animais cadastro : this.cadastros){
                this.IOinteration.Salva_Dados(cadastro.Pega_dados());
        }
    }
}
