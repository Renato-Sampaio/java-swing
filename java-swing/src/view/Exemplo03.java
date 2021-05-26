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
 * Lasse para demonstrar a utilização de janela , textArea, textField, Botões e suas a~~oes.
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
	 * Método para criar a instância dos objetos e componentes da tela e suas configurações
	 */
	public void iniciaGui() { // inicio do método
		
		/*
		 * Configurando a tela
		 */
		janela = new JFrame();
		// Definindo o tamanho da tela
		janela.setSize(300, 300);
		// Definindo o título da tela
		janela.setTitle("Exemplo de ações");
		//Configurando o posicionamento da janela
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurando o campo de texto
		 */
		campo = new JTextField();
		
		/*
		 * Configurando a área de texto
		 */
		area = new JTextArea();
		
		/*
		 * Configurando o primeiro botão
		 */
		botao1 = new JButton();
		// Configurando o título a ser exibido
		botao1.setText("Clique aqui");
		//adicionando um evento de clic no componente.
		botao1.addActionListener(new AcaoBotao1());
		
		/*
		 * Configurando o segundo botão
		 */
		botao2 = new JButton();
		// Configurando o título a ser exibido
		botao2.setText("Troca cor");
		//adicionando um evento de clic no componente.
		botao2.addActionListener(new AcaoBotao2());
		
		/*
		 * Adicionando os componentes na tela passando parâmetros de localização
		 */
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		
		/*
		 * Configurando os parâmetros de exibição da tela
		 */
		janela.setVisible(true);

	} // fim do método
	
	
	/*
	 * Classe interna auxiliar, para controlar a ação do botao 1.
	 */
	
	public class AcaoBotao1 implements ActionListener { // inicio da classe interna botao1
		@Override
		public void actionPerformed(ActionEvent e) {
			// captura o conteudo digitado no textFild
			String auxiliar = campo.getText(); 
			//atribuindo o valor digitado pelo usuario no componente area.
			area.append(auxiliar + "\n");//grava as mensagens anteriores também.
			//apagando o conteudo digitado pelo usuario.
			campo.setText("");
			
			
			
		}// fim do Metodo
	}// fim da classe interna
	
	/*
	 * Classe interna auxiliar para controlar a ação do segundo botão = botao2
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
	
	
	// Método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
	}//fim do metodo

} // Fim da classe
