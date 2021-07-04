package visao;


import javax.swing.*;
import java.awt.*;

public class GUICheckin extends JFrame{
	
	private JPanel painelMain;
	private JRadioButton botaoNao1, botaoSim1, botaoNao2, botaoSim2;
	private JButton botaoConfirmar, botaoOK, botaoVoltar;
	private JLabel label2, label3, label4, label5, label6, label7, label8, label9, label10, 
	               label11, label12, label13, label14, label15, label16, label17, label18, label19;
	private JSpinner contadorCamas;
	JTextField textoDiaa;
	private JPasswordField senha;
	private JTextField textoDiasReserv, textoDia, textoMes, textoAno, textoHora, textoMin, textoPagar;
	

		public GUICheckin() {
			
			super("CHECKIN");
			
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setBounds(500, 80, 450, 600);
			
			painelMain = new JPanel();
			painelMain.setBackground(new Color(139, 0, 0));
			painelMain.setLayout(null);
			setContentPane(painelMain);
			
			JLabel labelCima = new JLabel("CHECK-IN");
			labelCima.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
			labelCima.setForeground(Color.YELLOW);
			labelCima.setBounds(125, 11, 228, 53);
			painelMain.add(labelCima);
			
			
			label2 = new JLabel("Reserva para quantos dias? ");
			label2.setForeground(Color.YELLOW);
			label2.setBounds(87, 118, 174, 14);
			
			label3 = new JLabel("Data de registro: ");
			label3.setForeground(Color.YELLOW);
			label3.setBounds(87, 160, 101, 14);
			
			label4 = new JLabel("Servi�o de quarto? ");
			label4.setForeground(Color.YELLOW);
			label4.setBounds(87, 286, 116, 14);
			
			label5 = new JLabel("Acesso � piscina e sala de jogos?");
			label5.setForeground(Color.YELLOW);
			label5.setBounds(87, 322, 190, 14);
			
			label6 = new JLabel("N�mero de camas: ");
			label6.setForeground(Color.YELLOW);
			label6.setBounds(87, 244, 116, 14);
			
			label7 = new JLabel("(x50 + 100 cr�ditos)");
			label7.setForeground(Color.YELLOW);
			label7.setBounds(237, 244, 116, 14);
			
			label8 = new JLabel("Hor�rio de registro: ");
			label8.setForeground(Color.YELLOW);
			label8.setBounds(87, 201, 140, 14);
			
			label9 = new JLabel("h");
			label9.setForeground(Color.YELLOW);
			label9.setBounds(240, 198, 13, 14);
			
			label10 = new JLabel("min");
			label10.setForeground(Color.YELLOW);
			label10.setBounds(284, 198, 36, 14);
			
			label11 = new JLabel("/");
			label11.setForeground(Color.YELLOW);
			label11.setBounds(237, 159, 13, 14);
			
			label12 = new JLabel("/");
			label12.setForeground(Color.YELLOW);
			label12.setBounds(287, 159, 13, 14);
			
			label13 = new JLabel("senha:");
			label13.setForeground(Color.YELLOW);
			label13.setBounds(87, 446, 55, 14);
			
			label14 = new JLabel("Total � pagar:");
			label14.setForeground(Color.YELLOW);
			label14.setBounds(87, 362, 86, 14);
			
			label15 = new JLabel("cr�ditos");
			label15.setForeground(Color.YELLOW);
			label15.setBounds(253, 362, 55, 14);
			
			label16 = new JLabel("(50 cr�ditos por dia)");
			label16.setFont(new Font("Tahoma", Font.PLAIN, 9));
			label16.setForeground(Color.YELLOW);
			label16.setBounds(87, 132, 101, 14);
			
			label17 = new JLabel("(10 cr�ditos)");
			label17.setForeground(Color.YELLOW);
			label17.setFont(new Font("Tahoma", Font.PLAIN, 9));
			label17.setBounds(87, 333, 101, 14);
			
			label18 = new JLabel("(50 cr�ditos)");
			label18.setForeground(Color.YELLOW);
			label18.setFont(new Font("Tahoma", Font.PLAIN, 9));
			label18.setBounds(87, 297, 101, 14);
			
			label19 = new JLabel("");
			label19.setIcon(new ImageIcon(getClass().getResource("/img/cama.png")));
			label19.setBounds(60, 11, 55, 43);
			
			
			
			
			botaoOK = new JButton("OK");
			getBotaoOK().setBounds(237, 442, 55, 23);
			
			botaoConfirmar = new JButton("Confirmar");
			getBotaoConfirmar().setBounds(335, 527, 89, 23);
			
			botaoVoltar = new JButton("Voltar");
			getBotaoVoltar().setBounds(10, 527, 89, 23);
			
			painelMain.add(getBotaoConfirmar());
			painelMain.add(getBotaoOK());
			painelMain.add(getBotaoVoltar());
			
			contadorCamas = new JSpinner();
			getContadorCamas().setBounds(197, 241, 30, 20);
			painelMain.add(getContadorCamas());
			
			
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
			
			
			textoDiasReserv = new JTextField();
			getTextoDiasReserv().setBounds(258, 115, 62, 20);
			getTextoDiasReserv().setColumns(10);
			
			textoDia = new JTextField();       ///IGNORAR ESSE
			getTextoDia().setBounds(197, 156, 30, 20);///IGNORAR ESSE
			getTextoDia().setColumns(10);  ///IGNORAR ESSE
			
			textoDiaa = new JTextField();
			textoDiaa.setColumns(10);
			textoDiaa.setBounds(197, 156, 30, 20);
			
			textoMes = new JTextField();
			getTextoDia().setColumns(10);
			getTextoDia().setBounds(247, 156, 30, 20);
			
			textoAno = new JTextField();
			getTextoAno().setColumns(10);
			getTextoAno().setBounds(297, 156, 30, 20);
			
			textoHora = new JTextField();
			getTextoHora().setColumns(10);
			getTextoHora().setBounds(206, 195, 30, 20);
			
			textoMin = new JTextField();
			getTextoMin().setColumns(10);
			getTextoMin().setBounds(249, 195, 30, 20);
			
			textoPagar = new JTextField();
			getTextoPagar().setEditable(false);
			getTextoPagar().setBounds(175, 359, 62, 20);
			painelMain.add(getTextoPagar());
			
			painelMain.add(getTextoDiasReserv());
			painelMain.add(getTextoDia());///IGNORAR ESSE
			painelMain.add(getTextoDiaa());
			painelMain.add(getTextoMes());
			painelMain.add(getTextoAno());
			//painelMain.add(getTextoAno());
			painelMain.add(getTextoHora());
			painelMain.add(getTextoMin());
			
			senha = new JPasswordField("");
			getSenha().setBounds(141, 443, 86, 20);
			getSenha().setColumns(10);
			getContentPane().add(getSenha());
			
			
			
			botaoNao1 = new JRadioButton("N�o");
			getBotaoNao1().setForeground(new Color(255, 255, 0));
			getBotaoNao1().setBackground(new Color(139, 0, 0));
			getBotaoNao1().setBounds(197, 282, 64, 23);
			
			botaoSim1 = new JRadioButton("Sim");
			getBotaoSim1().setBackground(new Color(139, 0, 0));
			getBotaoSim1().setForeground(new Color(255, 255, 0));
			getBotaoSim1().setBounds(258, 282, 55, 23);
			
			painelMain.add(getBotaoNao1());
			painelMain.add(getBotaoSim1());
			
			ButtonGroup grupo1 = new ButtonGroup();
			grupo1.add(getBotaoNao1());
			grupo1.add(getBotaoSim1());
			
			
			
			botaoNao2 = new JRadioButton("N�o");
			getBotaoNao2().setForeground(Color.YELLOW);
			getBotaoNao2().setBackground(new Color(139, 0, 0));
			getBotaoNao2().setBounds(283, 318, 58, 23);
			
			botaoSim2 = new JRadioButton("Sim");
			getBotaoSim2().setForeground(Color.YELLOW);
			getBotaoSim2().setBackground(new Color(139, 0, 0));
			getBotaoSim2().setBounds(343, 318, 62, 23);
			
			painelMain.add(getBotaoNao2());
			painelMain.add(getBotaoSim2());
			
			ButtonGroup grupo2 = new ButtonGroup();
			grupo2.add(getBotaoNao2());
			grupo2.add(getBotaoSim2());
			
			
			setResizable(false);
		}




		public JTextField getTextoDiasReserv() {
			return textoDiasReserv;
		}

		public JTextField getTextoDia() {
			return textoDia;
		}
		public JTextField getTextoDiaa() {
			return textoDiaa;
		}

		public JTextField getTextoMes() { //aqui � o mes essa porra ta bugada
			return textoDia;
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
		public JTextField getTextoPagar() {
			return textoPagar;
		}

		public JPasswordField getSenha() {
			return senha;
		}




		public JButton getBotaoOK() {
			return botaoOK;
		}




		public JButton getBotaoConfirmar() {
			return botaoConfirmar;
		}




		public JButton getBotaoVoltar() {
			return botaoVoltar;
		}




		public JRadioButton getBotaoNao1() {
			return botaoNao1;
		}




		public JRadioButton getBotaoSim1() {
			return botaoSim1;
		}




		public JRadioButton getBotaoNao2() {
			return botaoNao2;
		}




		public JRadioButton getBotaoSim2() {
			return botaoSim2;
		}




		public JSpinner getContadorCamas() {
			return contadorCamas;
		}
		
		public void setBotaoSim1(boolean b) {
			botaoSim1.setSelected(b);
		}
		
		public void setBotaoNao1(boolean b) {
			botaoNao1.setSelected(b);
		}
		
		public void setBotaoSim2(boolean b) {
			botaoSim2.setSelected(b);
		}
		
		public void setBotaoNao2(boolean b) {
			botaoNao2.setSelected(b);
		}
}
