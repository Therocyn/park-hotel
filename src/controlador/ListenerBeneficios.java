package controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
public class ListenerBeneficios extends MouseAdapter {
	

	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "O usu�rio tem todos os brinquedos do parque\n e refei��es do restaurante isentas de custo \n","VIP", JOptionPane.INFORMATION_MESSAGE);
	}
}
