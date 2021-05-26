/**
 * 
 */
package util;

/**
 * classe responsavel por armazenar os metodos de validação do sistema.
 * @author Renato Duarte Sampaio
 *
 * 3 de mar. de 2021
 */
public class Valida {
	
	//método para retornar se o valor String esta preenchido.
	public static boolean isEmptyOrNull (String args) {
		return (args.trim().equals("")) || ( args == null);
		
	}

}
