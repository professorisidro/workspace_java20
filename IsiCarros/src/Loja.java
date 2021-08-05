
public class Loja {
	public static void main(String[] args) {
		// Carro é meu novo tipo de dado
		// c1 e c2 são as "variáveis" deste novo tipo - chamamos de Objetos
		Carro c1;
		Carro c2;
		
		// se fosse um tipo comum, já tava ok, porém como falamos de classes
		// precisamos solicitar à Maquina Virtual um espaço de memória
		c1 = new Carro(); // aqui reservamos memória para todas as variáveis
		c2 = new Carro();
		
		// vamos atribuir valores (forçando mesmo)
		c1.marca  = "Pórxy";
		c1.modelo = "Kaineni";
		c1.ano    = 2021;
		c1.cor    = "Preto";
		c1.preco  = 780000;
		
		c2.marca  = "Xevrolé";
		c2.modelo = "Corça";
		c2.ano    = 1997;
		c2.cor    = "Prata meio gasto";
		c2.preco  = 7500;
		
		// Vamos exibir o anúncio
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		System.out.println("---------------------");
		c1.exibirInfo();
		c2.exibirInfo();
		
	
		System.out.println("Valor do ipva do "+c1.modelo+" = "+c1.calcularIpva());
		System.out.println("Valor do ipva do "+c2.modelo+" = "+c2.calcularIpva());
		
	}
}
