package Questoes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EstoqueTest {
	Estoque esto = new Estoque();
	@Test
	public void testGetNome() {
		esto.setNome("CLAUDIO");
		assertTrue("Deveria ser igual a CLAUDIO", esto.getNome().equals("CLAUDIO"));
	}
	public void TesteNovoNome() {
		String AntigoNome=esto.nome;
		esto.setNome("Ricky");
		assertFalse("Nome n�o mudado", esto.getNome()==AntigoNome);	
	}
	
	
}
