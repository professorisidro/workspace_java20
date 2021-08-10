
public class SistemaFirma {
	public static void main(String[] args) {
		
		InterfaceBD ibd = new BDSqlServer();
		// a lógica do sistema da firma é a seguinte:
		
		// passo 1 - conectar no banco
		ibd.conectar();
		
		// passo 2 - executar um comando no banco
		ibd.executar("SELECT * FROM tblCliente");
		
		// passo 3 - desconectar
		ibd.desconectar();
	}

}
