import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			Produto p = new Produto();
			int _id;

			String _strId, _nome, _strPreco;
			double _preco;

			System.out.println("Digite o ID");
			_strId = teclado.nextLine(); // leio como texto
			_id = Integer.parseInt(_strId); // converto para inteiro
			p.setId(_id);

			System.out.println("Digite o nome");
			_nome = teclado.nextLine();
			p.setNome(_nome);

			System.out.println("Digite o preco");
			_strPreco = teclado.nextLine(); // leio como string
			_preco = Double.parseDouble(_strPreco); // converto para double
			p.setPreco(_preco);

			System.out.println("Produto cadastrado!");
		} catch (Exception ex) {
			System.out.println("Erro - problema no cadastro! ");
			System.out.println("Mensagem do erro " + ex.getMessage());
		}
	}
}
