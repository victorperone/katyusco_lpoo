/*Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é de:
• R$ 5.50 por diária, se o número de diárias for maior que 15;
• R$ 6.00 por diária, se o número de diárias for igual a 15;
• R$ 8.00 por diária, se o número de diárias for menor que 15.
Construa um programa Java que mostre o nome e o total da conta de um cliente*/

import java.util.Scanner;
class Questao6{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double diaria = 60, numerodias, total;
		System.out.println("Digite a quantidade de diarias: ");
		numerodias = ler.nextFloat();
		if (numerodias > 15){
			total = (diaria * numerodias) + (numerodias * 5.5);
			System.out.println("Valor a ser pago: " + total);
		} else{
			if (numerodias == 15){
				total = (diaria * numerodias) + (numerodias * 6);
				System.out.println("Valor a ser pago: " + total);
			} else{
				total = (diaria * numerodias) + (numerodias * 8);
				System.out.println("Valor a ser pago: " + total);
			}
		}
	}
}