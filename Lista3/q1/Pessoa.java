package ATV3;

public class Pessoa {
private String nome;
private int idade;
 private double peso;
private double altura;
private double IMC;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}

public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double imc() {
	 double IMC=peso/(altura*altura);
	return IMC;
}
public String imprimir() {
	return nome+idade+peso+altura+IMC;
}
}
