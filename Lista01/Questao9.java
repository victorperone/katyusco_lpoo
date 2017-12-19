/* Crie um programa Java que receba dois números do usuário e que mostre a
quantidade de números pares, a quantidade de números ímpares e a soma entre os
dois números informados*/

import java.util.Scanner;
class Questao9{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int primeiro, segundo, quantidadep, quantidadei, soma = 0;
		System.out.println("Digite os dois numeros: ");
		primeiro = ler.nextInt();
		segundo = ler.nextInt();
		if (primeiro % 2 == 0 && segundo % 2 == 0){
			quantidadep = 2;
		}else{
			if (primeiro % 2 == 0 || segundo % 2 == 0){
				quantidadep = 1;
			}else{
				quantidadep = 0;
			}
		}
		if (primeiro % 2 != 0 && segundo % 2 != 0){
			quantidadei = 2;
		}else{
			if (primeiro % 2 != 0 || segundo % 2 != 0){
				quantidadei = 1;
			}else{
				quantidadei = 0;
			}
		}
		soma = primeiro + segundo;
		System.out.println("Quantidade de numeros pares: " + quantidadep);
		System.out.println("Quantidade de numeros impares: " + quantidadei);
		System.out.println("Soma dos dois numeros: " + soma);
	}
}