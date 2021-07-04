//funcionário brinquedos controla a entrada dos visitantes nos brinquedos do parque
package modelo;

public class FuncionarioBrinquedos extends Funcionario {
	
	public FuncionarioBrinquedos(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}
	
	//recebe um visitante e qual brinquedo o usuário selecionou
	public int andarBrinquedos(Visitante visitante, boolean bot1, boolean bot2, boolean bot3, boolean bot4,
			boolean bot5) {
		if (bot1) {
			return andarCarrossel(visitante);
		}
		if (bot2) {
			return andarMontanhaRussa(visitante);
		}
		if (bot3) {
			return andarRodaGigante(visitante);
		}
		if (bot4) {
			return andarCasaAssombrada(visitante);
		}
		if (bot5) {
			return andarCarroChoque(visitante);
		}
		return 3;
	}

	/* 
	 * Se o visitante tiver créditos suficientes e atender aos requisitos de idade, altura e peso, então ele poderá andar
	 * no brinquedo. Isso se aplica para todos os brinquedos
	*/
	
	public int andarCarrossel(Visitante visitante) {
		if (visitante.descontaCreditos(20) || visitante.getVip()) {
			visitante.adicionaPontos(60);//adiciona pontos
			visitante.addRecibo("Carrossel R$20,00");//adiciona o produto no recibo
			return 0;
		} else {
			return 2;
		}
	}

	public int andarMontanhaRussa(Visitante visitante) {
		if (visitante.getIdade() >= 12 && visitante.getAltura() >= 120 && visitante.getPeso() <= 120) {
			if (visitante.descontaCreditos(100) || visitante.getVip()) {
				visitante.adicionaPontos(300);
				visitante.addRecibo("Montanha Russa R$100,00");
				return 0;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public int andarRodaGigante(Visitante visitante) {
		if (visitante.getAltura() >= 120 && visitante.getPeso() <= 140) {
			if (visitante.descontaCreditos(60) || visitante.getVip()) {
				visitante.adicionaPontos(180);
				visitante.addRecibo("Roda Gigante R$60,00");
				return 0;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public int andarCasaAssombrada(Visitante visitante) {
		if (visitante.getIdade() >= 14 && visitante.getIdade() <= 60) {
			if (visitante.descontaCreditos(70) || visitante.getVip()) {
				visitante.adicionaPontos(210);
				visitante.addRecibo("Casa Assombrada R$70,00");
				return 0;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public int andarCarroChoque(Visitante visitante) {
		if (visitante.getIdade() >= 10 && visitante.getAltura() >= 120) {
			if (visitante.descontaCreditos(80) || visitante.getVip()) {
				visitante.adicionaPontos(240);
				visitante.addRecibo("Carro Choque R$80,00");
				return 0;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}
}
