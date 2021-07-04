//funcion�rio do hotel efetua o check-in e o check-out do visitante
package modelo;

import java.util.ArrayList;

import controlador.ManipuladorSerializaveis;

public class FuncionarioHotel extends Funcionario {


	public FuncionarioHotel(String cpf, String senha, String setor) {
		super(cpf, senha, setor);
	}

	//recebe os dados do check-in, efetua o pagamento e registra em um arquivo a data e a hora
	public boolean checkIn(Visitante visitante, double aPagarTotal, int dia, int mes, int ano, int hora, int minuto) {

		ArrayList<String> checkIn = new ArrayList<String>();
		checkIn = (ArrayList<String>) ManipuladorSerializaveis.desserializa("check-in.txt");

		if (visitante.descontaCreditos(aPagarTotal)) {
			checkIn.add("O h�spede " + visitante.getNome() + " fez check-in no dia " + dia + "/" + mes + "/" + ano
					+ " no hor�rio " + hora + ":" + minuto);
			visitante.addRecibo(String.format("Hotel R$%.2f", aPagarTotal));
			ManipuladorSerializaveis.serializa("check-in.txt", checkIn);
			return true;
		} else {
			return false;
		}
	}

	//informa o valor total que o visitante ira gastar no hotel
	public double informarTotalCheckIn(Visitante visitante, int diasHospedagem, int numCamas, boolean servicoQuarto,
			boolean acessoPiscinaJogos) {
		double aPagarTotal = 0;
		int taxaServicoQuarto = 0;
		int taxaPiscinaJogos = 0;

		if (servicoQuarto) {
			taxaServicoQuarto = 50;
		}
		if (acessoPiscinaJogos) {
			taxaPiscinaJogos = 10;
		}

		aPagarTotal = (diasHospedagem * 50) + (numCamas * 50 + 100) + taxaServicoQuarto + taxaPiscinaJogos;

		return aPagarTotal;
	}

	//recebe os dados do check-out e registra em um arquivo a data e a hora
	public void checkOut(Visitante visitante, int dia, int mes, int ano, int hora, int minuto) {
		ArrayList<String> checkOut = new ArrayList<String>();
		checkOut = (ArrayList<String>) ManipuladorSerializaveis.desserializa("check-out.txt");

		checkOut.add("O h�spede " + visitante.getNome() + " fez check-out no dia " + dia + "/" + mes + "/" + ano
				+ " no hor�rio " + hora + ":" + minuto);

		ManipuladorSerializaveis.serializa("check-out.txt", checkOut);
	}
}
