/*Desenvolva um programa em Java que calcule os quadrados e cubos dos números de
0 a 10 e imprima os valores resultantes conforme a tabela abaixo.
Número Quadrado Cubo
  0       0      0
  1       1      1
  2       4      8
  3       9      27
  4       16     64
  5       25     125
  6       36     216
  7       49     343
  8       64     512
  9       81     729
  10      100    1000*/

import java.util.Scanner;
class Questao12{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Numero Quadrado Cubo");
		int numero = 0, quadrado, cubo;
		while (numero <= 10){
			quadrado = numero;
			cubo = numero;
			for (int i = 1; i < 2; i++){
				quadrado *= quadrado; 
			}
			for (int j = 1; j <= 2; j++){
				cubo = cubo * numero;
			}
			System.out.println(numero + "\t" + quadrado + "\t" + cubo);
			numero++;
		}
	}
}