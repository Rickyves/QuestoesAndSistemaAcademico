package Questoes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LampadaTeste {
	Lampada lamp=new Lampada();
	@Test
	public void TesteDesligada() {
		lamp.Setdesliga();
		assertTrue("Dinheiro sacado com sucesso",lamp.ligada==false);
	}
	public void TesteLigada() {
		lamp.Setliga();
		assertTrue("Dinheiro sacado com sucesso",lamp.ligada==true);
	}
}
