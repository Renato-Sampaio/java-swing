package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 * Classe para demonstrar a utiliza��o de janela, bot�es, r�tulos e campo de
 * texto.
 * @author Renato Duarte Sampaio
 * @since 01/03/2021
 */
public class Exemplo02 {

	// m�todo responsavel por criar a tela e adicin ionas seus Componentes.

	public void iniciaGui() {

		// Definindo a tela e suas confg.
		JFrame janela = new JFrame();
		// Configurando o titulo da tela.
		janela.setTitle("Exemplo de campo de texto");
		// Configurando o tamnho da tela.
		janela.setSize(300, 200);
		// Definir o layout como nulo da janela.
		janela.getContentPane().setLayout(null);
		// Configurando a centraliza��o do objeto janela.
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo o r�tulo e suas configura��es JLabel.
		 */

		JLabel lbNome = new JLabel();
		// Configurando o texto a ser exbido na Label.
		lbNome.setText("Nome: ");
		// configurando o Tamanho e posi��o da label na janela .
		// 1� - Posi��o X do ponto 0 para direita
		// 2� - Posi��o Y do ponto 0 para baixo
		// 3� - Largura
		// 4� - Altura F
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * Definindo o campo de texto( Digita��o para o usu�rio. )
		 */
		JTextField tfNome = new JTextField();
		// configurando o tamanho e local do campao de texto.
		// 1� - Posi��o X do ponto 0 para direita
		// 2� - Posi��o Y do ponto 0 para baixo
		// 3� - Largura
		// 4� - Altura 
		tfNome.setBounds(60, 10, 150, 20);

		/*
		 * Definindo o bot�o e suas configura��es.
		 */
		JButton botao = new JButton();
		// configurando o texto do Button.
		botao.setText("Clique Aqui");
		// Configurando o tamanho e local do Botao.
		// 1� - Posi��o X do ponto 0 para direita
		// 2� - Posi��o Y do ponto 0 para baixo
		// 3� - Largura
		// 4� - Altura 
		botao.setBounds(10, 60, 100, 20);
		
		/*
		 * Adicionando os componentes na tela.
		 */

		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);
		
		/*
		 * Configurando o parametro de visualiza��o da tela
		 */
		
		janela.setVisible(true);
		
	}// fim do m�todo
	
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}

}// fim da classe.
