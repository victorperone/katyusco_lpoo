class TestaCarro {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		meuCarro.motor.potencia = 55;
		meuCarro.motor.tipo = "4Cilindros";
		// liga o carro
		meuCarro.liga();
		// acelera o carro
		meuCarro.acelera(20);
		System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
		System.out.println("Marcha atual: " + meuCarro.pegaMarcha());
		System.out.println("Tipo do motor: " + meuCarro.motor.tipo);
	}
}