/*Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que
você julgar necessário*/

import java.util.Scanner;

class Empresa{
	Scanner ler = new Scanner(System.in);
	String nome;
	String cnpj;
	Funcionario[] empregados;

	int numero_empregados, quantidade_adicionados = 0;

	System.out.println("salario atual");

//	numero_empregados = ler.nextInt();

//	empregados = new Funcionario[numero_empregados];

	void adiciona(Funcionario f){
		if(quantidade_adicionados < numero_empregados){
			empregados[quantidade_adicionados] = new Funcionario();
			quantidade_adicionados += 1;
		}else{
			System.out.println("Todos os funcionarios ja adicionados.");
		}
	}
}