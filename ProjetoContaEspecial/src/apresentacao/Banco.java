package apresentacao;

import nucleo.Conta;
import nucleo.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c1, c2;
		
		c1 = new Conta("Isidro","1234", 9876);
		c2 = new ContaEspecial("Asdrubal","3456", 8765, 200.00);
		
		System.out.println(c1.exibirInfo());
		c1.creditar(100);
		System.out.println(c1.exibirInfo());
		if (c1.debitar(200)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1.exibirInfo());
		
		//---------------------- conta especial -----------
		System.out.println("-------------------------------");
		
		
		System.out.println(c2.exibirInfo());
		c2.creditar(30.00);
		System.out.println(c2.exibirInfo());
		if (c2.debitar(200)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c2.exibirInfo());		
	}
}
