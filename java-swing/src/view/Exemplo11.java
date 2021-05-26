package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import util.Valida;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente de tabela -
 * JTable
 * 
 * @author Mayke Paiva
 * @since 03/03/2021
 * @version 1.0
 */
public class Exemplo11 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando as labels para exibir os r�tulos na tela
	private JLabel lbIncluirUF;
	private JLabel lbIncluirNome;
	// declarando os campos de textos para o usuario digitar as informa�oes
	private JTextField tfIncluirUF;
	private JTextField tfIncluirNome;
	// declarando a tabela para armazenar os dados inputados pelo usuario
	private JTable tabela;
	// declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;
	// declarando dois bot�es para incluir e excluir registro na tabela
	private JButton btIncluir;
	private JButton btExcluir;
	// declarando o painel para organizar os componentes da tela
	private JPanel painel;
	// vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "UF", "Estado" };
	// matriz auxiliar para armazenar os dados exibidos na tabela
	private String linhas[][] = { { "SP", "S�o Paulo" }, { "PR", "Paran�" }, { "SC", "Santa Catarina" },
			{ "RS", "Rio Grande do Sul" } };

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de JPanel");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do componene JLabel UF
		 */
		lbIncluirUF = new JLabel();
		// configurar o texto inicial
		lbIncluirUF.setText("Informe UF:");
		// configurar a posi��o e o tamanho
		lbIncluirUF.setBounds(15, 20, 70, 25);

		/*
		 * configura��es do componene JLabel Nome
		 */
		lbIncluirNome = new JLabel();
		// configurar o texto inicial
		lbIncluirNome.setText("Informe Estado");
		// configurar a posi��o e o tamanho
		lbIncluirNome.setBounds(15, 55, 90, 25);

		/*
		 * configura��es do componentwe JTextField UF
		 */
		tfIncluirUF = new JTextField();
		// configurar a posi��o e o tamanho
		tfIncluirUF.setBounds(110, 20, 50, 25);

		/*
		 * configura��es do componentwe JTextField Nome
		 */
		tfIncluirNome = new JTextField();
		// configurar a posi��o e o tamanho
		tfIncluirNome.setBounds(110, 55, 260, 25);

		/*
		 * configura��es do componente JTabble - tabela de dados
		 */
		// definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modeloTabela = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modeloTabela);
		// configurar posi��o e tamanho
		tabela.setBounds(10, 30, 300, 95);
		// configurar a a��o do usuario quando clina no registro armazenado
		tabela.setEnabled(true);

		/*
		 * configura��es do componente JScrollPane
		 */
		scroll = new JScrollPane(tabela);
		// configurar local de exibi��o do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// configurar a posi��o e o tamanho
		scroll.setBounds(10, 100, 360, 95);

		/*
		 * configurando JButton incluir.
		 */
		btIncluir = new JButton();
		// configurar o text inicial.
		btIncluir.setText("Incluir");
		// tamanho e posi��o
		btIncluir.setBounds(75, 200, 100, 50);
		// a��o do bot�o
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				incluirLinha();

			}
		});

		/*
		 * configurando JButton excluir.
		 */
		btExcluir = new JButton();
		// configurar o text inicial.
		btExcluir.setText("Excluir");
		// tamanho e posi��o
		btExcluir.setBounds(195, 200, 100, 50);
		// a��o do bot�o
		btExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				excluirLinha();

			}
		});

		/*
		 * configura��o do painel principal da tela.
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbIncluirUF);
		painel.add(lbIncluirNome);
		painel.add(tfIncluirUF);
		painel.add(tfIncluirNome);
		painel.add(scroll);
		painel.add(btIncluir);
		painel.add(btExcluir);

		
		janela.setVisible(true);
		
		
	}// fim do m�todo
	
	
	/*
	 * incluir registro na tabela ( BT INCLUIR)
	 */
	private void incluirLinha() {
		if ( validarDados()) {
			DefaultTableModel modelo =(DefaultTableModel) tabela.getModel();
			//adicionando a linha na tabela
			modelo.addRow(new String[] {tfIncluirUF.getText(),tfIncluirNome.getText()});
			
			//limpando dados digitados
			tfIncluirNome.setText(" ");
			tfIncluirUF.setText("");
			
			JOptionPane.showMessageDialog(null, "Registro incluindo com Sucesso", "Cadastro de Estado", 1);
		}
		
	}
	/*
	 * metodo auxiliar para validar dados 
	 */
	private boolean validarDados() {
		if (Valida.isEmptyOrNull(tfIncluirUF.getText())) {
			JOptionPane.showMessageDialog(null, "Informe UF"," Campo Obrigat�rio", 0);
			return false;
		}
		if (Valida.isEmptyOrNull(tfIncluirNome.getText())) {
			JOptionPane.showMessageDialog(null, "Informe o Estado"," Campo Obrigat�rio", 0);
			return false;
		}
		
		return true;
	}
	
	
	/*
	 * excluir registro na tabela ( BT INCLUIR)
	 */
	private void excluirLinha() {
		
		// verificando se usuario selecionou o registro.
		if (tabela.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null, "Selecione um registro", "Excluir Registro", 0);
			
		} else if (tabela.getSelectedRowCount()>1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas um registro", "Excluir Registro", 0);
		
		} else {
			//obter o modelo da tabela atual.
			DefaultTableModel modelo = ( DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Registro excluindo com Sucesso", "Exclus�o de Estado", 1);
		}
	}
	
	
	
	/*
	 * m�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		new Exemplo11().iniciaGui();
	}
}// fim da classe
