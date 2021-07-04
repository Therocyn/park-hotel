//funcion�rio bilheteiro pode adicionar cr�ditos para o visitante
package modelo;

public class FuncionarioBilheteiro extends Funcionario {

	public FuncionarioBilheteiro(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}

	//adiciona cr�ditos para um visitante
	public void adicionaCreditos(Visitante visitante, double valor) {
		visitante.setCreditos(visitante.getCreditos()+valor);
	}
}
