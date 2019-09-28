package Sistema;

public class Professor {
	String papeis;
		 String DizerNome(String nome) {
			 String Pnome;
			 Pnome=nome;
			 return Pnome;
		}
		 String AprovarOuNao(int nota) {
			if(nota>=6) {
				return "Aprovado";
			}
			else {
				return "reprovado";
			}
		}
}
