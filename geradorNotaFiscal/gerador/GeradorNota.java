package gerador;
import java.util.ArrayList;
import java.util.List;

import util.NotaFiscalDao;
import util.SAP;
import util.Smtp;
import util.Util;

public class GeradorNota {

	private static List<NotaFiscal> notas;
	
	public GeradorNota () {
		this.notas = new ArrayList<NotaFiscal>();
	}
	
	public NotaFiscal gerarNota (Fatura fatura) {	
		double valorImposto = Util.calculaImposto(fatura.getServico(), fatura.getValor());

		NotaFiscal nf = new NotaFiscal(fatura.getNome(), fatura.getValor(), valorImposto);
		salva(nf);
		enviaSap(nf);
		enviaEmail(nf);
		notas.add(nf);
		
		return nf;
	}
	
	public String salva(NotaFiscal nf) { 
		
		return NotaFiscalDao.salva(nf);
	}

	public String enviaSap(NotaFiscal nf) { 
		return SAP.envia(nf);
	}
	
	public String enviaEmail(NotaFiscal nf) { 
		return Smtp.envia(nf);
	}

}