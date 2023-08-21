package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}