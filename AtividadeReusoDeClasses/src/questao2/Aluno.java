package questao2;

public class Aluno extends Pessoa {
	double matricula;
	
	public void andar() {
		System.out.println(nome + " está andando cansado.");
	}
	
	public void andar(int min) {
		System.out.println(nome + " está andando cansado por " + min + " minutos.");
	}
	
	public static void main(String[] args) {
		Aluno p1 = new Aluno();
		
		p1.nome = "Carlos";
		p1.andar();
	}
}
