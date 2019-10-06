package Questoes;

public class Lampada {
	boolean ligada;
	 public void Setliga() {
		ligada=true;
	}
	public void Setdesliga() {
		ligada=false;
	}
	public String GetObserva() {
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
		lampa1.Setliga();
		lampa2.Setdesliga();
		System.out.println(lampa1.GetObserva());
		System.out.println(lampa2.GetObserva());
		}
}
