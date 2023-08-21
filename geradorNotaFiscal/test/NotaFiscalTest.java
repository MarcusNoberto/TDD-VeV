package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerador.NotaFiscal;

class NotaFiscalTest {

	NotaFiscal nf1;
	NotaFiscal nf2;
	NotaFiscal nf3;
	
	@BeforeEach
	void testNf1() {
		nf1 = new NotaFiscal("José", 100.00, 25.00);
		nf2 = new NotaFiscal("Maria", 200.00, 30.00);
		nf3 = new NotaFiscal("João", 100.00, 6.00);
	}
	
	@Test
	void testNf2() {
		assertEquals(nf1.toString(), "NotaFiscal: Nome Cliente = José, Valor Nota = 100.0, Valor Imposto = 25.0");
	}	
	
	@Test
	void testNomeCliente1() {
		assertEquals(nf1.getNomeCliente(), "José");
	}
	
	@Test
	void testNomeCliente2() {
		assertNotEquals(nf2.getNomeCliente(), "Mari");
	}
	
	@Test
	void testValorNota1() {
		assertEquals(nf3.getValorNota(), 100.00);
	}
	
	@Test
	void testValorNota2() {
		assertNotEquals(nf2.getValorNota(), 400.00);
	}
	
	@Test
	void testValorImposto1() {
		assertEquals(nf3.getValorImposto(), 6.00);
	}
	
	@Test
	void testValorImposto2() {
		assertNotEquals(nf2.getValorImposto(), 10.00);
	}

	@Test
	void testSetNome() {
		nf1.setNomeCliente("Joaquim");
		assertEquals(nf1.getNomeCliente(), "Joaquim");
	}
	
	@Test
	void testSetValor() {
		nf2.setValorImposto(50.00);
		assertEquals(nf2.getValorImposto(), 50.00);
	}
	
	@Test
	void testVazio() {
		try {
			NotaFiscal nf4 = new NotaFiscal("", 1000, 250);
			fail();
		} catch (IllegalArgumentException iae) {
			assertEquals("Informações não podem ser vazios.", iae.getMessage());
		}
	}

	@Test
	void testNulo() {
		try {
			NotaFiscal nf5 = new NotaFiscal(null, 1000, 250);
			fail();
		} catch (NullPointerException npe) {
			assertEquals("Informações não podem ser nulos.", npe.getMessage());
		}
	}
	
}