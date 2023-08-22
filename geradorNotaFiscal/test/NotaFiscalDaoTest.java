package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gerador.Fatura;
import gerador.GeradorNota;
import gerador.NotaFiscal;

class NotaFiscalDaoTest {
	
	@Test
	void test() {
		Fatura fatura = new Fatura("José", "Rua da Pedra", 100.00, "CONSULTORIA");
		GeradorNota geradorNota = new GeradorNota();
		NotaFiscal nf = geradorNota.gerarNota(fatura);
		assertEquals("salvando no banco", util.NotaFiscalDao.salva(nf));
	}

}