package questao2;

public class Pessoa {
	String nome;
	String cpf;
	
	public void andar() {
		System.out.println(nome + " está andando.");
	}
	
	public void andar(int min) {
		System.out.println(nome + " está andando por " + min + " minutos.");
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Álvaro";
		p1.andar();
		p1.andar(4);
	}
}
