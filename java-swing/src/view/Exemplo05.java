package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe para demonstrar a utilização do componente JcheckBox.
 * @author Renato Duarte Sampaio
 * @since 2 de mar. de 2021
 */
public class Exemplo05 {

	// declando os componentes da tela.
	private JFrame janela;
	//label auxiliar para exibir na tela.
	private JLabel lbAuxiliar;
	// componente check box que permite a seleção de mais uma opção
	private JCheckBox cbBoleto;
	private JCheckBox cbCartao;
	private JCheckBox cbCobranca;
	// botão auxiliar para retornar a escolha do usuario.
	private JButton btVerificar;
	// painel para organizar os componentes.
	private JPanel painel;
	
	/*
	 * configurando a tela
	 */
public void iniciaGui() {
	
	janela = new JFrame();
	janela.setTitle("Exemplo de Check BOX");
	janela.setSize(390, 300);
	janela.setLocationRelativeTo(null);
	
	
	/*
	 * configurando a JLabel
	 */
	
	lbAuxiliar = new JLabel();
	lbAuxiliar.setText("Selecione a forma de pagamento:");
	lbAuxiliar.setBounds(40,15, 210, 20);
	
	
	
	/*
	 * configurando o check box.
	 */
	
	cbBoleto = new JCheckBox();
	cbBoleto.setText("Boleto");
	cbBoleto.setBounds(45, 60, 145, 20);
	
	cbCartao = new JCheckBox();
	cbCartao.setText("Cartão de Credito");
	cbCartao.setBounds(45, 80, 145, 20);
	
	cbCobranca = new JCheckBox();
	cbCobranca.setText("Cobrança Bancária");
	cbCobranca.setBounds(45,100, 145, 20);
	
	
	
	/*
	 *  Configurando o JButton
	 */
	btVerificar = new JButton();
	btVerificar.setText("Verificar");
	btVerificar.setBounds(145,196,120,28);
	btVerificar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			verificaCheckBox();
			
		}
	});
	
	/*
	 * Configurando o painel.
	 */
	
	painel =(JPanel) janela.getContentPane();
	painel.setLayout(null);
	painel.add(lbAuxiliar);
	painel.add(cbBoleto);
	painel.add(cbCartao);
	painel.add(cbCobranca);
	painel.add(btVerificar);
	
	// visibilidade da tela
	janela.setVisible(true);
	
	
	
}

/*
 *  metodo auxiliar para verificar a seleção do componente JCheckBox
 */
private void verificaCheckBox() {
	//varialvel auxiliar
	String auxiliar= "";
	
	//verificando boleto Selecionado.
	if (cbBoleto.isSelected()) {
		auxiliar += cbBoleto.getText() + "\n";
	}
	if (cbCartao.isSelected()) {
		auxiliar += cbCartao.getText() + "\n";
	}
	if (cbCobranca.isSelected()) {
		auxiliar += cbCobranca.getText() + "\n";
	}
	
	//exibindo o resultado para o usuario.
	if (!auxiliar.equals("")) {
		JOptionPane.showMessageDialog(null, auxiliar,"Formas de Pagamento",1);
	}
	
}
	
	public static void main(String[] args) {
		
		new Exemplo05().iniciaGui();
	}
	
}
