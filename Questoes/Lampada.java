package Questoes;

public class Lampada {
	boolean ligada;
	void liga() {
		ligada=true;
	}
	void desligada() {
		ligada=false;
	}
	String observa() {
		if(ligada=true) {
			return "Ligada";
		}
		else {
			return "Desligada";
		}
	}
	public static void main(String[] args) {
		Lampada lampa1=new Lampada();
		Lampada lampa2=new Lampada();
		lampa1.liga();
		lampa2.desligada();
		System.out.println(lampa1.observa());
		System.out.println(lampa2.observa());
		}
}
