
public class Pessoa {
	protected String nome;
	protected String endereco;
	protected int idade;
	protected String cpf;
	protected char sexo;
	
	public Pessoa(String nome, String endereco, int idade, String cpf, char sexo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public void imprimirValores() {
		System.out.println("NOME: "+nome);
		System.out.println("ENDEREÇO: "+endereco);
		System.out.println("IDADE: "+idade);
		System.out.println("CPF: "+cpf);
		System.out.println("SEXO: "+sexo);
		andar();
	}
	
	public void andar() {
		System.out.println(nome+" pode andar.");
	}
}
