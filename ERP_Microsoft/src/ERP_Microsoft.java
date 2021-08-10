
public class ERP_Microsoft {
	public static void main(String[] args) {
		
		MSInterfaceInvoice interf = new Importador();
		
		interf.msMethodImportInvoice("invoice.txt");
	}

}
