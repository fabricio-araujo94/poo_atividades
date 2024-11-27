
public class Paciente extends Pessoa{
	private String doenca;
	private String medicacao;

	public Paciente(String nome, String endereco, int idade, String cpf, char sexo, String doenca, String medicacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.doenca = doenca;
		this.medicacao = medicacao;
	}
	
	public void imprimirValores() {
		System.out.println("NOME: "+nome);
		System.out.println("ENDEREÇO: "+endereco);
		System.out.println("IDADE: "+idade);
		System.out.println("CPF: "+cpf);
		System.out.println("SEXO: "+sexo);
		andar();
		dor();
		alta();
	}
	
	public void dor() {
		System.out.println(nome+" sente dor.");
	}
	
	public void alta() {
		System.out.println(nome+" recebeu alta.");
	}
	

}
