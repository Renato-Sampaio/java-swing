package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe responsavel por demonstrar a utiliza��p de janela(Jframe e Jbutton) botao.
 * @author Renato Duarte Sampaio
 * @since 01/03/2021
 */
public class Exemplo01 { // inicio do m�todo.
	
	//M�todo para exibir uma janela Swing com componente bot�o.
	public void iniciaGui() {
		
		// Criando o componente Jframe = Janela e adcionando o seu titulo.
		JFrame janela = new JFrame("Exemplo Tela e Bot�o");
		
		//criando o componente Jbutton = bot�o , e adicionando seu titulo.
		JButton botao = new JButton("Clique Aqui");
		
		// configurar o tamanho do objeto ( Janela ) - tela.
		// primeiro par�metro - largura da tela
		//segundo par�metro - altura da tela.
		janela.setSize(500, 300);
		
		// adicionando o botao na tela ( objeto janela ) content pane.
		janela.getContentPane().add(botao);
		
		// configurando a visibilidade da tela.
		janela.setVisible(true);
		
		// informando que a tela n�o tem layout pr� definido.
		janela.getContentPane().setLayout(null);
			
	}// fim do m�todo.

	//m�todo principal para executar a classe.
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();;
		
	}
	
}// fim da classe.
