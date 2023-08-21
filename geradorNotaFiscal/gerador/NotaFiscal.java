package gerador;

public class NotaFiscal {

	String nomeCliente;
	double valorNota;
	double valorImposto;
	
	public NotaFiscal (String nomeCliente, double valorNota, double valorImposto) {
		
		this.nomeCliente = nomeCliente;
		this.valorNota = valorNota;
		this.valorImposto = valorImposto;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {		
		this.nomeCliente = nomeCliente;
	}
		
		
}