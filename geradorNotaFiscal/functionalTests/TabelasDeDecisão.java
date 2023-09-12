package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerador.GeradorNota;
import gerador.Servico;
import util.Util;

class TabelasDeDecisão {

	@BeforeEach
	void testTabelaDecisao() {
		new GeradorNota();
	}
	
	@Test
	void test1TipoConsultoria() {
		String tipoServico = "CONSULTORIA";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(25, valorImposto);
	}
	
	@Test
	void test2TipoTreinamento() {
		String tipoServico = "TREINAMENTO";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(15, valorImposto);
	}
	
	@Test
	void test5TipoOutros() {
		String tipoServico = "OUTROS";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(6, valorImposto);
	}

}
