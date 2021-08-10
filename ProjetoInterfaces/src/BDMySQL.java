/* agora uma classe não EXTENDS uma interface, ela IMPLEMENTS uma interface
 * 
 * em outras palavras, uma CLASSE compromete-se a cumprir o contrato, escrevendo lógica
 */
public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco MySQL");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do banco MySQL");
		
	}

}
