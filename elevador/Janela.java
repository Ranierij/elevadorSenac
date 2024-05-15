package elevador;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

public class Janela extends JFrame{
	
	private JButton btnAbrir, btnFechar;
	private JButton [] btnAndar;
	private JLabel lblInicio;
	
	public Janela() {
		inicio();
	}

	private void inicio() {
		setTitle("Welcome to elevator KXPO!");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		criarPainel();
		setVisible(true);
		
	}

	private void criarPainel() {
		add(criarLabel());
		criarBtnAbrirFechar();
		criarBtnAndares();
	}

	private void criarBtnAndares() {
		btnAndar = new JButton [5];
		for(int i=1; i<btnAndar.length; i++) 
			btnAndar[i] = new JButton(""+i);
		
	}

	private void criarBtnAbrirFechar() {
	btnAbrir = new JButton("Abrir");
	btnFechar = new JButton("Fechar");
	btnAbrir.setBounds(160, 285, 220, 60);
	btnFechar.setBounds(400, 285, 220, 60);
	add(btnAbrir);
	add(btnFechar);
		
	}

	private Component criarLabel() {
		//lblInicio = new JLabel (new Font ("Arial", Font.PLAIN. 18));
		lblInicio = new JLabel("Elevador KXPO: escolha um andar.");
		lblInicio.setFont(new Font ("Arial", Font.PLAIN, 18));
		lblInicio.setVerticalAlignment(JLabel.TOP);
		lblInicio.setHorizontalAlignment(JLabel.CENTER);
		lblInicio.setBounds(0, 60, 800, 30);
		return lblInicio;
	}
}
