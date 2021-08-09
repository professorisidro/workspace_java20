package core;

public class Pessoa {
	protected String nome;
	protected String email;
	
	public void exibir() {
		System.out.println("Pessoa: "+nome+"/"+email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
