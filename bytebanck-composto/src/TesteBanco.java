
public class TesteBanco {
	public static void main(String[] args) {
		
		Cliente vinicius = new Cliente();
		
		vinicius.cpf = "071.606.731-58";
		vinicius.nome = "Vinicius";
		vinicius.profissao = "Prof";
		
		Conta contaDoVinicius = new Conta();
		
		//ASSOCIA O CLIENTE VINICIUS PARA A contaDoVinicius
		contaDoVinicius.titular = vinicius;
		
		System.out.println(vinicius);
		System.out.println(contaDoVinicius.titular);
		System.out.println(contaDoVinicius.titular.nome);
		System.out.println(contaDoVinicius.titular.profissao);
		
		System.out.println(contaDoVinicius.getSaldo());
		
	}

}
