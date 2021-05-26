package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * classe Responsavel por representar utilização do componente JPanel com abas.
 * @author Renato Duarte Sampaio
 * @since 3 de mar. de 2021
 * @version 1.0
 */
public class Exemplo10 {
	
	// declarando os atributos da tela
	private JFrame janela;
	//declarando as label auxiliares.
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	// declarando as abas dos paineis.
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	//declarando componente para controle das abas.
	private JTabbedPane painelAbas;
	// declarando o painel para organizar os componentes
	private JPanel painelPrincipal;
	
	/*
	 *  método para criar a tela.
	 */
	public void iniciaGui() {
		/*
		 *  Configuração do JFrame.
		 */
		janela = new JFrame();
		// Configurações do titulo da tela
		janela.setTitle("Exemplo de Abas ");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(390, 300);
		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 *  configurando a primeira Label.
		 */
		lbAux1 = new JLabel();
		lbAux1.setText("Primeira Aba");
		
		/*
		 *  configurando a segunda Label.
		 */
		lbAux2 = new JLabel();
		lbAux2.setText("Segunda Aba");
		
		/*
		 *  configurando a terceira Label.
		 */
		lbAux3 = new JLabel();
		lbAux3.setText("Terceira Aba");
		
		/*
		 * configurações da primeira aba.
		 */
		aba1= new JPanel();
		aba1.add(lbAux1);
		
		/*
		 * configurações da segunda aba.
		 */
		aba2= new JPanel();
		aba2.add(lbAux2);
		
		/*
		 * configurações da terceira aba.
		 */
		aba3= new JPanel();
		aba3.add(lbAux3);
		
		/*
		 *  configurando o controlador de abas.
		 */
		
		painelAbas = new JTabbedPane();
		//adicionanr as abas com titulo.
		painelAbas.add("ABA 1", aba1);
		painelAbas.add("ABA 2", aba2);
		painelAbas.add("ABA 3", aba3);
		painelAbas.setBounds(14, 21, 342, 200);
		/*
		 * configurações do painel principal da tela.
		 */
		
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);
		
		// configurando a visibilidade da tela.
		janela.setVisible(true);
	}
		public static void main(String[] args) {
			new Exemplo10().iniciaGui();
		}

}
