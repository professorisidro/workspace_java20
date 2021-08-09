package nucleo;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numero, double limite) {
		super(nomeTitular, cpf, numero );
		this.limite = limite;
	}
	
	public String exibirInfo() {
		return "Conta Especial: "+super.numeroConta+" - "+super.nomeTitular +
			   " ("+super.cpfTitular+")  R$ "+String.format("%.2f", super.saldo) +
			   " Limite R$ "+String.format("%.2f", this.limite);
	}
	
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
