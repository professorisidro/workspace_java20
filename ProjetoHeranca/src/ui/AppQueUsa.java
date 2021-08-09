package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Isidro");
		p.setEmail("isidro@isidro.com");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setNumeroMatricula(1234);
		e.setCurso("Computação");
		e.setNome("Jose");
		e.setEmail("jose@jose.com");
		e.exibir();
	}

}
