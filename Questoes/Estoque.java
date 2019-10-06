package Questoes;

public class Estoque {
	String nome;
	int qtdAtual , qtdMinima;
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome=nome;//Usar o this
		this.qtdAtual=qtdAtual;
		this.qtdMinima=qtdMinima;
	}
	public Estoque() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void SetNovoNome(String nome) {
		this.nome=nome;
	}
	
	public int GetNovaQtdMinima() {
		return qtdMinima;
	}
	public void SetNovaQtdMinima(int novaqtdMinima) {
		qtdMinima=novaqtdMinima;
	}
	void repor(int qtd) {
		qtdAtual=qtdAtual+qtd;
	}
	void darBaixa(int qtd) {
		qtdAtual=qtdAtual-qtd;
	}
	String mostra() {
		return nome+" "+qtdMinima+" "+qtdAtual;
	}
	boolean precisaRepor() {
		if(qtdAtual<=qtdMinima) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Estoque Estoque1=new Estoque("Impressora jato de tinta",13,6);
		Estoque Estoque2=new Estoque("Monitor LCD 17 polegadas",11,13);
		Estoque Estoque3=new Estoque("Mouse Ótico",6,2);
		Estoque1.darBaixa(5);
		Estoque2.repor(7);
		Estoque3.darBaixa(4);
		System.out.println(Estoque1.precisaRepor());
		System.out.println(Estoque2.precisaRepor());
		System.out.println(Estoque3.precisaRepor());
		System.out.println(Estoque1.mostra());
		System.out.println(Estoque2.mostra());
		System.out.println(Estoque3.mostra());
		}
}
