package core;

public class Chefe extends Funcionario{
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTerno;
	
	public Chefe(int numRegistro, String nome, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
}
