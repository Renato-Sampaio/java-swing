package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe responsavel por demonstrar a utilizaçãp de janela(Jframe e Jbutton) botao.
 * @author Renato Duarte Sampaio
 * @since 01/03/2021
 */
public class Exemplo01 { // inicio do método.
	
	//Método para exibir uma janela Swing com componente botão.
	public void iniciaGui() {
		
		// Criando o componente Jframe = Janela e adcionando o seu titulo.
		JFrame janela = new JFrame("Exemplo Tela e Botão");
		
		//criando o componente Jbutton = botão , e adicionando seu titulo.
		JButton botao = new JButton("Clique Aqui");
		
		// configurar o tamanho do objeto ( Janela ) - tela.
		// primeiro parâmetro - largura da tela
		//segundo parâmetro - altura da tela.
		janela.setSize(500, 300);
		
		// adicionando o botao na tela ( objeto janela ) content pane.
		janela.getContentPane().add(botao);
		
		// configurando a visibilidade da tela.
		janela.setVisible(true);
		
		// informando que a tela não tem layout pré definido.
		janela.getContentPane().setLayout(null);
			
	}// fim do método.

	//método principal para executar a classe.
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();;
		
	}
	
}// fim da classe.
