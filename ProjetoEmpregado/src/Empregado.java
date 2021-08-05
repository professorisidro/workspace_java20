
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome: "+nome+"  ("+cargo+")  R$ "+salario);
	}
	
	void aumentarSalario(double perc) {
		salario = salario + salario*perc/100;
	}

}
