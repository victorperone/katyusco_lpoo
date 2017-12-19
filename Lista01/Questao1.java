/* Crie um programa Java para receber uma velocidade em m/s e alterar para km/h */

import java.util.Scanner;
class Questao1{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int velocidadeinicial;
		System.out.println("Digite a velocidade em m/s: ");
		velocidadeinicial = ler.nextInt();
		double velocidadefinal;
		velocidadefinal = velocidadeinicial * 3.6;
		System.out.println("a velocidade em km/h: " + velocidadefinal);
	}
}