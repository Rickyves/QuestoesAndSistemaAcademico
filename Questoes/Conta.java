package Questoes;

public class Conta {
	String titular,agencia,DataAbertura;
	int numero;
	double saldo;
	double sacar(double valor) {
		saldo=saldo-valor;
		return saldo;
	}
	double deposita(double valor) {
		saldo=saldo+valor;
		return saldo;
	}
	double CalculaRendimento() {
		saldo=saldo*0.1;
		return saldo;
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
