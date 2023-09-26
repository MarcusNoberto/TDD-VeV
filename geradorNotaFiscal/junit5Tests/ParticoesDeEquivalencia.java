package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gerador.Fatura;
import gerador.GeradorNota;
import gerador.NotaFiscal;

@DisplayName("Teste com tecnica Partições de Equivalência")
class ParticoesDeEquivalencia {

	private GeradorNota geradorNota;
	private NotaFiscal nf;
	
	@BeforeEach
	void testParticoesEquivalencia() {
		geradorNota = new GeradorNota();
	}
	
	@Test
	void test1TipoConsultoria() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100, "CONSULTORIA");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(25, nf.getValorImposto());
	}
	
	@Test
	void test2TipoTreinamento() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100, "TREINAMENTO");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(15, nf.getValorImposto());
	}
	
	@Test
	void test3TipoOutros() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 200, "VISTORIA");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(12, nf.getValorImposto());
	}
	
	@Test
	void test4TipoOutros() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 300, "FISCALIZACAO");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(18, nf.getValorImposto());
	}
	
	@Test
	void test5TipoOutros() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 400, "OUTROS");
		nf = geradorNota.gerarNota(fatura);
		assertEquals(24, nf.getValorImposto());
	}


}
