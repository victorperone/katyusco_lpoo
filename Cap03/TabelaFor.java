/*1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n */

class TabelaFor{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++){
			int saida = i;
			for (int j = 1; j <= i; j++){
				saida = i*j;
				System.out.print(saida +" ");
			}
			System.out.println("");
		}
	}
}