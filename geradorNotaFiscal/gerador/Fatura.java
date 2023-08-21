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

		
}