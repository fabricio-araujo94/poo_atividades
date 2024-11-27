package questao05;

public class Teste extends Pessoa {

	public Teste(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Meu nome é "+nome+" e tenho "+idade+" anos.";
	}

	@Override
	public void andar() {
		System.out.println(nome+" anda.");
	}

}
