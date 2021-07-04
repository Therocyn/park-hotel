package visao;
import javax.swing.*;
import java.awt.*;

public class GUIBilheteiro extends JFrame {

	private JPanel painelMain;
	private final JPanel painelCima;
	private JTextField texto;
	private JButton botaoConfirmar, botaoVoltar;
	private JPasswordField senha;
	private JLabel labelCima, label1, label2;

	public GUIBilheteiro() {
		
		super("MENU DO BILHETEIRO");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		painelMain = new JPanel();
		painelCima = new JPanel();

		painelMain.setBackground(new Color(140, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);
		
		painelCima.setBackground(new Color(140, 0, 0));
		painelCima.setBounds(0, 0, 435, 35);
		painelMain.add(painelCima);

		labelCima = new JLabel("Menu do Bilheteiro");
		labelCima.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelCima.setForeground(new Color(255, 255, 0));
		painelCima.add(labelCima);

		label1 = new JLabel("Senha do Visitante: ");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setForeground(new Color(255, 255, 0));
		label1.setBounds(95, 90, 133, 27);
		
		label2 = new JLabel("Adicionar Creditos: ");
		label2.setForeground(Color.YELLOW);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label2.setBounds(95, 140, 133, 27);
		
		painelMain.add(label1);
		painelMain.add(label2);

		senha = new JPasswordField("");
		getSenha().setBounds(240, 90, 86, 20);
		getSenha().setColumns(10);
		getContentPane().add(getSenha());

		texto = new JTextField();
		getTexto().setBounds(240, 150, 86, 20);
		getTexto().setColumns(10);
		painelMain.add(getTexto());

		botaoConfirmar = new JButton("Confirmar");
		getBotaoConfirmar().setBounds(115, 210, 100, 25);

		botaoVoltar = new JButton("Voltar");
		getBotaoVoltar().setBounds(230, 210, 90, 25);

		painelMain.add(getBotaoConfirmar());
		painelMain.add(getBotaoVoltar());

		setResizable(false);
	}

	public JTextField getTexto() {
		return texto;
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
