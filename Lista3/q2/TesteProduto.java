package ATV3;

public class TesteProduto {
	public static void main(String[] args) {
		Produto pro=new Produto();
		pro.setPrecoCusto(20);
		pro.setPrecoVenda(30);
		pro.calcularMargemLucro();
		pro.getMargemLucroPorcentagem();
	}
}
