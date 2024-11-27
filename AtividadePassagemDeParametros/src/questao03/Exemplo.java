package questao03;

public class Exemplo {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Jones");
		
		System.out.println(p.nome);
		mudarNome(p);
		System.out.println(p.nome);
	}
	
	public static void mudarNome(Pessoa p) {
		p.nome = "Zeca";
	}
}
