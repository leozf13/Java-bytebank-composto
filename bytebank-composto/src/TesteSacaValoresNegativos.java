
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(200);
		conta.sacar(300);
		
		System.out.println("Seu saldo atual é de: R$ " + conta.getSaldo());
	}
}
