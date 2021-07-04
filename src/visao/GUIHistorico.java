package visao;
import java.awt.*;
import javax.swing.*;

public class GUIHistorico extends JFrame {

	private JPanel painelMain;
	private TextArea areaTexto;
	private JButton botaoVoltar;
	private JLabel labelHistorico;


	public GUIHistorico() {

		super("HIS�RICO DE COMPRAS");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(500, 100, 450, 450);
		
		painelMain = new JPanel();
		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		
		labelHistorico = new JLabel("HIST�RICO DE COMPRAS");
		labelHistorico.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		labelHistorico.setForeground(new Color(255, 255, 0));
		labelHistorico.setBounds(50, 0, 333, 58);
		painelMain.add(labelHistorico);

		botaoVoltar = new JButton("Voltar");
		getBotaoVoltar().setBounds(172, 377, 89, 23);
		painelMain.add(getBotaoVoltar());

		areaTexto = new TextArea();
		getAreaTexto().setEditable(false);
		getAreaTexto().setBounds(60, 69, 291, 266);
		painelMain.add(getAreaTexto());

		setResizable(false);

	}

	public TextArea getAreaTexto() {
		return areaTexto;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}
		
}
