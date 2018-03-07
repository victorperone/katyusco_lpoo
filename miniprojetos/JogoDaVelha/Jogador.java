package jogodavelha;

public class Jogador {
    String NickName = "";
    int vitorias = 0;
    int derrotas = 0;
    int empates = 0;
    int participacoes = 0;

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(int participacoes) {
        this.participacoes = participacoes;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    String Pega_Dados(){
        return this.NickName + "," + this.vitorias + "," + this.derrotas + "," + this.empates + "," + this.participacoes;
    }
}
