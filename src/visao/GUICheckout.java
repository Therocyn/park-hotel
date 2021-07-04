package visao;


import javax.swing.*;
import java.awt.*;

public class GUICheckout extends JFrame {

	private JPanel painelMain;
	private JPasswordField senha;
	private JLabel labelCima, labelSenha, labelPagamento, labelCreditos;
	private JButton botaoOK, botaoVoltar, botaoConfirmar;
	private JLabel label1, label2, label3, label4, label5, label6;;
	private JTextField textoPagamento, textoDia, textoMes, textoAno, textoHora, textoMin;
	
	

	public GUICheckout() {
		
		super("CHECK-OUT");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(500, 200, 450, 400);
		
		painelMain = new JPanel();
		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);
		
		labelCima = new JLabel("CHECK-OUT");
		labelCima.setForeground(Color.YELLOW);
		labelCima.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
		labelCima.setBounds(97, 11, 228, 53);
		painelMain.add(labelCima);
			
		label1 = new JLabel("Data de registro: ");
		label1.setForeground(Color.YELLOW);
		label1.setBounds(97, 180, 101, 14);
		painelMain.add(label1);
		
		label2 = new JLabel("/");
		label2.setForeground(Color.YELLOW);
		label2.setBounds(247, 180, 13, 14);
		painelMain.add(label2);
		
		label3 = new JLabel("/");
		label3.setForeground(Color.YELLOW);
		label3.setBounds(297, 180, 13, 14);
		painelMain.add(label3);
		
		label4 = new JLabel("Hor�rio de registro: ");
		label4.setForeground(Color.YELLOW);
		label4.setBounds(97, 222, 140, 14);
		painelMain.add(label4);
		
		label5 = new JLabel("h");
		label5.setForeground(Color.YELLOW);
		label5.setBounds(250, 219, 13, 14);
		painelMain.add(label5);
		
		label6 = new JLabel("min");
		label6.setForeground(Color.YELLOW);
		label6.setBounds(294, 219, 36, 14);
		painelMain.add(label6);
		
		
		
		botaoOK = new JButton("OK");
		getBotaoOK().setBounds(258, 135, 55, 23);
		painelMain.add(getBotaoOK());
		
		botaoVoltar = new JButton("Voltar");
		getBotaoVoltar().setBounds(10, 315, 89, 23);
		painelMain.add(getBotaoVoltar());
		
		botaoConfirmar = new JButton("Confirmar");
		getBotaoConfirmar().setBounds(323, 315, 101, 23);
		painelMain.add(getBotaoConfirmar());
		
		
		senha = new JPasswordField("");
		getSenha().setBounds(162, 135, 86, 20);
		getSenha().setColumns(10);
		getContentPane().add(getSenha());
		
		labelSenha = new JLabel("senha:");
		labelSenha.setForeground(Color.YELLOW);
		labelSenha.setBounds(97, 138, 55, 14);
		painelMain.add(labelSenha);
		
		textoDia = new JTextField();
		getTextoDia().setColumns(10);
		getTextoDia().setBounds(207, 174, 30, 20);
		painelMain.add(getTextoDia());
		
		textoMes = new JTextField();
		getTextoMes().setColumns(10);
		getTextoMes().setBounds(257, 177, 30, 20);
		painelMain.add(getTextoMes());
		
		textoAno = new JTextField();
		getTextoAno().setColumns(10);
		getTextoAno().setBounds(307, 177, 30, 20);
		painelMain.add(getTextoAno());
		
		textoHora = new JTextField();
		getTextoHora().setColumns(10);
		getTextoHora().setBounds(216, 216, 30, 20);
		painelMain.add(getTextoHora());
		
		textoMin = new JTextField();
		getTextoMin().setColumns(10);
		getTextoMin().setBounds(259, 216, 30, 20);
		painelMain.add(getTextoMin());
		
		
		
		setResizable(false);

	}



	public JPasswordField getSenha() {
		return senha;
	}



	public JButton getBotaoOK() {
		return botaoOK;
	}



	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}



	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}



	public JTextField getTextoPagamento() {
		return textoPagamento;
	}



	public JTextField getTextoDia() {
		return textoDia;
	}



	public JTextField getTextoMes() {
		return textoMes;
	}



	public JTextField getTextoAno() {
		return textoAno;
	}



	public JTextField getTextoHora() {
		return textoHora;
	}



	public JTextField getTextoMin() {
		return textoMin;
	}

}
