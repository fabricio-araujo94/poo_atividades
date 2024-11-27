package questao05;

public abstract class TransporteAereo extends Transporte {

	private int altitudeAtual;
	
	@Override
	public boolean estaParado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public abstract void subir(int metros);
	public abstract void descer(int metros);

}
