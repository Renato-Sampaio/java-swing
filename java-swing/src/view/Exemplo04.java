package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe responsavel para exemplificar a utiliza��o dos radioButton.
 * 
 * @author Renato Duarte Sampaio
 * @Since 2 de mar. de 2021
 */
public class Exemplo04 {

//declarando os atributos
	private JFrame janela;

//label auxiliar para exibir oque foi selecionado
	private JLabel lbAuxiliar;

//Op��es para serem escolhidas ( botoes de op��o )
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;

// componente  Button Group responsavel por gerenciar os RadioButton.
	private ButtonGroup grpRadio;

//componente Jbutton btVerificar;
	private JButton btVerificar;

//componente de JPanel para organiza��o.
	private JPanel painel;

	/*
	 * Metodo para criar a tela.
	 */
	public void iniciaGui() {

		/*
		 * Configura��es do Jframe - tela.
		 */
		janela = new JFrame();
		// configurando o titulo.
		janela.setTitle("Exemplo de Radio Button");
		// tamanho da janela ( largura/altura)
		janela.setSize(340, 275);
		// centralizando o Jframe.
		janela.setLocationRelativeTo(null);

		/*
		 * configura��o da JLabel - r�tulo auxiliar.
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto inicial.
		lbAuxiliar.setText("Selecione o estado civil:");
		// configurando a posi��o do texto.
		lbAuxiliar.setHorizontalTextPosition(SwingConstants.CENTER);
		// configurando a posi��o e tamanho.
		lbAuxiliar.setBounds(50, 20, 230, 20);

		/*
		 * configura��es dos Radio Button.
		 */
		rbSolteiro = new JRadioButton();
		rbCasado = new JRadioButton();
		rbViuvo = new JRadioButton();
		rbDivorciado = new JRadioButton();
		// configurando o texto do componente.
		rbSolteiro.setText("Solteiro");
		rbCasado.setText("Casado");
		rbViuvo.setText("Viuvo");
		rbDivorciado.setText("Divorciado");
		// configurando a posi��o e tamanho.
		rbSolteiro.setBounds(80, 50, 100, 25);
		rbCasado.setBounds(80, 75, 100, 25);
		rbViuvo.setBounds(80, 100, 100, 25);
		rbDivorciado.setBounds(80, 125, 100, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpRadio = new ButtonGroup();
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		/*
		 * Configruando bot�o VERIFICAR.
		 */
		btVerificar = new JButton();
		// Configurando o texto do bot�o.
		btVerificar.setText("Verificar");
		// Configurando a posi��o e tamanho
		btVerificar.setBounds(126, 176, 84, 28);
		// Verificando a a��o do bot�o
		btVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				verificaRadioButton();
			
			}
		});
		
		
		/*
		 * configura��es do Painel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurando o layout inicial
		painel.setLayout(null);
		//adicionando os componentes no painel.
		painel.add(lbAuxiliar);
		painel.add(rbSolteiro);
		painel.add(rbCasado);
		painel.add(rbViuvo);
		painel.add(rbDivorciado);
		painel.add(btVerificar);
		
		// configurando a exibi��o da tela.
		janela.setVisible(true);
	
	}//fim do metodo
	
	/*
	 * Metodo auxiliar para verificar escolha do usuario no radioButton.
	 */
	private void verificaRadioButton() { // iniciodo metodo
		
		String auxiliar = "";
		// verificando se a op��o Solteiro esta selecionada.
		if(rbSolteiro.isSelected()) {
			auxiliar =" Selecione o estado civil:"+ " " + rbSolteiro.getText();
		}
		// verificando se a op��o Casado esta selecionada.
		if(rbCasado.isSelected()) {
			auxiliar =	" Selecione o estado civil:"+ " " + rbCasado.getText();
		}
		// verificando se a op��o Viuvo esta selecionada.
		if(rbViuvo.isSelected()) {
			auxiliar =" Selecione o estado civil:"+ " " + rbViuvo.getText();
		}
		// verificando se a op��o Divorciado esta selecionada.
		if(rbDivorciado.isSelected()) {
			auxiliar =" Selecione o estado civil:"+ " " + rbDivorciado.getText();
		}
		
		//Atribuindo a sele��o do usuario na Lavel Auxiliar.
		if (!auxiliar.equals("")) {
			
			lbAuxiliar.setText(auxiliar);
		}
	
		
		
		
	}//fim do metodo
	
	
	/*
	 * M�to principal para executar a clace
	 */
	
	public static void main(String[] args) {
		new Exemplo04().iniciaGui();
	}

}//fim da classe.
