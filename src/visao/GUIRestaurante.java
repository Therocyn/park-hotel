package visao;
import javax.swing.*;
import java.awt.*;

public class GUIRestaurante extends JFrame {

	private JPanel painelMain;
	private JPanel painelCima;
	private JButton botaoConfirmar, botaoVoltar, botaoReset, botaoOK;
	private JTextField texto;
	private JRadioButton botaoHamburger, botaoBatata, botaoSalada, botaoRefrigerante, botaoAgua, botaoCerveja;
	private JSpinner contadorHamburger, contadorBatata, contadorSalada, contadorRefrigerante, contadorAgua,
			contadorCerveja;
	private JLabel labelCima, labelBaixo, labelGarfo, labelCerveja, labelCerveja2, labelTotal, labelCred;
	private JLabel quantHamburger, quantBatata, quantSalada, quantRefrigerante, quantAgua, quantCerveja, labelSenha;
	private JPasswordField senha;

	public GUIRestaurante() {

		super("RESTAURANTE");

		painelMain = new JPanel();
		painelCima = new JPanel();

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(500, 200, 450, 360);

		painelMain.setBackground(new Color(139, 0, 0));
		painelMain.setLayout(null);
		setContentPane(painelMain);

		painelCima = new JPanel();
		painelCima.setBackground(new Color(220, 20, 60));
		painelCima.setBounds(80, 0, 283, 56);
		painelMain.add(painelCima);

		labelGarfo = new JLabel("");
		labelGarfo.setIcon(new ImageIcon(getClass().getResource("/img/garfo3.png")));
		painelCima.add(labelGarfo);

		labelCima = new JLabel("CARDAPIO");
		labelCima.setForeground(new Color(255, 255, 0));
		labelCima.setFont(new Font("Tahoma", Font.BOLD, 30));
		painelCima.add(labelCima);

		labelGarfo = new JLabel("");
		labelGarfo.setIcon(new ImageIcon(getClass().getResource("/img/garfo3.png")));
		painelCima.add(labelGarfo);

		labelBaixo = new JLabel("Total a pagar: ");
		labelBaixo.setForeground(new Color(255, 255, 0));
		labelBaixo.setBounds(10, 278, 87, 14);
		painelMain.add(labelBaixo);

		botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.setBounds(195, 274, 89, 23);

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(344, 274, 78, 23);

		botaoOK = new JButton("OK");
		botaoOK.setBounds(130, 235, 55, 23);

		botaoReset = new JButton("Reset");
		botaoReset.setBounds(195, 235, 78, 23);

		painelMain.add(botaoConfirmar);
		painelMain.add(botaoVoltar);
		painelMain.add(botaoOK);
		painelMain.add(botaoReset);

		botaoHamburger = new JRadioButton("Hamburger -> 10 cred.");
		botaoHamburger.setForeground(new Color(255, 255, 0));
		botaoHamburger.setBackground(new Color(139, 0, 0));
		botaoHamburger.setBounds(87, 63, 167, 23);

		botaoBatata = new JRadioButton("Batata Frita -> 8 cred.");
		botaoBatata.setForeground(new Color(255, 255, 0));
		botaoBatata.setBackground(new Color(139, 0, 0));
		botaoBatata.setBounds(87, 89, 167, 23);

		botaoSalada = new JRadioButton("Salada -> 5 cred.");
		botaoSalada.setForeground(new Color(255, 255, 0));
		botaoSalada.setBackground(new Color(139, 0, 0));
		botaoSalada.setBounds(87, 114, 147, 23);

		botaoRefrigerante = new JRadioButton("Refrigerante -> 4 cred.");
		botaoRefrigerante.setForeground(new Color(255, 255, 0));
		botaoRefrigerante.setBackground(new Color(139, 0, 0));
		botaoRefrigerante.setBounds(87, 140, 167, 23);

		botaoAgua = new JRadioButton("Agua -> 3 cred.");
		botaoAgua.setForeground(new Color(255, 255, 0));
		botaoAgua.setBackground(new Color(139, 0, 0));
		botaoAgua.setBounds(87, 166, 147, 23);

		botaoCerveja = new JRadioButton("Cerveja -> 6 cred.");
		botaoCerveja.setForeground(new Color(255, 255, 0));
		botaoCerveja.setBackground(new Color(139, 0, 0));
		botaoCerveja.setBounds(87, 192, 167, 23);

		painelMain.add(botaoHamburger);
		painelMain.add(botaoBatata);
		painelMain.add(botaoSalada);
		painelMain.add(botaoRefrigerante);
		painelMain.add(botaoAgua);
		painelMain.add(botaoCerveja);

		contadorHamburger = new JSpinner();
		contadorHamburger.setBounds(306, 64, 30, 20);

		contadorBatata = new JSpinner();
		contadorBatata.setBounds(306, 90, 30, 20);

		contadorSalada = new JSpinner();
		contadorSalada.setBounds(306, 115, 30, 20);

		contadorRefrigerante = new JSpinner();
		contadorRefrigerante.setBounds(306, 141, 30, 20);

		contadorAgua = new JSpinner();
		contadorAgua.setBounds(306, 167, 30, 20);

		contadorCerveja = new JSpinner();
		contadorCerveja.setBounds(306, 193, 30, 20);

		painelMain.add(contadorHamburger);
		painelMain.add(contadorBatata);
		painelMain.add(contadorSalada);
		painelMain.add(contadorRefrigerante);
		painelMain.add(contadorAgua);
		painelMain.add(contadorCerveja);

		quantHamburger = new JLabel("quant: ");
		quantHamburger.setForeground(new Color(255, 255, 0));
		quantHamburger.setBounds(264, 67, 41, 14);

		quantBatata = new JLabel("quant: ");
		quantBatata.setForeground(new Color(255, 255, 0));
		quantBatata.setBounds(264, 93, 41, 14);

		quantSalada = new JLabel("quant: ");
		quantSalada.setForeground(new Color(255, 255, 0));
		quantSalada.setBounds(264, 118, 41, 14);

		quantRefrigerante = new JLabel("quant: ");
		quantRefrigerante.setForeground(new Color(255, 255, 0));
		quantRefrigerante.setBounds(264, 144, 41, 14);

		quantAgua = new JLabel("quant: ");
		quantAgua.setForeground(new Color(255, 255, 0));
		quantAgua.setBounds(264, 170, 41, 14);

		quantCerveja = new JLabel("quant: ");
		quantCerveja.setForeground(new Color(255, 255, 0));
		quantCerveja.setBounds(264, 196, 41, 14);

		labelCerveja = new JLabel("");
		labelCerveja.setIcon(new ImageIcon(getClass().getResource("/img/cerveja.png")));
		labelCerveja.setBounds(333, 11, 117, 239);

		labelCerveja2 = new JLabel("");
		labelCerveja2.setIcon(new ImageIcon(getClass().getResource("/img/cerveja.png")));
		labelCerveja2.setBounds(-28, 11, 98, 239);
		painelMain.add(labelCerveja2);

		labelSenha = new JLabel("Senha:");
		labelSenha.setForeground(Color.YELLOW);
		labelSenha.setBounds(10, 239, 60, 14);

		labelCred = new JLabel("Cred:");
		labelCred.setForeground(Color.YELLOW);
		labelCred.setBounds(283, 239, 41, 14);

		labelTotal = new JLabel("");
		labelTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTotal.setForeground(Color.YELLOW);
		labelTotal.setBounds(333, 232, 89, 23);

		painelMain.add(quantHamburger);
		painelMain.add(quantBatata);
		painelMain.add(quantSalada);
		painelMain.add(quantRefrigerante);
		painelMain.add(quantAgua);
		painelMain.add(quantCerveja);
		painelMain.add(labelCerveja);
		painelMain.add(labelCerveja);
		painelMain.add(labelSenha);
		painelMain.add(labelCred);
		painelMain.add(labelTotal);

		texto = new JTextField();
		texto.setEditable(false);
		texto.setBounds(95, 275, 90, 20);
		texto.setColumns(10);
		painelMain.add(texto);

		senha = new JPasswordField("");
		senha.setBounds(52, 236, 68, 20);
		senha.setColumns(10);
		getContentPane().add(senha);

		setResizable(false);
	}

	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JButton getBotaoReset() {
		return botaoReset;
	}

	public JButton getBotaoOK() {
		return botaoOK;
	}

	public JPasswordField getSenha() {
		return senha;
	}

	public JRadioButton getBotaoHamburger() {
		return botaoHamburger;
	}

	public JRadioButton getBotaoBatata() {
		return botaoBatata;
	}

	public JRadioButton getBotaoSalada() {
		return botaoSalada;
	}

	public JRadioButton getBotaoRefrigerante() {
		return botaoRefrigerante;
	}

	public JRadioButton getBotaoAgua() {
		return botaoAgua;
	}

	public JRadioButton getBotaoCerveja() {
		return botaoCerveja;
	}

	public JSpinner getContadorHamburger() {
		return contadorHamburger;
	}

	public JSpinner getContadorBatata() {
		return contadorBatata;
	}

	public JSpinner getContadorSalada() {
		return contadorSalada;
	}

	public JSpinner getContadorRefrigerante() {
		return contadorRefrigerante;
	}

	public JSpinner getContadorAgua() {
		return contadorAgua;
	}

	public JSpinner getContadorCerveja() {
		return contadorCerveja;
	}

	public JTextField getTexto() {
		return texto;
	}

	public JLabel getLabelTotal() {
		return labelTotal;
	}

}
