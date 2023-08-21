package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaturaTest {

	Fatura f1;
	Fatura f2;
	Fatura f3;
	
	@BeforeEach
	void testFatura() {
		f1 = new Fatura("José", "Rua da Pedra", 100.00, "CONSULTORIA");
		f2 = new Fatura("Maria", "Rua da Areia", 200.00, "TREINAMENTO");
		f3 = new Fatura("João", "Rua do Sol", 100.00, "TESTE");
	}
	
	@Test
	void testNomeCliente1() {
		assertEquals(f1.getNome(), "José");
	}
	
	@Test
	void testNomeCliente2() {
		assertNotEquals(f2.getNome(), "Mari");
	}