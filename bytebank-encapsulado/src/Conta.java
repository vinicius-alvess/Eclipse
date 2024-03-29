
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // titular e uma referencia para a class Cliente
	private static int totalDeContas = 0;

	// Construtor
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		System.out.println("O total de contas � " + Conta.totalDeContas);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);

		if (agencia <= 0) {
			System.out.println("ERROR: Agencia INV�LIDA");
			return;
		}

		if (numero <= 0) {
			System.out.println("ERROR: Numero INV�LIDA");
			return;
		}

	}

	public void depositar(double valor) {
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
			destino.depositar(valorDaTransferencia);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}