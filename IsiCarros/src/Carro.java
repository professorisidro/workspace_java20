
public class Carro {
	// vamos apenas declarar as variáveis que compoem o tipo CARRO
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	// agora também precisamos criar trechos de código (subrotinas - métodos)
	// para manipular, exibir, alterar essas variáveis
	
	void exibirInfo() {
		System.out.println("Automóvel: " + marca + " - " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Preço: R$ " + preco);
	}
	
	// agora tenho uma funcionalidade que altera o valor do preço
	// porém esse percentual de desconto torna-se flexível podendo ser diferente
	// para cada objeto que o chama
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual/100;
	}
	
	// agora quero uma funcionalidade que me retorne o valor de IPVA do carro,
	// baseado em seu preço
	// tipo nome
	// calcularIpva é uma funcionalidade que retorna um valor
	double calcularIpva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		}
		else {
			valoripva = preco * 0.02;
		}
		return valoripva;
	}
}
