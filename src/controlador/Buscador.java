package controlador;
// a classe buscador tem a fun��o de achar um visitante ou funcion�rio no ArrayList e retorn�-lo para a classe chamadora	
import java.util.ArrayList;
import modelo.*;
public class Buscador {

	//recebe a senha de um visitante e retorna true se ele est� no ArrayList
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

	//recebe a senha de um funcion�rio e retorna true se ele est� no ArrayList
	public static boolean achaFuncionario(ArrayList<Funcionario> funcionarios, String senha) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
	//recebe a senha de um funcion�rio e retorna o funcion�rio
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
