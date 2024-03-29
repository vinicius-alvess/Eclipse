package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();

		contaDaMarcela.saldo = 100;
		contaDaMarcela.depositar(50);

		System.out.println(contaDaMarcela.saldo);

		boolean conseguiuRetirar = contaDaMarcela.saca(20);

		if (conseguiuRetirar) {
			System.out.println("Saque realizada com sucesso!");
			System.out.println("Seu saldo atual � de: " + contaDaMarcela.saldo);
		} else {
			System.out.println("Saque n�o realizada!");
			System.out.println("Saldo insuficiente");
		}

		Conta contaDoVini = new Conta();

		boolean conseguiuTransferir = contaDaMarcela.transfere(100, contaDoVini);

		if (conseguiuTransferir) {
			System.out.println("Transferencia realizada com sucesso!");
			System.out.println("Seu saldo atual � de: " + contaDaMarcela.saldo);
		} else {
			System.out.println("Transferencia n�o realizada!");
			System.out.println("Saldo insuficiente");
		}

	}
}
