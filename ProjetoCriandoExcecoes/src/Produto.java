
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0) {
			throw new RuntimeException("ID nao pode ser negativo");
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException("Descricao precisa ser preenchida!");
		}
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0) {
			throw new RuntimeException("Preco nao pode ser negativo");
		}
		this.preco = preco;
	}
}
