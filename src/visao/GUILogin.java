package visao;
import javax.swing.*;
import java.awt.*;
import java.lang.ClassLoader.*;

public class GUILogin extends JFrame {

	private JPanel painelMain;
	private JLabel label1, label2, label3, label4, label5;
	private JButton botao;
	private final JPasswordField senha;
	private JButton botao2;

	public GUILogin() {

		super("LOGIN");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		painelMain = new JPanel();
		painelMain.setBackground(new Color(130, 0, 0));
		painelMain.setBorder(null);
		painelMain.setLayout(null);
		setContentPane(painelMain);

		senha = new JPasswordField("");
		senha.setBounds(150, 130, 130, 20);
		senha.setColumns(10);
		getContentPane().add(senha);

		label1 = new JLabel("Digite sua senha:");
		label1.setForeground(new Color(255, 255, 0));
		label1.setBounds(50, 130, 100, 15);

		label2 = new JLabel("SEJA BEM-VINDO");
		label2.setForeground(new Color(255, 255, 0));
		label2.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		label2.setBounds(49, 35, 339, 65);

		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(getClass().getResource("/img/roda2.png")));
		label3.setBounds(30, 160, 100, 90);
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(getClass().getResource("/img/roller2.png")));
		label4.setBounds(336, 125, 98, 136);

		label5 = new JLabel("Cadastrar-se");
		label5.setForeground(new Color(255, 255, 0));
		label5.setBounds(125, 170, 100, 15);

		painelMain.add(label1);
		painelMain.add(label2);
		painelMain.add(label3);
		painelMain.add(label4);
		painelMain.add(label5);

		botao = new JButton("OK");
		botao.setBounds(290, 130, 60, 20);
		painelMain.add(botao);
		botao2 = new JButton("Sair");
		getBotao2().setBounds(183, 230, 80, 20);
		painelMain.add(getBotao2());
		setResizable(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	}

	public JPasswordField getSenha() {
		return this.senha;
	}

	public JButton getBotaoLogin() {
		return this.botao;
	}

	public JLabel getCadastrar() {
		return this.label5;
	}

	public JButton getBotao2() {
		return botao2;
	}
}
