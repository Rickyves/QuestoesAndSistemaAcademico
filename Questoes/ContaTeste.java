package Questoes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContaTeste {
Conta nv =new Conta();
@Test
public void TesteSacar() {
	nv.saldo=500;
	double SaldoAntigo=nv.saldo;
nv.setSaque(50);
assertTrue("Dinheiro sacado com sucesso",nv.getSaldoNovo()<=SaldoAntigo);
assertFalse("Impossível realizar a operação",nv.getSaldoNovo()>=SaldoAntigo||nv.getSaldoNovo()<0);
}
@Test
public void TesteDepositar() {
	nv.saldo=500;
	double SaldoAntigo=nv.saldo;
	nv.setDeposito(100);
	assertTrue("Dinheiro sacado com sucesso",nv.getSaldoNovo()>SaldoAntigo);
	assertFalse("Impossível realizar a operação",nv.getSaldoNovo()==SaldoAntigo||nv.getSaldoNovo()<SaldoAntigo);
}
@Test
public void TesteRendimento() {
	nv.saldo=500;
	double SaldoAntigo=nv.saldo;
	nv.CalculaRendimento();
	assertTrue("Dinheiro sacado com sucesso",nv.getSaldoNovo()==(SaldoAntigo*0.1)+SaldoAntigo);
	assertFalse("Impossível realizar a operação",nv.getSaldoNovo()<=SaldoAntigo);
}
}
