package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import gerador.GeradorNota;
import gerador.Servico;
import util.Util;

@DisplayName("Teste Técnica Tabelas de Decisão")
class TabelasDeDecisão {

	@BeforeEach
	void testTabelaDecisao() {
		new GeradorNota();
	}
	
	@Test
	@Order(1)
	void test1TipoConsultoria() {
		String tipoServico = "CONSULTORIA";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(25, valorImposto);
	}
	
	@Test
	@Order(2)
	void test2TipoTreinamento() {
		String tipoServico = "TREINAMENTO";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(15, valorImposto);
	}
	
	@Test
	@Order(3)
	void test3TipoOutros() {
		String tipoServico = "OUTROS";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertEquals(6, valorImposto);
	}
	
	@Test
	@Order(4)
	void test4TipoOutros() {
		String tipoServico = "OUTROS";
		Servico servico = Util.identificaServico(tipoServico);
		double valorImposto = Util.calculaImposto(servico, 100.00);

		assertNotEquals(7, valorImposto);
	}

}
