package userinterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		/*
		Funcionario lista[]; // defino que preciso ter uma lista de funcionários
		
		// toda vez que declaro uma lista, preciso entender que tenho que definir seu tamanho
		lista = new Funcionario[6];  // esta instruçao aqui corresponde a ter declarado 6 variáveis do tipo funcionario
		
		// agora preciso criar os objetos
		lista[0] = new Chefe(1234, "Anne  ", 10000, 15, 2000.0);
		lista[1] = new Horista(1235, "Vandeco", 200, 79.80);
		lista[2] = new Comissionado(1236,"Bia", 5000.0, 17.32);
		lista[3] = new Horista(1237, "Yara", 150, 79.80);
		lista[4] = new Empreiteiro(1238, "Andre", 4850.0);
		lista[5] = new Empreiteiro(1239, "Vitor", 3925.72);
		
		
//		for (int pos = 0; pos < lista.length; pos++) {
//			System.out.println(lista[pos].getNumRegistro() + " " + lista[pos].getNome() + " R$ "+lista[pos].calcularSalario());
//		}
 * 
 */
		
		ArrayList<Funcionario> lista; // declarei
		lista = new ArrayList<Funcionario>(); // instanciei
		lista.add(new Chefe(1234, "Anne  ", 10000, 15, 2000.0));
		lista.add(new Horista(1235, "Vandeco", 200, 79.80));
		lista.add(new Comissionado(1236,"Bia", 5000.0, 17.32));
		lista.add(new Horista(1237, "Yara", 150, 79.80));
		lista.add(new Empreiteiro(1238, "Andre", 4850.0));
		lista.add(new Empreiteiro(1239, "Vitor", 3925.72));
		
		
		
		// existe um 2o tipo de FOR que só serve para listas
		for (Funcionario f : lista) {
			System.out.println(f.getNumRegistro()+ " " + f.getNome() + " R$ " + f.calcularSalario());
		}
		
		// vamos fazer do jeitão manual
		System.out.println("-------------------------------");
		for (int i=0; i<lista.size(); i++) {
		    Funcionario f = lista.get(i);				
			System.out.println(f.getNumRegistro() + " " +f.getNome() + " R$ "+f.calcularSalario());
		}
		
	}

}
