//classe que descreve o visitante do parque
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Visitante implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String senha;
	private boolean vip;
	private double altura;
	private int idade;
	private double peso;
	private double pontos=0;
	private double creditos=0;
	private double precoTotalHotel=0;

	ArrayList<String> recibo;

	public Visitante(String nome, String senha, double altura, int idade, double peso, boolean vip) {
		recibo = new ArrayList<String>();
		this.nome = nome;
		this.senha = senha;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
		this.vip = vip;
	}

	public Visitante() {

	}

	public ArrayList<String> getRecibo(){
		return recibo;
	}
	
	public void addRecibo(String s) {
		if (vip == false) {
			recibo.add(s);
		}
	}
	
	public double getPeso() {
		return peso;
	}

	public String getNome() {
		return nome;
	}

	public boolean getVip() {
		return vip;
	}

	public double getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public double getCreditos() {
		return this.creditos;
	}

	//só desconta se o visitante tiver pontos suficientes
	public boolean descontaPontos(double pontos) {
		if (this.pontos - pontos >= 0) {
			this.pontos -= pontos;
			return true;
		}
		return false;
	}

	public void adicionaPontos(double pontos) {
		this.pontos += pontos;
	}

	//só desconta se o visitante não tiver vip e tiver pontos suficientes
	public boolean descontaCreditos(double creditos) {
		if ((!vip) && (this.creditos - creditos >= 0)) {
			this.creditos -= creditos;
			return true;
		}
		return false;
	}

	public double getPrecoTotalHotel() {
		return precoTotalHotel;
	}

	public void setPrecoTotalHotel(double precoTotalHotel) {
		this.precoTotalHotel = precoTotalHotel;
	}
	
	public double getPontos() {
		return pontos;
	}
}