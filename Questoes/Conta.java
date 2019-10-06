package Questoes;

public class Conta {
	String titular,agencia,DataAbertura;
	int numero;
	double saldo;
	public double getSaldoNovo() {
		return saldo;
	}
	public void setSaque(double valor) {
		saldo=saldo-valor;
	}
	public void setDeposito(double valor) {
		saldo=saldo+valor;
	}
	public void CalculaRendimento() {
		saldo=saldo+(saldo*0.1);
	}
	String recuperaDadosParaImpressao(){
		return titular+" "+agencia+" "+numero+" "+DataAbertura+" "+saldo;
	}
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular="Claudio";
		c1.agencia="BB";
		c1.numero=5843643;
		c1.DataAbertura="26/06/2015";
		c1.saldo=1054;
		System.out.println(c1.recuperaDadosParaImpressao());
		}
}
