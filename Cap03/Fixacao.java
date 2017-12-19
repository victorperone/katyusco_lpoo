import java.util.Scanner;

class Fixacao{
	public static void main(String[] args){
		int i = 1, fatorial = 1;
		while (i < 11){
			for (int n = 1; n <= i; n++){
				fatorial = fatorial * n;
			}
			System.out.println("O fatorial de " + i +" eh: " + fatorial);
			i++;
			fatorial  = 1;
		}
	}
}