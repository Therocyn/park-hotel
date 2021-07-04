//funcionário bilheteiro pode adicionar créditos para o visitante
package modelo;

public class FuncionarioBilheteiro extends Funcionario {

	public FuncionarioBilheteiro(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}

	//adiciona créditos para um visitante
	public void adicionaCreditos(Visitante visitante, double valor) {
		visitante.setCreditos(visitante.getCreditos()+valor);
	}
}
