package visao;


import javax.swing.*;
import java.awt.*;

public class GUIHotel extends JFrame {

	private JPanel painelMain;
	private JButton botaoCheckIn, botaoCheckOut, botaoVoltar;
	private JLabel labelHotel, labelImg;

	public GUIHotel() {

		super("HOTEL");

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(500, 170, 480, 340);

		painelMain = new JPanel();
		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		labelHotel = new JLabel("HOTEL");
		labelHotel.setForeground(new Color(255, 255, 0));
		labelHotel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 50));
		labelHotel.setBounds(178, 21, 180, 52);
		painelMain.add(labelHotel);

		labelImg = new JLabel("");
		labelImg.setIcon(new ImageIcon(getClass().getResource("/img/hotel.png")));
		labelImg.setBounds(92, 0, 88, 80);
		painelMain.add(labelImg);

		botaoCheckIn = new JButton("Check-in");
		botaoCheckIn.setBounds(167, 109, 122, 40);

		botaoCheckOut = new JButton("Check-out");
		botaoCheckOut.setBounds(167, 160, 122, 40);
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(167, 240, 122, 20);

		painelMain.add(botaoCheckIn);
		painelMain.add(botaoCheckOut);
		painelMain.add(botaoVoltar);

		setResizable(false);
		
	}
	
	public JButton getbotaoCheckIn() {
		return this.botaoCheckIn;
	}
	public JButton getbotaoCheckOut() {
		return this.botaoCheckOut;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

}
