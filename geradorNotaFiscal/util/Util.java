package util;

import gerador.Servico;

public class Util {

	public static double calculaImposto (Servico servico, Double valorNota) {		
		double valorImposto;
		
		if (servico == Servico.CONSULTORIA) {
			valorImposto = valorNota * 0.25;
		} else if (servico == Servico.TREINAMENTO) {
			valorImposto = valorNota * 0.15;
		} else {
			valorImposto = valorNota * 0.06;
		}
		
		return valorImposto;
	}
	
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