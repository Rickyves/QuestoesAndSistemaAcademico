package ATV3;

public class Teste {
	public static void main(String[] args) {
		Pessoa pess=new Pessoa();
		pess.setNome("Claudio");
		pess.setIdade(20);
		pess.setAltura(1.60);
		pess.setPeso(48);
		System.out.println(pess.getNome());
		System.out.println(pess.getIdade());
		System.out.println(pess.getAltura());
		System.out.println(pess.getPeso());
		pess.imc();
		pess.imprimir();
		
	}
}
