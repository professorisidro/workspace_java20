
public class Folha {
	public static void main(String[] args) {
		
		Funcionario f1, f2, f3;
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		
		f1.setNumFuncional(1122);
		f1.setNome("Isidro");
		f1.setEmail("isidro@acme.com");
		f1.setSalario(2000.00);
		
		f2.setNumFuncional(1133);
		f2.setNome("Jose");
		f2.setEmail("jose@acme.com");
		f2.setSalario(3000.00);
		
		f3.setNumFuncional(1144);
		f3.setNome("Pedro");
		f3.setEmail("pedro@acme.com");
		f3.setSalario(4000.00);
		
		System.out.println(f1.exibir() + " Imposto "+f1.calcularImposto());
		System.out.println(f2.exibir() + " Imposto "+f2.calcularImposto());
		System.out.println(f3.exibir() + " Imposto "+f3.calcularImposto());
	
		f1.reajustarSalario(20);
		f2.reajustarSalario(20);
		f3.reajustarSalario(20);
		System.out.println();
		System.out.println(f1.exibir() + " Imposto "+f1.calcularImposto());
		System.out.println(f2.exibir() + " Imposto "+f2.calcularImposto());
		System.out.println(f3.exibir() + " Imposto "+f3.calcularImposto());
	}

}

