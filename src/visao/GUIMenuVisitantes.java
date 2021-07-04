package visao;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;

public class GUIMenuVisitantes extends JFrame{
	
	private JPanel painelCima, painelMain;
	private JButton botao1, botao2, botao3;
	private JLabel label;
	
	public GUIMenuVisitantes(){
		super("MENU DO VISITANTE");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		painelMain = new JPanel();
		painelCima = new JPanel();
		
		painelMain.setBackground(new Color(140, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		painelCima.setBackground(new Color(140, 0, 0));
		painelCima.setBounds(0, 0, 434, 37);
		painelMain.add(painelCima);

		label = new JLabel("Menu do Visitante");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setForeground(new Color(255, 255, 0));
		painelCima.add(label);

		botao1 = new JButton("Carteira de Creditos/Saldos");
		getBotao1().setBounds(110, 80, 200, 25);
		
		botao2 = new JButton("Historico de Compras");
		getBotao2().setBounds(110, 140, 200, 25);
		
		botao3 = new JButton("Voltar");
		getBotao3().setBounds(160, 200, 100, 23);
		
		painelMain.add(getBotao1());
		painelMain.add(getBotao2());
		painelMain.add(getBotao3());

		setResizable(false);
	}

	public JButton getBotao1() {
		return botao1;
	}

	public JButton getBotao2() {
		return botao2;
	}

	public JButton getBotao3() {
		return botao3;
	}
	}


