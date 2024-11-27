
public class Vagao {
	private int numeroDeSerie;
	private String tipo;
	private double capacidadeDeCarga;
	private double comprimentoEntreTesteiras;
	private double comprimentosDosEngates;
	
	Vagao(){
		
	}

	public Vagao(int numeroDeSerie, String tipo, double capacidadeDeCarga, double comprimentoEntreTesteiras,
			double comprimentosDosEngates) {
		super();
		this.numeroDeSerie = numeroDeSerie;
		this.tipo = tipo;
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.comprimentoEntreTesteiras = comprimentoEntreTesteiras;
		this.comprimentosDosEngates = comprimentosDosEngates;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public double getComprimentoEntreTesteiras() {
		return comprimentoEntreTesteiras;
	}

	public void setComprimentoEntreTesteiras(double comprimentoEntreTesteiras) {
		this.comprimentoEntreTesteiras = comprimentoEntreTesteiras;
	}

	public double getComprimentosDosEngates() {
		return comprimentosDosEngates;
	}

	public void setComprimentosDosEngates(double comprimentosDosEngates) {
		this.comprimentosDosEngates = comprimentosDosEngates;
	}
	
	
	
	
}
