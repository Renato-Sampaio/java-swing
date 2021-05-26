package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe responsavel por demonstrar a utilização de campo de senha.
 * @author Renato Duarte Sampaio
 *
 * @since 2 de mar. de 2021
 */
public class Exemplo07 {
	
	//declarando os atributos da tela.
	private JFrame janela;
	
	//label para exibir o rótulo SENHA na tela
	private JLabel lbSenha;
	//compo para digitar o rótulo a senha e não exibir o que foi digitado.
	private JPasswordField pfSenha;
	//painel para organização dos componentes.
		private JPanel painel;
	
	/*
	 * Método para criar a tela
	 */
	public void iniciaGui() {// Inicio do método
		
		janela = new JFrame();
		// Configurações do titulo da tela
		janela.setTitle("Exemplo de PasswordField");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(390, 300);
		// Configurando a posição inicial da tela - centralizada
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
