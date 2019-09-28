package Sistema;

public class Main {
		public static void main(String[] args) {
			Aluno ME=new Aluno();
			Disciplina Programacao=new Disciplina();
			Professor professor=new Professor();
			System.out.println(ME.MeuNome("Claudio")+" "+ME.matricula(1234)+"\nDeseja se cadastrar em:\n"+Programacao.Nome("Programacao ")+Programacao.CargaHoraria(50)+"\n"+professor.DizerNome("Erick"));
			//ME.tirarfoto();
			//System.out.println(professor.AprovarOuNao(7));
			}
		}
