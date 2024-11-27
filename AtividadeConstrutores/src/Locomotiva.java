
public class Locomotiva {
	private int numeroDeSerie;
	private double capacidadeDeTracao;
	private double comprimento;
	
	Locomotiva(){
		
	}

	public Locomotiva(int numeroDeSerie, double capacidadeDeTracao, double comprimento) {
		super();
		this.numeroDeSerie = numeroDeSerie;
		this.capacidadeDeTracao = capacidadeDeTracao;
		this.comprimento = comprimento;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public double getCapacidadeDeTracao() {
		return capacidadeDeTracao;
	}

	public void setCapacidadeDeTracao(double capacidadeDeTracao) {
		this.capacidadeDeTracao = capacidadeDeTracao;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
}
