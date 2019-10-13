package ATV3;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 =new Conta("Claudio",2947,100);
		Conta c2 =new Conta("Pedro",6553,4000);
		c1.saca(2500);
		c1.deposita(300);
		c2.saca(1000);
		c1.getSaldo();
		c2.getSaldo();
		c1.transferir(c2, c1, 2000);
		c1.transferir(c1, c2, 2500);
		c1.imprimir();
		c2.imprimir();
		c1.setNome("Claudio Lima");
		c1.imprimir();
	}
}
