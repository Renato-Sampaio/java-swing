/**
 * 
 */
package view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/**
 * Classe responsavel por demonstrar a utilização do componente JFormattedTextFilde
 * @author Renato Duarte Sampaio
 *@version 1.0
 * 4 de mar. de 2021
 */
public class Exemplo12 {
	// declarando os atributos da tela.
	private JFrame janela;
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbTelefone;
// declarando os campos formatados.
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfDataNascimento;
	private JFormattedTextField tfTelefone;
	// declarando os atributos de formatação.
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;
	
	private JPanel painel;
	
	/*
	 *  Metodo para criar a tela
	 */
	public void iniciaGui() throws ParseException {
		
		
		/*
		 *  configurações dos campos de formatação
		 */
		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ####-####");
		
		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de Campos Formatados");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(400, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		
		/*
		 * Configuração da Jlabel CPF
		 */
		lbCpf = new JLabel();
		lbCpf.setText("CPF: ");
		lbCpf.setBounds(10, 10, 50, 20);
		
		/*
		 * Configuração da Jlabel CPF
		 */
		lbRg = new JLabel();
		lbRg.setText("RG: ");
		lbRg.setBounds(10, 40, 50, 20);
		
		/*
		 * Configuração da Jlabel CPF
		 */
		lbDataNascimento = new JLabel();
		lbDataNascimento.setText("Data de Nascimento: ");
		lbDataNascimento.setBounds(10, 70, 120, 20);
		
		/*
		 * Configuração da Jlabel CPF
		 */
		lbTelefone = new JLabel();
		lbTelefone.setText("Telefone: ");
		lbTelefone.setBounds(10, 100, 110, 20);
		
		/*
		 * configurando o formato do cpf
		 */
		
		tfCpf = new JFormattedTextField(fmtCpf);
		// posição e tamanho.
		tfCpf.setBounds(130, 10, 100, 20);
		
		/*
		 * configurando o formato do rg
		 */
		
		tfRg = new JFormattedTextField(fmtRg);
		// posição e tamanho.
		tfRg.setBounds(130, 40, 100, 20);
		
		/*
		 * configurando o formato do Data de Nascimento
		 */
		
		tfDataNascimento = new JFormattedTextField(fmtDataNascimento);
		// posição e tamanho.
		tfDataNascimento.setBounds(130, 70, 100, 20);
		
		/*
		 * configurando o formato do Telefone
		 */
		
		tfTelefone = new JFormattedTextField(fmtTelefone);
		// posição e tamanho.
		tfTelefone.setBounds(130, 100, 100, 20);
		
		/*
		 * configurando painel janela
		 */
		
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbCpf);
		painel.add(lbDataNascimento);
		painel.add(lbTelefone);
		painel.add(lbRg);
		painel.add(tfCpf);
		painel.add(tfRg);
		painel.add(tfTelefone);
		painel.add(tfDataNascimento);
		
		janela.setVisible(true);
		
	}// fim do metodo
	
	public static void main(String[] args) {
		
		try {
			new Exemplo12().iniciaGui();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}//fim da classe
