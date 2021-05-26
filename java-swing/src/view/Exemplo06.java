/**
 * 
 */
package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe Responsavel por demonstrar a utilização de JcomboBox
 * @author Renato Duarte Sampaio
 * @since 2 de mar. de 2021
 */
public class Exemplo06 {

	// Declarando os atributos da tela
	private JFrame janela;
	private JComboBox cbxEstados;
	private JPanel painel;
	
	// Vetor auxiliar para armazenar os estados
	private String estados[] = {"São Paulo", "Paraná", "Santa Catarina", "Rio Grande do sul"};
	
	/*
	 * Método para criar a tela
	 */
	public void iniciaGui() {// Inicio do método
		
		janela = new JFrame();
		// Configurações do titulo da tela
		janela.setTitle("Exemplo de Combo Box");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(390, 300);
		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurações do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(10, 10, 300, 20);
		
		/*
		 * Configurações do painel janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);
		
		janela.setVisible(true);
		
	} // Fim do método 
	
	public static void main(String[] args) {
		new Exemplo06().iniciaGui();
	}
} // Fim da classe

