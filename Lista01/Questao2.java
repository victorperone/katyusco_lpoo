/*Crie um programa Java que determine a idade atual da pessoa, baseado no ano de nascimento*/

import java.util.Scanner;
class Questao2{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int nascimento, idade;
		System.out.println("Digite o ano de nascimento: ");
		nascimento = ler.nextInt();
		idade = 2017 - nascimento;
		System.out.println("A idade eh: " + idade);
	}
}