/*O sistema de avaliação de determinada disciplina, é composto por três provas. A
primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Faça um
programa em Java para calcular a média final de um aluno desta disciplina*/

import java.util.Scanner;

class Questao3{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		System.out.println("Digite a primeira nota (peso 2): ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota (peso 3): ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a terceira nota (peso 5): ");
		nota3 = ler.nextFloat();
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.println("A media final do aluno: " + media);
	}
}