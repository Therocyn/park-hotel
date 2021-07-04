//Funcionário de entretenimento adulto é responsável pela área do parque destinada à adultos
package modelo;

public class FuncionarioEntretAdulto extends Funcionario{
	
	public FuncionarioEntretAdulto(String cpf, String senha, String setor) {
		super(cpf,senha, setor);
	}
	
	//efetua o pagamento dos produtos
	public int pagamentoEntretenimento(Visitante visitante, boolean champanhe, boolean balada, boolean vinho, boolean hidromassagem) {
		
		double aPagarTotal = 0;

		String[] addRecibo = { "", "", "", ""};

		//se o visitante não tiver mais de 18 anos ele não consegue comprar
		if(visitante.getIdade() < 18) {
			return 1;
		}
		
		//se o visitante tiver vip ele não paga
		if (!visitante.getVip()) {

			if (champanhe) {
				aPagarTotal += 30;
				addRecibo[0] = String.format("Champanhe R$%.2f", 30.00);//adiciona o produto no recibo
			}
			if (balada) {
				aPagarTotal += 15;
				addRecibo[1] = String.format("Balada R$%.2f", 15.00);
			}
			if (vinho) {
				aPagarTotal += 60;
				addRecibo[2] = String.format("Vinho R$%.2f", 60.00);
			}
			if (hidromassagem) {
				aPagarTotal += 20;
				addRecibo[3] = String.format("Hidromassagem R$%.2f", 20.00);
			}

			if (visitante.descontaCreditos(aPagarTotal)) {
				for (int i = 0; i < addRecibo.length; i++) {
					if (addRecibo[i].equals("")) {

					} else {
						visitante.addRecibo(addRecibo[i]);//adiciona todos os produtos no recibo
					}
				}
				return 0;//retorna 0 se o visitante tem créditos suficientes
			} else
				return 2;//retorna 2 se o visitante não tem créditos suficientes
		} else
			return 0;
	}
}
