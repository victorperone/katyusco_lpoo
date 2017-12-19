/*Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme
a seguinte faixa:
Nota		Conceito
0  a 49 	Insuficiente
50 a 64 	Regular
65 a 84 	Bom
85 a 100 	Ótimo*/

import java.util.Scanner;
class Questao7{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int nota;
		System.out.println("Digite a nota: ");
		nota = ler.nextInt();
		if (nota >= 0 && nota <= 49){
			System.out.println("Insuficiente");
		}else{
			if (nota >= 50 && nota <= 64){
				System.out.println("Regular");
			}else{
				if (nota >= 65 && nota <= 84){
					System.out.println("Bom");
				}else{
					if (nota >= 85 && nota <= 100){
						System.out.println("Otimo");
					}else{
						System.out.println("Conceito Invalido");
					}
				}
			}
		}
	}
}