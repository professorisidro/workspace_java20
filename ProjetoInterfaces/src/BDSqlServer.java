
public class BDSqlServer implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("MS daemon for SQL Server started");
	}

	@Override
	public void executar(String comando) {
		System.out.println("mssql> "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("MS daemon for SQL Server shut down");
		
	}

}
