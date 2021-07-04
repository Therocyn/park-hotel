package visao;

import javax.swing.*;
import java.awt.*;

public class GUILojinhaRecompensas extends JFrame{
	
	private JPanel painelCima, painelMain;
	private JPasswordField senha;
	private JLabel labelCima;
	private JButton botaoConfirmar, botaoVoltar, botaoOK, botaoReset;
	private JLabel labelSenha, labelPontos, labelPontosAtuais;
	private JLabel imgBola, imgViolao, imgCelular, imgFusca, imgPC, imgDVD;
	private JCheckBox caixinhaDVD, caixinhaBola, caixinhaFusca, caixinhaViolao, caixinhaComputador, caixinhaCelular;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
	
	
	public GUILojinhaRecompensas() {

		super("LOJA DE RECOMPENSAS");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(200, 100, 900, 600);
		
		
		painelMain = new JPanel();
		painelCima = new JPanel();
		
		painelMain.setBackground(new Color(140, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);
		
		painelCima.setBackground(new Color(140, 0, 0));
		painelCima.setBounds(0, 0, 784, 65);
		painelMain.add(painelCima);
		
		labelCima = new JLabel("RECOMPENSAS");
		labelCima.setForeground(new Color(255, 255, 0));
		labelCima.setFont(new Font("Tahoma", Font.BOLD, 40));
		painelCima.add(labelCima);
		
		/////////////
		
		imgBola = new JLabel("");
		imgBola.setIcon(new ImageIcon(getClass().getResource("/img/bola.png")));
		imgBola.setBounds(31, 74, 155, 169);
		
		imgViolao = new JLabel("");
		imgViolao.setIcon(new ImageIcon(getClass().getResource("/img/violao.png")));
		imgViolao.setBounds(656, 76, 128, 141);
		
		imgCelular = new JLabel("");
		imgCelular.setIcon(new ImageIcon(getClass().getResource("/img/celular.png")));
		imgCelular.setBounds(627, 253, 116, 164);
		
		imgFusca = new JLabel("");
		imgFusca.setIcon(new ImageIcon(getClass().getResource("/img/fusca.png")));
		imgFusca.setBounds(349, 76, 146, 153);
		
		imgPC = new JLabel("");
		imgPC.setIcon(new ImageIcon(getClass().getResource("/img/pc.png")));
		imgPC.setBounds(349, 262, 155, 141);
		
		imgDVD = new JLabel("");
		imgDVD.setIcon(new ImageIcon(getClass().getResource("/img/leao.png")));
		imgDVD.setBounds(31, 274, 134, 113);
		
		painelMain.add(imgBola);
		painelMain.add(imgViolao);
		painelMain.add(imgCelular);
		painelMain.add(imgFusca);
		painelMain.add(imgPC);
		painelMain.add(imgDVD);
		
		///////////////
		
		label1 = new JLabel("Bola de futebol");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label1.setForeground(new Color(255, 255, 0));
		label1.setBounds(192, 117, 134, 27);
		
		label2 = new JLabel("pontos: 20");
		label2.setForeground(Color.YELLOW);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label2.setBounds(192, 143, 134, 27);
		
		label3 = new JLabel("Celular");
		label3.setForeground(Color.YELLOW);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label3.setBounds(740, 293, 134, 27);
		
		label4 = new JLabel("pontos: 100");
		label4.setForeground(Color.YELLOW);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label4.setBounds(740, 321, 134, 27);
		
		label5 = new JLabel("Viol�o");
		label5.setForeground(Color.YELLOW);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label5.setBounds(794, 117, 134, 27);
		
		label6 = new JLabel("pontos: 40");
		label6.setForeground(Color.YELLOW);
		label6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label6.setBounds(794, 145, 134, 27);
		
		label7 = new JLabel("Fusc�o vermelho");
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label7.setBounds(505, 117, 134, 27);
		
		label8 = new JLabel("pontos: 1500");
		label8.setForeground(Color.YELLOW);
		label8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label8.setBounds(505, 145, 134, 27);
		
		label9 = new JLabel("Computador");
		label9.setForeground(Color.YELLOW);
		label9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label9.setBounds(514, 293, 134, 27);
		
		label10 = new JLabel("pontos: 500");
		label10.setForeground(Color.YELLOW);
		label10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label10.setBounds(514, 321, 134, 27);
		
		label11 = new JLabel("DVD Rei Leao HD");
		label11.setForeground(Color.YELLOW);
		label11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label11.setBounds(184, 293, 142, 27);
		
		label12 = new JLabel("pontos: 10");
		label12.setForeground(Color.YELLOW);
		label12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label12.setBounds(184, 321, 134, 27);
		
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
		
		////////////
		
		botaoConfirmar = new JButton("Confirmar");
		getBotaoConfirmar().setBounds(395, 476, 215, 51);
		painelMain.add(getBotaoConfirmar());
		
		botaoVoltar = new JButton("Voltar");
		getBotaoVoltar().setBounds(643, 476, 215, 51);
		painelMain.add(getBotaoVoltar());
		
		
		
		caixinhaDVD = new JCheckBox("");
		getCaixinhaDVD().setBackground(new Color(139, 0, 0));
		getCaixinhaDVD().setBounds(181, 355, 21, 23);
		painelMain.add(getCaixinhaDVD());
		
		caixinhaBola = new JCheckBox("");
		getCaixinhaBola().setBackground(new Color(139, 0, 0));
		getCaixinhaBola().setBounds(192, 177, 21, 23);
		painelMain.add(getCaixinhaBola());
		
		caixinhaFusca = new JCheckBox("");
		getCaixinhaFusca().setBackground(new Color(139, 0, 0));
		getCaixinhaFusca().setBounds(501, 179, 21, 23);
		painelMain.add(getCaixinhaFusca());
		
		caixinhaViolao = new JCheckBox("");
		getCaixinhaViolao().setBackground(new Color(139, 0, 0));
		getCaixinhaViolao().setBounds(794, 179, 21, 23);
		painelMain.add(getCaixinhaViolao());
		
		caixinhaComputador = new JCheckBox("");
		getCaixinhaComputador().setBackground(new Color(139, 0, 0));
		getCaixinhaComputador().setBounds(514, 352, 21, 23);
		painelMain.add(getCaixinhaComputador());
		
		caixinhaCelular = new JCheckBox("");
		getCaixinhaCelular().setBackground(new Color(139, 0, 0));
		getCaixinhaCelular().setBounds(740, 355, 21, 23);
		painelMain.add(getCaixinhaCelular());
		
		
		
		senha = new JPasswordField("");
		getSenha().setBounds(31, 455, 116, 20);
		getSenha().setColumns(10);
		getContentPane().add(getSenha());
		
		
		
		labelSenha = new JLabel("senha:");
		labelSenha.setForeground(new Color(255, 255, 0));
		labelSenha.setBounds(31, 426, 46, 14);
		
		botaoOK = new JButton("OK");
		getBotaoOK().setBounds(179, 454, 55, 23);
		
		botaoReset = new JButton("Reset");
		getBotaoReset().setBounds(244, 454, 72, 23);
		
		labelPontos = new JLabel("pontos:");
		labelPontos.setForeground(new Color(255, 255, 0));
		labelPontos.setBounds(31, 513, 46, 14);
		
		labelPontosAtuais = new JLabel("0");
		getLabelPontosAtuais().setFont(new Font("Tahoma", Font.PLAIN, 20));
		getLabelPontosAtuais().setForeground(new Color(255, 255, 0));
		getLabelPontosAtuais().setBounds(101, 503, 97, 27);
		
		painelMain.add(labelSenha);
		painelMain.add(getBotaoOK());
		painelMain.add(getBotaoReset());
		painelMain.add(labelPontos);
		painelMain.add(getLabelPontosAtuais());
		
		
		setResizable(false);
	}

	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JButton getBotaoOK() {
		return botaoOK;
	}

	public JButton getBotaoReset() {
		return botaoReset;
	}

	public JPasswordField getSenha() {
		return senha;
	}

	public JLabel getLabelPontosAtuais() {
		return labelPontosAtuais;
	}

	public JCheckBox getCaixinhaDVD() {
		return caixinhaDVD;
	}

	public JCheckBox getCaixinhaBola() {
		return caixinhaBola;
	}

	public JCheckBox getCaixinhaFusca() {
		return caixinhaFusca;
	}

	public JCheckBox getCaixinhaViolao() {
		return caixinhaViolao;
	}

	public JCheckBox getCaixinhaComputador() {
		return caixinhaComputador;
	}

	public JCheckBox getCaixinhaCelular() {
		return caixinhaCelular;
	}

}
