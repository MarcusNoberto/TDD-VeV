package gerador;

import util.Util;

public class Fatura {

	private String nome;
	private String endereco;
	private double valor;
	private Servico servico;
	
	public Fatura (String nome, String endereco, double valor, String servico) {
		
		if (nome == null || endereco == null || valor <= 0 || servico == null) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		if (nome.isBlank() || endereco.isBlank() || servico.isBlank()) {
			throw new IllegalArgumentException("Informações não podem ser vazios.");
		}
		
		this.nome = nome;
		this.endereco = endereco;
		this.valor = valor;	
		
		Servico s = Util.identificaServico(servico);		
		this.servico = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Informações não podem ser vazios.");
		}
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco == null) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		if (endereco.isBlank()) {
			throw new IllegalArgumentException("Informações não podem ser vazios.");
		}
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		this.valor = valor;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		if (endereco == null) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		this.servico = servico;
	}

	@Override
	public String toString() {
		return "Fatura: Nome = " + nome + ", Endereco = " + endereco + ", Valor = " + valor + ", Servico = " + servico;
	}
		
}