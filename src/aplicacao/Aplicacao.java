package aplicacao;
//Integrantes do grupo: Bruno Closs, Nicolas Boesing, Vitor Simon.
import modelo.*;
import java.util.ArrayList;

import controlador.Controlador;
import controlador.ManipuladorSerializaveis;

public class Aplicacao {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
		visitantes = (ArrayList<Visitante>) ManipuladorSerializaveis.desserializa("visitantes.txt");
		FuncionarioBilheteiro dudu = new FuncionarioBilheteiro("123456789-10", "1", "Bilheteiro");
		FuncionarioBrinquedos zeze = new FuncionarioBrinquedos("347635660-40", "2", "Brinquedos");  //instancia��o dos funcionarios
		FuncionarioEntretAdulto pedrao = new FuncionarioEntretAdulto("541709510-93", "3", "Entret.Adulto");
		FuncionarioHotel adao = new FuncionarioHotel("505560960-53", "4", "Hotel");
		FuncionarioLojinha patrick = new FuncionarioLojinha("887488390-00", "5", "Lojinha");
		FuncionarioRestaurante marcello = new FuncionarioRestaurante("728750810-98", "6", "Restaurante");
		funcionarios.add(dudu);
		funcionarios.add(zeze);
		funcionarios.add(pedrao);
		funcionarios.add(adao);
		funcionarios.add(patrick);
		funcionarios.add(marcello);

		Controlador control = new Controlador(funcionarios, visitantes);
		
	}
}