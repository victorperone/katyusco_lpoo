/*Faça um programa Java que leia um número e divida-o por dois (sucessivamente)
até que o resultado seja menor que 1. Mostre o resultado da última divisão e a
quantidade de divisões efetuadas*/

import java.util.Scanner;
class Questao10{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int quantidade = 0;
		double numero, resultado;
		System.out.println("Digite um numero: ");
		numero = ler.nextDouble();
		while(numero > 1){
			quantidade ++;
			numero = numero / 2;
		}
		System.out.println("Resultado da ultima divisao: " + numero);
		System.out.println("Quantidade de divisoes: " + quantidade);
	}
}