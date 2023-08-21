package gerador;

public class Fatura {

	private String nome;
	private String endereco;
	private double valor;
	private Servico servico;
	
	public Fatura (String nome, String endereco, double valor, String servico) {
		
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
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

		
}