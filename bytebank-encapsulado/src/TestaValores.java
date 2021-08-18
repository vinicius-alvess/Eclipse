
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(15,1);
		Conta contaa = new Conta(17,26);
		Conta contaaa = new Conta(12,56);
		
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.getAgencia());
		
		System.out.println(Conta.getTotalDeContas());
		
	}

}
