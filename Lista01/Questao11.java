/*O cardápio de uma lanchonete é o seguinte:
Código	Produto 			Preço unitário (R$)
10 		Pastel de carne 	1,50
11 		Coxinha de frango 	1,80
12 		Empada de frango 	1,90
20 		Hamburguer 			10,00
30 		Pizza 				8,00
50 		Suco 				2,50
Escreva um programa em Java que leia quantos produtos forem pedidos, o código
de cada produto, a quantidade e calcule o valor a ser pago por aquele lanche. Se o
valor total for maior do que R$ 50,00, deverá ser dado um desconto de 5%*/

import java.util.Scanner;
class Questao11{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int codigo = 0, quantidadeproduto, quantidadepedidos, cont = 0;
		double total = 0;
		System.out.println("Digite quantos produtos serao pedidos:");
		quantidadepedidos = ler.nextInt();
		while (cont < quantidadepedidos){
			System.out.println("Digite o codigo do produto e a quantidade: ");
			codigo = ler.nextInt();
			quantidadeproduto = ler.nextInt();
			total += somatorio(codigo, quantidadeproduto);
			cont++;
		}
		if (total > 50.00){
			total = total * 0.95;
			System.out.println("Conta total: " + total);
		}else {
			System.out.println("Conta total: " + total);
		}
	}
	static double somatorio(int cod, int quant){
		switch (cod) {
			case 10 : return (1.5 * quant);
			case 11 : return (1.8 * quant);
			case 12 : return (1.9 * quant);
			case 20 : return (10 * quant);
			case 30 : return (8 * quant);
			case 50 : return (2.5 * quant);
			default : System.out.println("Codigo digitado invalido.");
					  return (0);
		
		}
	}
}