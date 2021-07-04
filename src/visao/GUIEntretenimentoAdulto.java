package visao;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUIEntretenimentoAdulto extends JFrame{
	
	private JPanel painelCima, painelMain;
	private JPasswordField senha;
	private JLabel labelCima, labelPergunta;
	private JButton botaoConfirmar, botaoVoltar, botaoOK, botaoReset;
	private JRadioButton botaoSim, botaoNao;
	private JLabel labelPontos, labelPontosAtuais, labelSenha;
	private JLabel imgChampanhe, imgAcompanhante, imgHidro, imgBalada, imgVinho;
	private JCheckBox caixinhaChampanhe, caixinhaVinho, caixinhaBalada, caixinhaHidro;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8;


public GUIEntretenimentoAdulto() {
	
	super("ENTRETENIMENTO ADULTO");
	
	setResizable(false);
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	setBounds(350, 100, 700, 500);
	
	painelMain = new JPanel();
	painelCima = new JPanel();
	
	painelMain.setBackground(new Color(139, 0, 0));
	painelMain.setLayout(null);
	setContentPane(painelMain);
	
	painelCima.setBackground(new Color(139, 0, 0));
	painelCima.setBounds(0, 0, 509, 38);
	painelMain.add(painelCima);

	labelCima = new JLabel("Entretenimento Adulto");
	labelCima.setFont(new Font("Tahoma", Font.BOLD, 23));
	labelCima.setForeground(new Color(255, 255, 0));
	painelCima.add(labelCima);
	
	labelPergunta = new JLabel("Acompanhante?");
	labelPergunta.setForeground(new Color(255, 255, 0));
	labelPergunta.setBounds(276, 145, 117, 14);
	painelMain.add(labelPergunta);

	///////////////////////
	
	imgChampanhe = new JLabel("");
	imgChampanhe.setIcon(new ImageIcon(getClass().getResource("/img/champagne.png")));
	imgChampanhe.setBounds(0, 51, 65, 101);
	
	imgAcompanhante = new JLabel("");
	imgAcompanhante.setIcon(new ImageIcon(getClass().getResource("/img/acompanhante.png")));
	imgAcompanhante.setBounds(185, 103, 96, 118);
	
	imgHidro = new JLabel("");
	imgHidro.setIcon(new ImageIcon(getClass().getResource("/img/hidro.png")));
	imgHidro.setBounds(403, 202, 157, 101);
	
	imgBalada = new JLabel("");
	imgBalada.setIcon(new ImageIcon(getClass().getResource("/img/balada.png")));
	imgBalada.setBounds(403, 64, 109, 90);
	
	imgVinho = new JLabel("");
	imgVinho.setIcon(new ImageIcon(getClass().getResource("/img/vinho.png")));
	imgVinho.setBounds(10, 180, 76, 134);
	
	painelMain.add(imgChampanhe);
	painelMain.add(imgAcompanhante);
	painelMain.add(imgHidro);
	painelMain.add(imgBalada);
	painelMain.add(imgVinho);

	//////////////
	ButtonGroup grupo1 = new ButtonGroup();
	botaoSim = new JRadioButton("Sim");
	botaoSim.setForeground(new Color(255, 255, 0));
	botaoSim.setBackground(new Color(139, 0, 0));
	botaoSim.setBounds(276, 166, 109, 23);
	
	botaoNao = new JRadioButton("Nao");
	botaoNao.setForeground(new Color(255, 255, 0));
	botaoNao.setBackground(new Color(139, 0, 0));
	botaoNao.setBounds(276, 192, 109, 23);
	grupo1.add(botaoSim);
	grupo1.add(botaoNao);
	painelMain.add(botaoSim);
	painelMain.add(botaoNao);

	///////////////////////
	
	label1 = new JLabel("CHAMPANHE");
	label1.setForeground(new Color(255, 255, 0));
	label1.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label1.setBounds(90, 64, 101, 28);
	
	label2 = new JLabel("creditos: 30");
	label2.setForeground(Color.YELLOW);
	label2.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label2.setBounds(90, 79, 101, 28);
	
	label3 = new JLabel("VINHO");
	label3.setForeground(Color.YELLOW);
	label3.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label3.setBounds(106, 213, 101, 28);
	
	label4 = new JLabel("creditos: 60");
	label4.setForeground(Color.YELLOW);
	label4.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label4.setBounds(106, 228, 101, 28);
	
	label5 = new JLabel("BALADA");
	label5.setForeground(Color.YELLOW);
	label5.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label5.setBounds(522, 79, 101, 28);
	
	label6 = new JLabel("creditos: 15");
	label6.setForeground(Color.YELLOW);
	label6.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label6.setBounds(522, 94, 101, 28);
	
	label7 = new JLabel("HIDROMASSAGEM");
	label7.setForeground(Color.YELLOW);
	label7.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label7.setBounds(522, 241, 101, 28);
	
	label8 = new JLabel("creditos: 20");
	label8.setForeground(Color.YELLOW);
	label8.setFont(new Font("Tahoma", Font.PLAIN, 11));
	label8.setBounds(522, 256, 101, 28);
	
	painelMain.add(label1);
	painelMain.add(label2);
	painelMain.add(label3);
	painelMain.add(label4);
	painelMain.add(label5);
	painelMain.add(label6);
	painelMain.add(label7);
	painelMain.add(label8);

	//////////////////
	
	caixinhaChampanhe = new JCheckBox("");
	getCaixinhaChampanhe().setBackground(new Color(139, 0, 0));
	getCaixinhaChampanhe().setBounds(90, 103, 22, 23);
	
	caixinhaVinho = new JCheckBox("");
	getCaixinhaVinho().setBackground(new Color(139, 0, 0));
	getCaixinhaVinho().setBounds(106, 252, 22, 23);
	
	caixinhaBalada = new JCheckBox("");
	getCaixinhaBalada().setBackground(new Color(139, 0, 0));
	getCaixinhaBalada().setBounds(522, 118, 22, 23);
	
	caixinhaHidro = new JCheckBox("");
	getCaixinhaHidro().setBackground(new Color(139, 0, 0));
	getCaixinhaHidro().setBounds(522, 280, 22, 23);
	
	painelMain.add(getCaixinhaChampanhe());
	painelMain.add(getCaixinhaVinho());
	painelMain.add(getCaixinhaBalada());
	painelMain.add(getCaixinhaHidro());
	
	///////////////////
	
	labelPontos = new JLabel("Cr�ditos: ");
	labelPontos.setForeground(new Color(255, 255, 0));
	labelPontos.setBounds(26, 415, 46, 14);
	
	labelPontosAtuais = new JLabel("0");
	getLabelPontosAtuais().setFont(new Font("Tahoma", Font.PLAIN, 20));
	getLabelPontosAtuais().setForeground(new Color(255, 255, 0));
	getLabelPontosAtuais().setBounds(82, 401, 125, 35);
	
	labelSenha = new JLabel("senha:");
	labelSenha.setForeground(new Color(255, 255, 0));
	labelSenha.setBounds(26, 352, 46, 14);
	
	senha = new JPasswordField("");
	getSenha().setBounds(26, 367, 86, 20);
	getSenha().setColumns(10);
	getContentPane().add(getSenha()); 
	
	painelMain.add(labelPontos);
	painelMain.add(getLabelPontosAtuais());
	painelMain.add(labelSenha);

	////////////////
	
	botaoConfirmar = new JButton("Confirmar");
	getBotaoConfirmar().setBounds(352, 367, 125, 38);
	
	botaoOK = new JButton("OK");
	getBotaoOK().setBounds(133, 366, 55, 23);
	
	botaoReset = new JButton("Reset");
	getBotaoReset().setBounds(200, 366, 80, 23);
	
	botaoVoltar = new JButton("Voltar");
	getBotaoVoltar().setBounds(498, 367, 86, 38);
	
	painelMain.add(getBotaoConfirmar());
	painelMain.add(getBotaoOK());
	painelMain.add(getBotaoReset());
	painelMain.add(getBotaoVoltar());
	
}


public JCheckBox getCaixinhaChampanhe() {
	return caixinhaChampanhe;
}


public JCheckBox getCaixinhaVinho() {
	return caixinhaVinho;
}


public JCheckBox getCaixinhaBalada() {
	return caixinhaBalada;
}


public JCheckBox getCaixinhaHidro() {
	return caixinhaHidro;
}


public JPasswordField getSenha() {
	return senha;
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


public JLabel getLabelPontosAtuais() {
	return labelPontosAtuais;
}

}
