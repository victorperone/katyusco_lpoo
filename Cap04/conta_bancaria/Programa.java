import java.util.Scanner;

class Programa{
	public static void main(String[] args) {
		/*
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		// saca 200 reais
		minhaConta.saca(200);
		// deposita 500 reais
		minhaConta.deposita(500);		
		System.out.println("Saldo atual: " + minhaConta.saldo);
		*/
		/*
		Conta c1 = new Conta();
		c1.deposita(100);
		Conta c2 = c1; // c1 e c2 são duas referencias para o mesmo espaço de memoria!!! e nao mais dois objetos distintos
		c2.deposita(200);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		*/
		Conta conta1 = new Conta();
		conta1.dono = "Duke";
		conta1.saldo = 227;
		Conta conta2 = new Conta();
		conta2.dono = "Duke";
		conta2.saldo = 227;
		Cliente c = new Cliente();
		conta1.titular = c;
		conta1.titular.nome = "John";
		conta2.transfere(conta1,100);
		System.out.println("Saldo da conta 1: " + conta1.saldo);
		System.out.println("Dono da conta 1: " + conta1.dono);
		System.out.println("Titular da conta 1: " + conta1.titular.nome);
		//if (c1 == c2) {    // não entrará no if pois dois objetos foram criados com new! não importa que os valores sejam iaguais!
						   // A posicao na memoria deles eh diferente e por isso serao diferentes.
		//	System.out.println("Contas iguais");
		//}
	}
}