package core;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public void abastecerPorLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
		totalPagar = qtdeLitros * precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.totalPagar = valor;
		this.qtdeLitros = this.totalPagar / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo = "******************************************\n"+
					    "*      ISIDROCORP GAS & ENERGY           *\n"+
					    "------------------------------------------\n"+
					    " Combustivel : "+nome+"\n"+
					    " Preço Litro : R$ " + String.format("%.3f\n", precoLitro) +
					    " Quantidade  :    " + String.format("%.3f\n", qtdeLitros) +
					    " Valor Total : R$ " + String.format("%.2f\n", totalPagar) +
					    "******************************************";
		return recibo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
}
