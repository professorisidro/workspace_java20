
public class BDOracle implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Connecting on OraDB service");
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle> "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting from OraDB service");
		
	}

}
