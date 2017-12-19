/*Crie um programa Java que peça 10 números inteiros e apresente: a média, o maior
e o menor*/

import java.util.Scanner;
class Questao8{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero, cont = 1, comparamaior = 0, comparamenor = 0;
		double media = 0;
		while (cont <= 10){
			System.out.println("Digite o " + cont + " numero: ");
			numero = ler.nextInt();
			media += numero;
			if (cont == 1){
				comparamaior = numero;
				comparamenor = numero;
			} else{
				if (comparamaior < numero){
					comparamaior = numero;
				}
				if (comparamenor > numero){
					comparamenor = numero;
				}
			}
			cont++;
		}
		media = (media / cont);
		System.out.println("Media: " + media + "\nMaior: " + comparamaior + "\nMenor: " + comparamenor);

	}
}