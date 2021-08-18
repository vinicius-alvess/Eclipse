
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular; // titular e uma referencia para a class Cliente

	public void depositar(double valor) {
		/*
		 * this informa que o saldo, se refere ao atributo saldo dessa conta(conta que
		 * esta chamando o metodo)
		 */
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valorDaTransferencia, Conta destino) {

		if (this.saldo >= valorDaTransferencia) {
			this.saca(valorDaTransferencia);
			// ou
			// this.saldo -= valorDaTransferencia;

			destino.depositar(valorDaTransferencia);
			// ou
			// destino.saldo += valorDaTransferencia;
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
