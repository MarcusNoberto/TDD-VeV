package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gerador.Fatura;
import gerador.GeradorNota;
import gerador.NotaFiscal;

@DisplayName("Testando com Tecnica de Analise de Valores Limites")
class AnaliseValoresLimites {

	private GeradorNota geradorNota;
	private NotaFiscal nf;
	
	@BeforeEach
	void testAnaliseValoresLimites() {
		geradorNota = new GeradorNota();
	}
	
	@Test
	@DisplayName("Testando exceção")
	void test1ValorNegativo() {
		try {
			Fatura fatura = new Fatura("José", "Rua da Pedra", -1, "CONSULTORIA");
			fail();
		} catch (NullPointerException npe) {
			assertEquals("Informações não podem ser nulos.", npe.getMessage());
		}
		
	}
	
	@Test
	@DisplayName("Testando exceção")
	void test1ValorZero() {
		try {
			Fatura fatura = new Fatura("José", "Rua da Pedra", 0, "CONSULTORIA");
			fail();
		} catch (NullPointerException npe) {
			assertEquals("Informações não podem ser nulos.", npe.getMessage());
		}
		
	}

	@Test
	void test3ValorUm() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 1, "CONSULTORIA");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(0.25, nf.getValorImposto());	
	}
	
	@Test
	void test4tipoServico() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100, "CONSULTORIA");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(25, nf.getValorImposto());
	}

	@Test
	void test5tipoServico() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100, "TREINAMENTO");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(15, nf.getValorImposto());
	}
	
	
	@Test
	void test6tipoServico() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100, "OUTROS");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(6, nf.getValorImposto());
	}
	
}
