package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gerador.Servico;

@DisplayName("Teste para a classe Util")
class UtilTest {

	@Test
	void testConsultoria() {	
		assertEquals(200.0, util.Util.calculaImposto(Servico.CONSULTORIA, 800.0));
	}
	
	@Test
	void testTreinamento() {	
		assertEquals(150.0, util.Util.calculaImposto(Servico.TREINAMENTO, 1000.0));
	}
	
	@Test
	void testOutros() {	
		assertEquals(60.0, util.Util.calculaImposto(Servico.OUTROS, 1000.0));
	}
	
	@Test
	void testIdentifica1() {	
		assertEquals(Servico.CONSULTORIA, util.Util.identificaServico("CONSULTORIA"));
	}
	
	@Test
	void testIdentifica2() {
		assertEquals(Servico.TREINAMENTO, util.Util.identificaServico("TREINAMENTO"));
	}
	
	@Test
	void testIdentifica3() {	
		assertEquals(Servico.OUTROS, util.Util.identificaServico("outros"));
	}

}