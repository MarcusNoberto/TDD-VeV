package gerador;

public class NotaFiscal {

	String nomeCliente;
	double valorNota;
	double valorImposto;
	
	public NotaFiscal (String nomeCliente, double valorNota, double valorImposto) {
		
		if (nomeCliente == null || valorNota <= 0 || valorImposto <= 0) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		if (nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Informações não podem ser vazios.");
		}
		
		this.nomeCliente = nomeCliente;
		this.valorNota = valorNota;
		this.valorImposto = valorImposto;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente == null) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		if (nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Informações não podem ser vazios.");
		}
		
		this.nomeCliente = nomeCliente;
	}
	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		if (valorNota <= 0) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		
		this.valorNota = valorNota;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		if (valorNota <= 0) {
			throw new NullPointerException("Informações não podem ser nulos.");
		}
		
		this.valorImposto = valorImposto;
	}

	@Override
	public String toString() {
		return "NotaFiscal: Nome Cliente = " + nomeCliente + ", Valor Nota = " + valorNota + ", Valor Imposto = " + valorImposto;
	}		
		
}