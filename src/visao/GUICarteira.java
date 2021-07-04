package visao;
import java.awt.*;
import javax.swing.*;

public class GUICarteira extends JFrame {

	private JPanel painelMain;
	private JLabel label1, label2, label3;
	private JLabel labelCreditos,labelPontos;
	private JButton botaoVoltar;

	public GUICarteira() {

		super("CARTEIRA");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(500, 150, 450, 300);

		painelMain = new JPanel();
		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		
		
		botaoVoltar = new JButton("Voltar");
		getBotaoVoltar().setBounds(166, 199, 89, 23);
		painelMain.add(getBotaoVoltar());

		label1 = new JLabel("CARTEIRA");
		label1.setForeground(new Color(255, 255, 0));
		label1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
		label1.setBounds(122, 11, 200, 40);
		
		label2 = new JLabel("CR�DITOS: ");
		label2.setForeground(new Color(255, 255, 0));
		label2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		label2.setBounds(106, 88, 106, 23);
		
		label3 = new JLabel("PONTOS: ");
		label3.setForeground(Color.YELLOW);
		label3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		label3.setBounds(106, 136, 106, 23);
		
		painelMain.add(label1);
		painelMain.add(label2);
		painelMain.add(label3);

		
		
		labelCreditos = new JLabel("");
		getLabelCreditos().setForeground(Color.YELLOW);
		getLabelCreditos().setFont(new Font("Tahoma", Font.PLAIN, 20));
		getLabelCreditos().setBounds(222, 85, 106, 23);
		painelMain.add(getLabelCreditos());

		labelPontos = new JLabel("");
		getLabelPontos().setForeground(Color.YELLOW);
		getLabelPontos().setFont(new Font("Tahoma", Font.PLAIN, 20));
		getLabelPontos().setBounds(222, 133, 106, 23);
		painelMain.add(getLabelPontos());

		setResizable(false);
	}

	public JLabel getLabelCreditos() {
		return labelCreditos;
	}

	public JLabel getLabelPontos() {
		return labelPontos;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

}
