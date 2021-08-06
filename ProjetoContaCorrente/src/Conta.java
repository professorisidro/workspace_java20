
public class Conta {
	int    numeroConta;
	int    digitoVerif;
	String nomeTitular;
	String cpfTitular;
	double saldo;
	

	String exibir() {
		String resultado;
		
		resultado = "Conta Corrente "+numeroConta + "/" +digitoVerif + "\n" +
				    "Titular: "+nomeTitular + " ("+cpfTitular+") " + "\n" +
		       		"Saldo  :  R$ "+saldo;
		return resultado;
		
//		System.out.println("Conta Corrente "+numeroConta + "/" +digitoVerif);
//		System.out.println("Titular: "+nomeTitular + " ("+cpfTitular+")");
//		System.out.printf("Saldo: R$ %.2f\n", saldo);
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	boolean sacar(double valor) {
		boolean deuCerto;
		if (saldo >= valor) {
			saldo = saldo - valor;
			//System.out.println("Saque autorizado na conta "+numeroConta+"/"+digitoVerif);
			deuCerto = true;
		}
		else {
			//System.out.println("Saldo insuficiente, benzinho!");
			deuCerto = false;
		}		
		return deuCerto;
	}
}
