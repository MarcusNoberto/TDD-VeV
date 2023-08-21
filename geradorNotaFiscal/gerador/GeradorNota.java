package gerador;
import java.util.ArrayList;
import java.util.List;

import util.Util;

public class GeradorNota {

	private static List<NotaFiscal> notas;

	public GeradorNota () {
		this.notas = new ArrayList<NotaFiscal>();
	}
	
	public NotaFiscal gerarNota (Fatura fatura) {
		
		double valorImposto = Util.calculaImposto(fatura.getServico(), fatura.getValor());

		NotaFiscal nf = new NotaFiscal(fatura.getNome(), fatura.getValor(), valorImposto);
		notas.add(nf);
		
		return nf;
	}
	

}