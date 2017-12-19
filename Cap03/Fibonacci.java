//0, 1, 1, 2, 3, 5, 8, 13, 21, 

import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args){
		int soma = 0, numero = 1, anterior = 0;
		while(soma <= 100){
			if(soma == 0){
				System.out.println(soma);
				soma = 1;
			}else if(soma == 1){
				System.out.println(soma);
				soma += 1;
			}else{
				soma = numero + anterior;
				anterior = numero;
				numero = soma;
				System.out.println(soma);
			}
		}
	}
}