//funcionário lojinha troca os pontos que os visitantes receberam por andar nos brinquedos por itens da loja
package modelo;

public class FuncionarioLojinha extends Funcionario {

	public FuncionarioLojinha(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}

	//desconta os pontos do visitante de acordo com quais itens ele escolheu
	public boolean descontaPontos(Visitante visitante, boolean bot1, boolean bot2,
			boolean bot3, boolean bot4, boolean bot5,
			boolean bot6) {

		int descontar = 0;

		if (bot1) {
			descontar += 20;
		}
		if (bot2) {
			descontar += 1500;
		}
		if (bot3) {
			descontar += 40;
		}
		if (bot4) {
			descontar += 10;
		}
		if (bot5) {
			descontar += 500;
		}
		if (bot6) {
			descontar += 100;
		}

		if (visitante.descontaPontos(descontar)) {
			return true;
		} else
			return false;
	}
}
