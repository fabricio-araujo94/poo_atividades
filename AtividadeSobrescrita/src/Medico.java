
public class Medico extends Pessoa{
	private String crm;
	private double salario;
	private String especializacao;
	
	public Medico(String nome, String endereco, int idade, String cpf, char sexo, String crm, double salario,
			String especializacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.crm = crm;
		this.salario = salario;
		this.especializacao = especializacao;
	}
	
	public void imprimirValores() {
		System.out.println("NOME: "+nome);
		System.out.println("ENDEREÇO: "+endereco);
		System.out.println("IDADE: "+idade);
		System.out.println("CPF: "+cpf);
		System.out.println("SEXO: "+sexo);
		andar();
		plantao();
	}
	
	public void plantao() {
		System.out.println(nome+" deu plantão.");
	}
	
	
}
