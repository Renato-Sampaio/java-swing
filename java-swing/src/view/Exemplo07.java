package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe responsavel por demonstrar a utiliza��o de campo de senha.
 * @author Renato Duarte Sampaio
 *
 * @since 2 de mar. de 2021
 */
public class Exemplo07 {
	
	//declarando os atributos da tela.
	private JFrame janela;
	
	//label para exibir o r�tulo SENHA na tela
	private JLabel lbSenha;
	//compo para digitar o r�tulo a senha e n�o exibir o que foi digitado.
	private JPasswordField pfSenha;
	//painel para organiza��o dos componentes.
		private JPanel painel;
	
	/*
	 * M�todo para criar a tela
	 */
	public void iniciaGui() {// Inicio do m�todo
		
		janela = new JFrame();
		// Configura��es do titulo da tela
		janela.setTitle("Exemplo de PasswordField");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(390, 300);
		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		
		/*
		 * configurando a Label.
		 */
		lbSenha = new JLabel();
		lbSenha.setText("Senha:");
		lbSenha.setBounds(10, 40, 40, 20);
		
		/*
		 * configurando o JPasswordFild.
		 */
		pfSenha = new JPasswordField();
		pfSenha.setBounds(60, 40, 100, 20);
		
		/*
		 *  configurando painel.
		 */
	
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbSenha);
		painel.add(pfSenha);
		
		// Visualizando a tela.
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new Exemplo07().iniciaGui();
	}
}
