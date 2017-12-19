class Funcionario{
	private String nome, departamento, identidade;
	private double salario;
	Data dataDeEntrada;
	
	Funcionario(){
		nome = "A definir";
		departamento = "A escolher";
		identidade = "0.000.000-0";
		salario = 0;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	void setIdentidade(String identidade){
		this.identidade = identidade;
	}
	void setSalario(double salario){
		this.salario = salario;
	}
	
	String getNome(){
		return this.nome;
	}
	String getDepartamento(){
		return this.departamento;
	}
	String getIdentidade(){
		return this.identidade;
	}
	double getSalario(){
		return this.salario;
	}
	
	double recebeAumento(double aumento){
		return this.salario = this.salario + aumento;
	}
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	void mostra(){
		System.out.println("Nome: " + this.nome + "\nDepartamento: " + this.departamento);
		System.out.println("Salario: " + this.salario + "\nIdentidade: " + this.identidade);
		System.out.println("Data: " + this.dataDeEntrada.formatada());
	}
}