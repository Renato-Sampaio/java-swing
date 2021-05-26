/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Classe responsavel por demontrar a utilizção de paineis.
 * @author Renato Duarte Sampaio
 * @since 3 de mar. de 2021
 */
public class Exemplo09 {
	//declarando os atributos da tela.
	private JFrame janela;

	// Label auxiliar para demonstrar componentes dentro de paineis
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	private JLabel lbAux4;
	//paineis para organização dos componentes.
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;
	// painel para armazenar os outros paineis.
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
		janela.setTitle("Exemplo de JPanel ");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(422, 246);
		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 *  Configurando a 1ª label
		 */
		lbAux1 = new JLabel();
		lbAux1.setText("Painel 1");
		/*
		 *  Configurando a 2ª label
		 */
		lbAux2 = new JLabel();
		lbAux2.setText("Painel 2");
		/*
		 *  Configurando a 3ª label
		 */
		lbAux3 = new JLabel();
		lbAux3.setText("Painel 3");
		/*
		 *  Configurando a 4ª label
		 */
		lbAux4 = new JLabel();
		lbAux4.setText("Painel 4");
		
	
		/*
		 * configurano o 1º painel.
		 */
		painel1 = new JPanel();
		//configurando a posição e tamanho do painel.
		painel1.setBounds(4, 6, 200, 100);
		//layout do painel
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5 , 5));
		// borda do painel.
		painel1.setBorder(BorderFactory.createEtchedBorder());
		painel1.add(lbAux1);
		
		/*
		 * configurano o 2º painel.
		 */
		painel2 = new JPanel();
		//configurando a posição e tamanho do painel.
		painel2.setBounds(208, 6, 200, 100);
		//layout do painel
		painel2.setLayout(new BorderLayout(0,0));
		// borda do painel.
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		painel2.add(lbAux2);
		
		/*
		 * configurano o 3º painel.
		 */
		painel3 = new JPanel();
		//configurando a posição e tamanho do painel.
		painel3.setBounds(3, 109, 200, 100);
		//layout do painel
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		// borda do painel.
		painel3.setBorder(BorderFactory.createRaisedBevelBorder());
		painel3.add(lbAux3);
		
		/*
		 * configurano o 4º painel.
		 */
		painel4 = new JPanel();
		//configurando a posição e tamanho do painel.
		painel4.setBounds(208, 110, 200, 100);
		//layout do painel
		painel4.setLayout(new GridLayout(1, 1, 0, 0));
		// borda do painel.
		painel4.setBorder( new TitledBorder("Titulo"));
		painel4.add(lbAux4);
		
		// Visualizando a tela.
		janela.setVisible(true);
		
		
		/*
		 *  configurando o Painel Principal.
		 */
		
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painel1);
		painelPrincipal.add(painel2);
		painelPrincipal.add(painel3);
		painelPrincipal.add(painel4);
		
	}// fim do metodo
	
	public static void main(String[] args) {
		new Exemplo09().iniciaGui();
	}
	
	
}//fim da classe.
