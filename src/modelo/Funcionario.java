//classe funcionário descreve os atributos dos funcionários
package modelo;

public class Funcionario{

	private String senha;
	private String cpf;
	private String setor;

	public Funcionario(String cpf, String senha, String setor) {
		this.cpf = cpf;
		this.senha = senha;
		this.setor = setor;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getSetor() {
		return this.setor;
	}
}

