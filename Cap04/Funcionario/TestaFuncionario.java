class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data(); // ligação!
		f1.dataDeEntrada = data;
		f1.mostra();
		f1.setNome("Danilo");
		f1.setSalario(100);
		Funcionario f2 = f1;
		
		f1.mostra();

		// Caso o metodo "mostra()" não estivesse implementado:
		//System.out.println("Nome: " + f1.getNome() + "\nSalario: " + f1.getSalario() + "\nGanho Anual: " + f1.calculaGanhoAnual());
		
		//  Caso os atributos da classe Funcionario não fossem "private" as alterações seriam desta forma abaixo:
		//f1.salario = 100;
		//f1.recebeAumento(50);
		//System.out.println("salario atual:" + f1.salario);
		//System.out.println("ganho anual:" + f1.calculaGanhoAnual());
	}
}