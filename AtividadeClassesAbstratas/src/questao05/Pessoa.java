package questao05;

public abstract class Pessoa {
	
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract String toString();
	public abstract void andar();
	
}
