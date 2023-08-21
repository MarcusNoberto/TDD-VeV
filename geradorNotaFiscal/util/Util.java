package util;

import gerador.Servico;

public class Util {
	
	public static Servico identificaServico(String nomeServico) {
		Servico servico = null;
		if (nomeServico.toUpperCase() == "CONSULTORIA") {
			servico = Servico.CONSULTORIA;
		} else if (nomeServico.toUpperCase() == "TREINAMENTO") {
			servico = Servico.TREINAMENTO;
		} else {
			servico = Servico.OUTROS;
		}
		
		return servico;
	}
	
}