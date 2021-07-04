package controlador;
import visao.GUILogin;
import java.awt.event.*;
public class ListenerCliqueDeMouse extends MouseAdapter {
	GUILogin guiLogin;
	Controlador control;
	
	public ListenerCliqueDeMouse(GUILogin guiLogin, Controlador control) {
		this.guiLogin = guiLogin;
		this.control = control;
	}

	public void mouseClicked(MouseEvent e) {
		guiLogin.dispose();
		control.abrirGUIcadastro();
	}
}