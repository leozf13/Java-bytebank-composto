
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contadaMariana = new Conta();
		//System.out.println(contadaMariana.saldo);
		
		System.out.println(contadaMariana.titular); //null
		
		// System.out.println(contadaMariana.titular.nome); // erro
		
		contadaMariana.titular = new Cliente(); // cliente uma referencia para o objeto cliente
		System.out.println(contadaMariana.titular); // posição na memória
		
		System.out.println(contadaMariana.titular.nome = "Mariana"); // funciona
		
	}
	
}
