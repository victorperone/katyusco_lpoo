/*Crie um programa em Java para receber um número entre 1 e 12 e imprimir o nome
do mês correspondente (em que, 1 – Janeiro e 12 – Dezembro). Crie um método em
Java que deverá receber o número e realizar a impressão*/

import java.util.Scanner;

class Questao5{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int mes;
		System.out.println("Digite o numero do mes: ");
		mes = ler.nextInt();
		Mes(mes);
	}
	static void Mes(int numero){
		switch (numero) {
			case 1 : System.out.println("Janeiro");
					 break;
			case 2 : System.out.println("Fevereiro");
					 break;
			case 3 : System.out.println("Marco");
					 break;
			case 4 : System.out.println("Abril");
					 break;
			case 5 : System.out.println("Maio");
					 break;
			case 6 : System.out.println("Junho");
					 break;
			case 7 : System.out.println("Julho");
					 break;
			case 8 : System.out.println("Agosto");
					 break;
			case 9 : System.out.println("Setembro");
					 break;
			case 10 : System.out.println("Outubro");
					  break;
			case 11 : System.out.println("Novembro");
					  break;
			case 12 : System.out.println("Dezembro");
					  break;
			default : System.out.println("Valor digitado invalido!");
		}
	
	}

}