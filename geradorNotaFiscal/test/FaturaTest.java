package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerador.Fatura;
import gerador.Servico;

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
	
	@Test
	void testEndereco1() {
		assertEquals(f3.getEndereco(), "Rua do Sol");
	}
	
	@Test
	void testEndereco2() {
		assertNotEquals(f2.getEndereco(), "Rua da Area");
	}
	
	@Test
	void testValor1() {
		assertEquals(f3.getValor(), 100.00);
	}
	
	@Test
	void testValor2() {
		assertNotEquals(f2.getValor(), 100.00);
	}
	
	@Test
	void testServico1() {
		assertEquals(f1.getServico(), Servico.CONSULTORIA);
	}
	
	@Test
	void testServico2() {
		assertNotEquals(f2.getValor(), Servico.OUTROS);
	}
	
	@Test
	void testFatura2() {
		assertEquals(f1.toString(), "Fatura: Nome = José, Endereco = Rua da Pedra, Valor = 100.0, Servico = CONSULTORIA");
	}
	
	@Test
	void testSetNome() {
		f1.setNome("Joaquim");
		assertEquals(f1.getNome(), "Joaquim");
	}
	
	@Test
	void testSetValor() {
		f2.setValor(500.00);
		assertNotEquals(f2.getValor(), 200.00);
	}
	
	@Test
	void testVazio() {
		try {
			Fatura f4 = new Fatura("Joana", "Rua R", 100.00,"");
			fail();
		} catch (IllegalArgumentException iae) {
			assertEquals("Informações não podem ser vazios.", iae.getMessage());
		}
	}

	@Test
	void testNulo() {
		try {
			Fatura f4 = new Fatura(null, "Rua R", 100.00,"CONSULTORIA");
			fail();
		} catch (NullPointerException npe) {
			assertEquals("Informações não podem ser nulos.", npe.getMessage());
		}
	}
}