public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	Cliente titular;
	
	/*
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	*/
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
}