package nucleo;

public class Conta {
	protected String nomeTitular;
	protected String cpfTitular;
	protected int    numeroConta;
	protected double saldo;
	
	public Conta(String nomeTitular, String cpfTitular, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	public String exibirInfo() {
		return "Conta: "+numeroConta+" - "+nomeTitular+ " (" + cpfTitular + ") R$ " + 
	           String.format("%.2f", saldo); 
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
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
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
