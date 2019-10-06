package Questoes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuadradoTeste {
	Quadrado qua=new Quadrado(5);
	@Test
public void TesteArea() {
		qua.SetArea(5);
	assertTrue(qua.GetArea()==25);
}
	public void TestePerimetro() {
		qua.SetArea(5);
	assertTrue(qua.GetPerimetro()==20);
}
}
