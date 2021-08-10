/*
 *  Já que eu tenho uma classe abstrata, eu não posso dar NEW em objetos dela,
 *  porém eu posso utilizá-la de TEMPLATE  (com os requisitos estritamente essenciais
 *  que o meu tipo de dado precisa ter)
 * 
 * 
 * além disso eu posso EXIGIR que quem herdar dessa classe, compromete-se a escrever
 * a lógica dos métodos definidos (aqui na classe abstrata eu defino o 'O QUE'.. 
 * as classes filha definem o 'COMO'
 */
public abstract class Veiculo {
	String marca;
	String modelo;
	
	// aqui vem a especificação do O QUE
	public abstract void acelerar();
	public abstract void frear();	
}
