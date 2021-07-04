package controlador;
// a classe buscador tem a função de achar um visitante ou funcionário no ArrayList e retorná-lo para a classe chamadora	
import java.util.ArrayList;
import modelo.*;
public class Buscador {

	//recebe a senha de um visitante e retorna true se ele está no ArrayList
	public static boolean achaVisitante(ArrayList<Visitante> visitantes, String senha) {
		for (Visitante visitante : visitantes) {
			if (visitante.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}

	//recebe a senha de um visitante e retorna o visitante
	public static Visitante retornaVisitante(ArrayList<Visitante> visitantes, String senha) {
		Visitante visitanteNulo = new Visitante();
		
		for (Visitante visitante : visitantes) {
			if (visitante.getSenha().equals(senha)) {
				return visitante;
			}
		}
		return visitanteNulo;
	}

	//recebe a senha de um funcionário e retorna true se ele está no ArrayList
	public static boolean achaFuncionario(ArrayList<Funcionario> funcionarios, String senha) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
	//recebe a senha de um funcionário e retorna o funcionário
	public static Funcionario retornaFuncionario(ArrayList<Funcionario> funcionarios, String senha) {
		Funcionario funcionarioNulo = new Funcionario(null, null, null);

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getSenha().equals(senha)) {
				return funcionario;
			}
		}
		return funcionarioNulo;
	}
}
