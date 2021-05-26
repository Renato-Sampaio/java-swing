/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Lasse para demonstrar a utiliza��o de janela , textArea, textField, Bot�es e suas a~~oes.
 * @author Renato Duarte Sampaio
 *
 * @since 01/03/2021
 */
public class Exemplo03 {

	/*
	 * Declarar os componentes utilizados na tela
	 */
	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;
	
	/*
	 * M�todo para criar a inst�ncia dos objetos e componentes da tela e suas configura��es
	 */
	public void iniciaGui() { // inicio do m�todo
		
		/*
		 * Configurando a tela
		 */
		janela = new JFrame();
		// Definindo o tamanho da tela
		janela.setSize(300, 300);
		// Definindo o t�tulo da tela
		janela.setTitle("Exemplo de a��es");
		//Configurando o posicionamento da janela
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurando o campo de texto
		 */
		campo = new JTextField();
		
		/*
		 * Configurando a �rea de texto
		 */
		area = new JTextArea();
		
		/*
		 * Configurando o primeiro bot�o
		 */
		botao1 = new JButton();
		// Configurando o t�tulo a ser exibido
		botao1.setText("Clique aqui");
		//adicionando um evento de clic no componente.
		botao1.addActionListener(new AcaoBotao1());
		
		/*
		 * Configurando o segundo bot�o
		 */
		botao2 = new JButton();
		// Configurando o t�tulo a ser exibido
		botao2.setText("Troca cor");
		//adicionando um evento de clic no componente.
		botao2.addActionListener(new AcaoBotao2());
		
		/*
		 * Adicionando os componentes na tela passando par�metros de localiza��o
		 */
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		
		/*
		 * Configurando os par�metros de exibi��o da tela
		 */
		janela.setVisible(true);

	} // fim do m�todo
	
	
	/*
	 * Classe interna auxiliar, para controlar a a��o do botao 1.
	 */
	
	public class AcaoBotao1 implements ActionListener { // inicio da classe interna botao1
		@Override
		public void actionPerformed(ActionEvent e) {
			// captura o conteudo digitado no textFild
			String auxiliar = campo.getText(); 
			//atribuindo o valor digitado pelo usuario no componente area.
			area.append(auxiliar + "\n");//grava as mensagens anteriores tamb�m.
			//apagando o conteudo digitado pelo usuario.
			campo.setText("");
			
			
			
		}// fim do Metodo
	}// fim da classe interna
	
	/*
	 * Classe interna auxiliar para controlar a a��o do segundo bot�o = botao2
	 */
	
	public class AcaoBotao2 implements ActionListener { // inicio da classe interna botao 2
		@Override
		public void actionPerformed(ActionEvent e) {
		//verificando se a cor ja foi cortada.
			if(area.getBackground().equals(Color.BLACK)) {
				// Definindo a cor de fundo como branco.
				area.setBackground(Color.WHITE);
				// definindo a cor do texto.
				area.setForeground(Color.BLACK);
			} else {
				area.setBackground(Color.BLACK);
				// definindo a cor do texto.
				area.setForeground(Color.WHITE);
			}
	
		}//fim do metodo
	}//fim da classe auxiliar
	
	
	// M�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
	}//fim do metodo

} // Fim da classe
