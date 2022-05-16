
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente leonardo = new Cliente();
		
		leonardo.nome = "Leonardo";
		leonardo.cpf = "088.318.219-03";
		leonardo.profissao = "Desenvolvedor";
		
		Conta contaDoLeonardo = new Conta();
		contaDoLeonardo.depositar(100);
		
		contaDoLeonardo.titular = leonardo; // referenciando que Titular da 'contaDoLeonardo' é 'leonardo' (associa)
		
		System.out.println(contaDoLeonardo.titular.cpf + contaDoLeonardo.titular.nome);
		
		System.out.println(leonardo); // referenciam o mesmo objeto
		System.out.println(contaDoLeonardo.titular); // referenciam o mesmo objeto
	}
}
