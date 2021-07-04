package visao;
import javax.swing.*;
import java.awt.*;

public class GUIBrinquedos extends JFrame {

	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12,
			       label13, label14, label15, label16, label17, label18, label19, label20, label21;
	private JPanel painelMain, painelCima;
	private JButton botaoOK, botaoReset, botaoConfirmar, botaoVoltar;
	private JRadioButton botaozinho1, botaozinho2, botaozinho3, botaozinho4, botaozinho5;
	private JLabel labelCima, labelBaixo1, labelBaixo2;
	private JPasswordField senha;
	

	public GUIBrinquedos() {
		
		super("BRINQUEDOS");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(40, 50, 1300, 620);
		
		painelMain = new JPanel();
		painelCima = new JPanel();
		
		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		painelCima.setBackground(new Color(139, 0, 0));
		painelCima.setBounds(0, 0, 1274, 48);
		painelMain.add(painelCima);

		labelCima = new JLabel("Brinquedos");
		labelCima.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelCima.setForeground(new Color(255, 255, 0));
		painelCima.add(labelCima);

		
		
		label1 = new JLabel("");
		label1.setIcon(new ImageIcon(getClass().getResource("/img/mot.png")));
		label1.setBounds(297, 74, 306, 256);

		label2 = new JLabel("");
		label2.setIcon(new ImageIcon(getClass().getResource("/img/carrossel.png")));
		label2.setBounds(23, 109, 246, 221);

		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(getClass().getResource("/img/rodagig.png")));
		label3.setBounds(582, 76, 246, 243);

		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(getClass().getResource("/img/casamal.png")));
		label4.setBounds(813, 87, 233, 243);

		label5 = new JLabel("");
		label5.setIcon(new ImageIcon(getClass().getResource("/img/batebate.png")));
		label5.setBounds(1036, 74, 276, 243);

		label6 = new JLabel("CARROSSEL");
		label6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label6.setForeground(new Color(255, 255, 0));
		label6.setBounds(64, 341, 112, 23);

		label7 = new JLabel("Creditos: 20");
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label7.setBounds(64, 375, 112, 23);

		label8 = new JLabel("Pontos: 60");
		label8.setForeground(Color.YELLOW);
		label8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label8.setBounds(64, 409, 112, 25);

		label9 = new JLabel("MONTANHA RUSSA");
		label9.setForeground(Color.YELLOW);
		label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label9.setBounds(307, 341, 188, 23);

		label10 = new JLabel("Creditos: 100");
		label10.setForeground(Color.YELLOW);
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label10.setBounds(307, 375, 137, 23);

		label11 = new JLabel("Pontos: 300");
		label11.setForeground(Color.YELLOW);
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label11.setBounds(307, 409, 112, 25);

		label12 = new JLabel("RODA GIGANTE");
		label12.setForeground(Color.YELLOW);
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label12.setBounds(618, 341, 158, 23);

		label13 = new JLabel("Creditos: 60");
		label13.setForeground(Color.YELLOW);
		label13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label13.setBounds(618, 375, 123, 23);

		label14 = new JLabel("Pontos: 180");
		label14.setForeground(Color.YELLOW);
		label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label14.setBounds(618, 409, 112, 25);

		label15 = new JLabel("CASA ASSOMBRADA");
		label15.setForeground(Color.YELLOW);
		label15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label15.setBounds(846, 341, 190, 23);

		label16 = new JLabel("Creditos: 70");
		label16.setForeground(Color.YELLOW);
		label16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label16.setBounds(846, 375, 190, 23);

		label17 = new JLabel("Pontos: 210");
		label17.setForeground(Color.YELLOW);
		label17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label17.setBounds(846, 409, 190, 25);

		label18 = new JLabel("CARRO CHOQUE");
		label18.setForeground(Color.YELLOW);
		label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label18.setBounds(1075, 341, 158, 23);

		label19 = new JLabel("Creditos: 80");
		label19.setForeground(Color.YELLOW);
		label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label19.setBounds(1075, 375, 112, 23);

		label20 = new JLabel("Pontos: 240");
		label20.setForeground(Color.YELLOW);
		label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label20.setBounds(1075, 409, 112, 25);

		label21 = new JLabel("senha:");
		label21.setForeground(new Color(255, 255, 0));
		label21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label21.setBounds(23, 467, 86, 14);

		painelMain.add(label1);
		painelMain.add(label2);
		painelMain.add(label3);
		painelMain.add(label4);
		painelMain.add(label5);
		painelMain.add(label6);
		painelMain.add(label7);
		painelMain.add(label8);
		painelMain.add(label9);
		painelMain.add(label10);
		painelMain.add(label11);
		painelMain.add(label12);
		painelMain.add(label13);
		painelMain.add(label14);
		painelMain.add(label15);
		painelMain.add(label16);
		painelMain.add(label17);
		painelMain.add(label18);
		painelMain.add(label19);
		painelMain.add(label20);
		painelMain.add(label21);

		
		
		botaoOK = new JButton("OK");
		botaoOK.setBounds(136, 491, 61, 23);

		botaoReset = new JButton("Reset");
		botaoReset.setBounds(207, 491, 86, 23);

		botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.setBounds(373, 509, 188, 42);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(594, 509, 188, 42);

		painelMain.add(botaoOK);
		painelMain.add(botaoReset);
		painelMain.add(botaoConfirmar);
		painelMain.add(botaoVoltar);

		
		
		botaozinho1 = new JRadioButton("");
		botaozinho1.setBackground(new Color(139, 0, 0));
		botaozinho1.setBounds(182, 341, 29, 23);

		botaozinho2 = new JRadioButton("");
		botaozinho2.setBackground(new Color(139, 0, 0));
		botaozinho2.setBounds(489, 341, 29, 23);

		botaozinho3 = new JRadioButton("");
		botaozinho3.setBackground(new Color(139, 0, 0));
		botaozinho3.setBounds(769, 341, 29, 23);

		botaozinho4 = new JRadioButton("");
		botaozinho4.setBackground(new Color(139, 0, 0));
		botaozinho4.setBounds(1036, 341, 29, 23);

		botaozinho5 = new JRadioButton("");
		botaozinho5.setBackground(new Color(139, 0, 0));
		botaozinho5.setBounds(1232, 341, 29, 23);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(botaozinho1);
		grupo.add(botaozinho2);
		grupo.add(botaozinho3);
		grupo.add(botaozinho4);
		grupo.add(botaozinho5);
		

		painelMain.add(botaozinho1);
		painelMain.add(botaozinho2);
		painelMain.add(botaozinho3);
		painelMain.add(botaozinho4);
		painelMain.add(botaozinho5);

		
		
		labelBaixo1 = new JLabel("Creditos restantes: ");
		labelBaixo1.setForeground(Color.YELLOW);
		labelBaixo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelBaixo1.setBounds(23, 537, 137, 23);

		labelBaixo2 = new JLabel("");
		labelBaixo2.setForeground(Color.YELLOW);
		labelBaixo2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelBaixo2.setBounds(158, 537, 135, 23);

		painelMain.add(labelBaixo1);
		painelMain.add(labelBaixo2);

		
		
		senha = new JPasswordField("");
		senha.setBounds(23, 492, 86, 20);
		getContentPane().add(senha);
		senha.setColumns(10);

		setResizable(false);
	}


	public JLabel getLabelBaixo2() {
		return labelBaixo2;
	}


	public JRadioButton getBotaozinho1() {
		return botaozinho1;
	}


	public JRadioButton getBotaozinho2() {
		return botaozinho2;
	}


	public JRadioButton getBotaozinho3() {
		return botaozinho3;
	}


	public JRadioButton getBotaozinho4() {
		return botaozinho4;
	}


	public JRadioButton getBotaozinho5() {
		return botaozinho5;
	}


	public JButton getBotaoOK() {
		return botaoOK;
	}


	public JButton getBotaoReset() {
		return botaoReset;
	}


	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}


	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}


	public JPasswordField getSenha() {
		return senha;
	}
}
