package Questoes;

public class Quadrado {
	double lado;
	double Area;
	double Perimetro;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	public double GetLado() {
		return lado;
	}
	public void SetLado(double lado) {
		this.lado=lado;
	}
	public double GetArea() {
		return Area;
	}
	public void SetArea(double Area) {
		this.Area=Area*Area;
	}
	public double GetPerimetro() {
		return Perimetro;
	}
	public void SetPerimetro(double Perimetro) {
		this.Perimetro=4*Perimetro;
	}
	public static void main(String[] args) {
		Quadrado q1=new Quadrado(2);
		Quadrado q2=new Quadrado(4);
		Quadrado q3=new Quadrado(5);
		System.out.println(q1.GetArea());
		System.out.println(q1.GetPerimetro());
		System.out.println(q2.GetArea());
		System.out.println(q2.GetPerimetro());
		System.out.println(q3.GetArea());
		System.out.println(q3.GetPerimetro());
		}
}

