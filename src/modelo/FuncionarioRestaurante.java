//funcionário restaurante efetua o pagamento das refeições
package modelo;

public class FuncionarioRestaurante extends Funcionario {

	public FuncionarioRestaurante(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}

	//desconta os créditos do visitante de acordo com qual produto ele escolheu
	public boolean pagamentoRefeicao(Visitante visitante, boolean bot1, int qntdproduto1, boolean bot2,
			int qntdproduto2, boolean bot3, int qntdproduto3, boolean bot4, int qntdproduto4, boolean bot5,
			int qntdproduto5, boolean bot6, int qntdproduto6) {

		double aPagarTotal = 0;

		String[] addRecibo = { "", "", "", "", "", ""};

		//se o visitante tiver vip não paga
		if (!visitante.getVip()) {

			if (bot1) {
				double aPagar1;
				aPagar1 = 10 * qntdproduto1;
				aPagarTotal += aPagar1;
				addRecibo[0] = String.format("%d Hamburger R$%.2f", qntdproduto1,aPagar1);
			}
			if (bot2) {
				double aPagar2;
				aPagar2 = 8 * qntdproduto2;
				aPagarTotal += aPagar2;
				addRecibo[1] = String.format("%d Batata frita R$%.2f", qntdproduto2,aPagar2);
			}
			if (bot3) {
				double aPagar3;
				aPagar3 = 5 * qntdproduto3;
				aPagarTotal += aPagar3;
				addRecibo[2] = String.format("%d Salada R$%.2f", qntdproduto3,aPagar3);
			}
			if (bot4) {
				double aPagar4;
				aPagar4 = 4 * qntdproduto4;
				aPagarTotal += aPagar4;
				addRecibo[3] = String.format("%d Refrigerante R$%.2f", qntdproduto4,aPagar4);
			}
			if (bot5) {
				double aPagar5;
				aPagar5 = 3 * qntdproduto5;
				aPagarTotal += aPagar5;
				addRecibo[4] = String.format("%d Agua R$%.2f", qntdproduto5,aPagar5);
			}
			if (bot6) {
				double aPagar6;
				aPagar6 = 6 * qntdproduto6;
				aPagarTotal += aPagar6;
				addRecibo[5] = String.format("%d Cerveja R$%.2f", qntdproduto6,aPagar6);
			}

			//se o visitante tiver créditos suficiente retorna true
			if (visitante.descontaCreditos(aPagarTotal)) {
				for (int i = 0; i < addRecibo.length; i++) {
					if (addRecibo[i].equals("")) {

					} else {
						visitante.addRecibo(addRecibo[i]);//adiciona o produto no recibo
					}
				}
				return true;
			} else
				return false;//se não tiver créditos retorna false
		} else
			return true;
	}
	
	//informa o valor total da refeição sem descontar dos créditos
	public double InformaValorRefeicao(Visitante visitante, boolean bot1, int qntdproduto1, boolean bot2,
			int qntdproduto2, boolean bot3, int qntdproduto3, boolean bot4, int qntdproduto4, boolean bot5,
			int qntdproduto5, boolean bot6, int qntdproduto6) {

		double aPagarTotal = 0;

		if (!visitante.getVip()) {

			if (bot1) {
				aPagarTotal += 10 * qntdproduto1;;
			}
			if (bot2) {
				aPagarTotal += 8 * qntdproduto2;;
			}
			if (bot3) {
				aPagarTotal += 5 * qntdproduto3;
			}
			if (bot4) {
				aPagarTotal += 4 * qntdproduto4;
			}
			if (bot5) {
				aPagarTotal += 3 * qntdproduto5;
			}
			if (bot6) {
				aPagarTotal += 6 * qntdproduto6;
			}	
		}
		
		return aPagarTotal;
	}
}
