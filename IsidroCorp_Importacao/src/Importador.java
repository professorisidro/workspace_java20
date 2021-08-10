
public class Importador implements InterfaceORACLE, MSInterfaceInvoice {
	
	public void importarInvoice(String invoice) {
		System.out.println("ISIDROCORP - Importei "+invoice+ " com sucesso");
	}

	@Override
	public void importInvoiceFromFile(String invoice) {
		importarInvoice(invoice);
	}

	@Override
	public void msMethodImportInvoice(String filename) {
		importarInvoice(filename);
	}
}
