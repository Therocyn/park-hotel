package visao;


import javax.swing.*;
import java.awt.*;

public class GUICadastro extends JFrame{ 
	
	private JPanel painelCima, painelMain;
	private JTextField texto1, texto2, texto3, texto4, textoSenha;
	private JButton botao1, botao2;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, labelcm, labelkg;
	private JRadioButton botaoSim, botaoNao;
	
	public GUICadastro() {
		
		super("CADASTRO");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		
		painelMain = new JPanel();
		painelCima = new JPanel();
		
		painelMain.setBackground(new Color(140, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);
		
		painelCima.setBackground(new Color(139, 0, 0));
		painelCima.setBounds(0, 0, 444, 56);
		painelMain.add(painelCima);
		
		label1 = new JLabel("CADASTRO");
		label1.setFont(new Font("Tahoma", Font.BOLD, 36));
		label1.setForeground(new Color(255, 255, 0));
		
		label2 = new JLabel("Nome: ");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label2.setForeground(new Color(255, 255, 0));
		label2.setBounds(67, 85, 68, 21);
		
		label3 = new JLabel("Altura: ");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label3.setForeground(new Color(255, 255, 0));
		label3.setBounds(67, 161, 68, 31);
		
		labelcm = new JLabel("cm");
		labelcm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelcm.setForeground(new Color(255, 255, 0));
		labelcm.setBounds(220, 161, 68, 31);
		
		label4 = new JLabel("Idade: ");
		label4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label4.setForeground(new Color(255, 255, 0));
		label4.setBounds(67, 124, 68, 21);
		
		label5 = new JLabel("Peso: ");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label5.setForeground(new Color(255, 255, 0));
		label5.setBounds(67, 208, 56, 21);
		
		labelkg = new JLabel("Kg");
		labelkg.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelkg.setForeground(new Color(255, 255, 0));
		labelkg.setBounds(220, 208, 56, 21);
		
		label6 = new JLabel("VIP? ");
		label6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label6.setForeground(new Color(255, 255, 0));
		label6.setBounds(67, 253, 46, 31);
		
		label7 = new JLabel("Quais os beneficios do VIP?");
		label7.setForeground(new Color(255, 255, 0));
		label7.setBounds(257, 264, 177, 14);
		
		label8 = new JLabel("Defina uma  senha: ");
		label8.setForeground(Color.YELLOW);
		label8.setBounds(67, 295, 163, 31);
		
		painelCima.add(label1);
		painelMain.add(label2);
		painelMain.add(label3);
		painelMain.add(labelcm);
		painelMain.add(label4);
		painelMain.add(label5);
		painelMain.add(labelkg);
		painelMain.add(label6);
		painelMain.add(label7);
		painelMain.add(label8);
		
		
		
		botao1 = new JButton("Cadastrar");
		botao1.setBounds(101, 365, 112, 23);
		painelMain.add(botao1);
		
		botao2 = new JButton("Voltar");
		botao2.setBounds(234, 365, 89, 23);
		painelMain.add(botao2);
		
		
		
		texto1 = new JTextField();
		texto1.setBounds(126, 88, 282, 20);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(126, 127, 86, 20);
		texto2.setColumns(10);
		
		texto3 = new JTextField();
		texto3.setBounds(126, 169, 86, 20);
		texto3.setColumns(10);
		
		texto4 = new JTextField();
		texto4.setBounds(126, 209, 86, 20);
		texto4.setColumns(10);
		
		textoSenha = new JTextField();
		textoSenha.setColumns(10);
		textoSenha.setBounds(190, 300, 86, 20);
		
		painelMain.add(texto1);
		painelMain.add(texto2);
		painelMain.add(texto3);
		painelMain.add(texto4);
		painelMain.add(textoSenha);
		
		botaoSim = new JRadioButton("Sim");
		botaoSim.setForeground(new Color(255, 255, 0));
		botaoSim.setBackground(new Color(139, 0, 0));
		botaoSim.setBounds(116, 260, 56, 23);
		
		botaoNao = new JRadioButton("Nao");
		botaoNao.setForeground(new Color(255, 255, 0));
		botaoNao.setBackground(new Color(139, 0, 0));
		botaoNao.setBounds(174, 260, 56, 23);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(botaoSim);
		grupo.add(botaoNao);
		
		painelMain.add(botaoSim);
		painelMain.add(botaoNao);
		
		setResizable(false);
	}
	
	public JButton getConfirmacaoCadastro() {
		return this.botao1;
	}
	public JButton getVoltar() {
		return this.botao2;
	}
	public JTextField getNome() {
		return this.texto1;
	}
	public JTextField getIdade() {
		return this.texto2;
	}
	public JTextField getAltura() {
		return this.texto3;
	}
	public JTextField getPeso() {
		return this.texto4;
	}
	public JTextField getSenha() {
		return this.textoSenha;
	}
	public JRadioButton getBotaoSim() {
		return this.botaoSim;
	}
	public JRadioButton getBotaoNao() {
		return this.botaoNao;
	}
	
	public JLabel getBeneficios() {
		return this.label7;
	}
}
	