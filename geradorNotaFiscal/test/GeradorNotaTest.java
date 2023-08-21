package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerador.Fatura;
import gerador.GeradorNota;
import gerador.NotaFiscal;
import gerador.Servico;

class GeradorNotaTest {

	private GeradorNota geradorNota;
	private Fatura fatura;
	private NotaFiscal nf;
	
	@BeforeEach
	void testGeraNotaFiscal() {
		geradorNota = new GeradorNota();
		fatura = new Fatura("José", "Rua da Pedra", 100.00, "CONSULTORIA");
		nf = geradorNota.gerarNota(fatura);
	}

    @Test
	void testNomeCliente() {	
		assertEquals("José", nf.getNomeCliente());
	}

	@Test
	void testValorImposto() {	
		assertEquals(25.0, nf.getValorImposto());
	}
	
	@Test
	void testValorImposto2() {
		fatura.setServico(Servico.TREINAMENTO);
		nf = geradorNota.gerarNota(fatura);
		assertEquals(15.0, nf.getValorImposto());
	}
	
	@Test
	void testValorNota() {	
		assertEquals(100.0, nf.getValorNota());
	}
	
}