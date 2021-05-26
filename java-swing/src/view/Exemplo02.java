package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 * Classe para demonstrar a utilização de janela, botões, rótulos e campo de
 * texto.
 * @author Renato Duarte Sampaio
 * @since 01/03/2021
 */
public class Exemplo02 {

	// método responsavel por criar a tela e adicin ionas seus Componentes.

	public void iniciaGui() {

		// Definindo a tela e suas confg.
		JFrame janela = new JFrame();
		// Configurando o titulo da tela.
		janela.setTitle("Exemplo de campo de texto");
		// Configurando o tamnho da tela.
		janela.setSize(300, 200);
		// Definir o layout como nulo da janela.
		janela.getContentPane().setLayout(null);
		// Configurando a centralização do objeto janela.
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo o rótulo e suas configurações JLabel.
		 */

		JLabel lbNome = new JLabel();
		// Configurando o texto a ser exbido na Label.
		lbNome.setText("Nome: ");
		// configurando o Tamanho e posição da label na janela .
		// 1º - Posição X do ponto 0 para direita
		// 2º - Posição Y do ponto 0 para baixo
		// 3º - Largura
		// 4º - Altura F
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * Definindo o campo de texto( Digitação para o usuário. )
		 */
		JTextField tfNome = new JTextField();
		// configurando o tamanho e local do campao de texto.
		// 1º - Posição X do ponto 0 para direita
		// 2º - Posição Y do ponto 0 para baixo
		// 3º - Largura
		// 4º - Altura 
		tfNome.setBounds(60, 10, 150, 20);

		/*
		 * Definindo o botão e suas configurações.
		 */
		JButton botao = new JButton();
		// configurando o texto do Button.
		botao.setText("Clique Aqui");
		// Configurando o tamanho e local do Botao.
		// 1º - Posição X do ponto 0 para direita
		// 2º - Posição Y do ponto 0 para baixo
		// 3º - Largura
		// 4º - Altura 
		botao.setBounds(10, 60, 100, 20);
		
		/*
		 * Adicionando os componentes na tela.
		 */

		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);
		
		/*
		 * Configurando o parametro de visualização da tela
		 */
		
		janela.setVisible(true);
		
	}// fim do método
	
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}

}// fim da classe.
