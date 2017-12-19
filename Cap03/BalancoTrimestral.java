import java.util.Scanner;

public class BalancoTrimestral{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int gastosJaneiro = 15000, gastosFevereiro = 23000,  gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre / 3;
		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
	}
}