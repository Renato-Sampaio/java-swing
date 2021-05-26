package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Classe responsavel por demonstrar a utilização do componente JLIST e o SCrollPane.
 * @author Renato Duarte Sampaio
 *
 * @since 3 de mar. de 2021
 */
public class Exemplo08 {
	
	//declarando os atributos da tela
	private JFrame janela;
	// label auxiliar para exibir a seleção do usuario.
	private JLabel lbAuxiliar;
	//atribuindo JList para armazenar uma lista de opções.
	private JList ltDiaSemana;
	// atribuindo auxiliar ScrollPane.
	private JScrollPane scroll;

	// painel para organizar os componentes.
	private JPanel painel;
	
	//vetor auxiliar par armazenar os dias da semana.
	private String diasSemana[] = {"Domengo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sabado" };
	
	
	/*
	 * Método para criar a tela.
	 */
	public void iniciaGui() {
		/*
		 *  Configuração do JFrame.
		 */
		
		janela = new JFrame();
		// Configurações do titulo da tela
		janela.setTitle("Exemplo de JLIST e ScrollPane");
		// Configurando o tamanho da tela / largura/altura
		janela.setSize(330, 330);
		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurações do JLabel.
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto inicial.
		lbAuxiliar.setText("CRTL para Multi-Seleções");
		//configurações de estilos.
		lbAuxiliar.setOpaque(true);
		lbAuxiliar.setBackground(Color.LIGHT_GRAY);
		lbAuxiliar.setForeground(Color.BLACK);
		lbAuxiliar.setBounds(10, 10, 300, 30);
		
	
		/*
		 *  configuraçãoes do Jlist.
		 */
		ltDiaSemana= new JList(diasSemana);
		//configurando como o componente permitira a seleção dos dados ( 1 ou + )
		ltDiaSemana.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// atribuindo o texto selecionado na Label auxiliar.
				lbAuxiliar.setText((String) ltDiaSemana.getSelectedValue());
			}
		});
		
		
		/*
		 * Configurações do ScrollPane.
		 */
		
		scroll = new JScrollPane(ltDiaSemana);
		//configurando posição e tamanho.
		scroll.setBounds(10, 60, 300, 90);
		
		
		/*
		 * configurações do painel da janela.
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(scroll);
		
		// configurando a visibilidade da tela.
		janela.setVisible(true);
		
	}//fim do metodo
	
	public static void main(String[] args) {
		new Exemplo08().iniciaGui();
	}
	
	
}//fim da classe
