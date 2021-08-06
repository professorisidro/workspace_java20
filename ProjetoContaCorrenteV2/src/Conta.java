/* aqui vamos fazer um exemplo de encapsulamento
 * 
 * tentem associar encapsulamento = blindagem
 */
public class Conta {
	// como eu encapsulo?
	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	
	public String exibir() {
		return "Conta " + numeroConta + "/" + digitoVerif + "\n" + "      Titular: " + nomeTitular + " (" + cpfTitular
				+ ")" + "\n" + "      Saldo  : R$ " + saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


}
