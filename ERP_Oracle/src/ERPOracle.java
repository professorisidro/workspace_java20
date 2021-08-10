
public class ERPOracle {
	public static void main(String[] args) {
		
		
		InterfaceORACLE ioracle = new Importador();  // o importador vem da biblioteca da Isidrocorp
		
		ioracle.importInvoiceFromFile("invoice.xml");
	}

}
