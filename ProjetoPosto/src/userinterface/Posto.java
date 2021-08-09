package userinterface;

import core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {
		BombaDeCombustivel b1;
		
		b1 = new BombaDeCombustivel("Etanol Gourmet", 4.49);
		
		b1.abastecerPorLitros(85.0);
		System.out.println(b1.exibirRecibo());
		
		System.out.println();
		
		b1.abastecerPorValor(20.0);
		System.out.println(b1.exibirRecibo());
		
	}

}
