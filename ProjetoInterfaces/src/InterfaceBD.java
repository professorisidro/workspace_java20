/* na interface eu terei APENAS uma lista de cabeçalhos de métodos
 * o propósito é definir QUAIS funcionalidades meu sistema exige
 * 
 * em outras palavras, a interface define as "cláusulas contratuais" que uma classe deve
 * cumprir, ou seja, implementar (escrever lógica)
 *
 */

public interface InterfaceBD {
	public void conectar();
	public void executar(String comando);
	public void desconectar();
}
