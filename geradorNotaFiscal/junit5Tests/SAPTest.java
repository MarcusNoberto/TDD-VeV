package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gerador.Fatura;
import gerador.GeradorNota;
import gerador.NotaFiscal;

class SAPTest {

	@Test
	@DisplayName("Teste para Envio")
	void test() {
		Fatura fatura = new Fatura("Jose", "Rua da Pedra", 100.00, "CONSULTORIA");
		GeradorNota geradorNota = new GeradorNota();
		NotaFiscal nf = geradorNota.gerarNota(fatura);
		assertEquals("enviando pro sap", util.SAP.envia(nf));
	}

}