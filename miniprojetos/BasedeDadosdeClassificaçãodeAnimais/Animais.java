package animais;

public class Animais {
    protected String Nome = "";
    protected String tipo = "";
    protected String Especie = "";
    protected Float Peso;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }
    
    public void imprime_dado(){
        System.out.println("------------------");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Especie: " + this.Especie);
        System.out.println("Peso: " + this.Peso);
    }
    
    public String Pega_dados(){
        return this.Nome + "," + this.tipo + "," + this.Especie + "," + this.Peso;
    }
}
