package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("Teste para Gerador de Nota Fiscal")
	void testGeraNotaFiscal() {
		geradorNota = new GeradorNota();
		fatura = new Fatura("Jose", "Rua da Pedra", 100.00, "CONSULTORIA");
		nf = geradorNota.gerarNota(fatura);
	}

    @Test
	void testNomeCliente() {	
		assertEquals("Jose", nf.getNomeCliente());
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
	
	@Test
	void testSalva() {
		String testeSalva = geradorNota.salva(nf);
		assertEquals("salvando no banco", testeSalva);
	}
	
	@Test
	void testEnviaSap() {
		String testeEnviaSap = geradorNota.enviaSap(nf);
		assertEquals("enviando pro sap", testeEnviaSap);
	}
	
	@Test
	void testEnviaEmail() {
		String testeEnviaEmail = geradorNota.enviaEmail(nf);
		assertEquals("enviando por email", testeEnviaEmail);
	}

}