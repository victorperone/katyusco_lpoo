/*Crie um programa Java para verificar se o aluno foi aprovado (média maior ou igual
a 7,0), se vai fazer final (média maior ou igual a 5,0 e menor do que 7,0) ou se foi
reprovado (média abaixo de 5,0). O usuário deverá informar 4 notas*/

import java.util.Scanner;
class Questao4{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,media;
		System.out.println("Digite as notas: ");
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();
		nota4 = ler.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media >= 7){
			System.out.println("Aprovado");
		}else {
			if (media >= 5 && media < 7){
				System.out.println("Final");
			}else {
				System.out.println("Reprovado");
			}
		}
	}
}