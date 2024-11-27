package questao05;

public abstract class TransporteTerrestre extends Transporte {

	private String tipo;
	
	@Override
	public boolean estaParado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public abstract void estacionar();

}
