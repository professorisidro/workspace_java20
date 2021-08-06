import javax.swing.JOptionPane;
public class Banco {
	public static void main(String[] args) {
		
		Conta c1;
		c1 = new Conta();
				
		c1.numeroConta = -123456;
		c1.digitoVerif = 6;
		c1.nomeTitular = "Professor Isidro";
		c1.cpfTitular  = "123.456.789-00";
		c1.saldo       = -200.00;
		
		
		JOptionPane.showMessageDialog(null, c1.exibir());
		c1.depositar(50.00);
		
		if (c1.sacar(150)) {
			JOptionPane.showMessageDialog(null, "Saque foi autorizado! ");
		}
		else{
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
		
		JOptionPane.showMessageDialog(null,  c1.exibir());
		
		c1.sacar(230.00);
		
		JOptionPane.showMessageDialog(null, c1.exibir());
	}
}
