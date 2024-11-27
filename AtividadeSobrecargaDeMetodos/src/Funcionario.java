
import java.util.Date;
import java.time.LocalDate;

public class Funcionario {
	private String nome;
	private Date dataAdmissao;
	private double salario;
	private static int num = 0;
	private int identificador = num;
	
	
	Funcionario(){
		num++;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDataAdmissao(Date dataAdmissao) {
		LocalDate dataAtual = LocalDate.now();
		
		if (dataAdmissao.getYear() > dataAtual.getYear())
			System.out.println("Você não pode adicionar"
					+ "uma data do futuro.");
		else
			this.dataAdmissao = dataAdmissao;
	}
	
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public void setSalario(double salario) {
		if (salario >=  1100)
			this.salario = salario;
		else
			System.out.println("Você não pode adicionar um salário"
					+ "inferior a R$1100,00.");
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public int getIdentificar() {
		return this.identificador;
	}
	
	public void tirarFerias(int dias) {
		System.out.println("O Funcionário " + this.nome + " tirará férias de " + dias + " dias.");
	}
	
	public void tirarFerias() {
		tirarFerias(30);
	}
	
}
