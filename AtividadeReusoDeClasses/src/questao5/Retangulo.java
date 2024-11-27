package questao5;

public class Retangulo extends ObjetoGeometrico {
	
	public Retangulo(double base, double altura) {
		dado = new double[2];
		dado[0] = base;
		dado[1] = altura;
		
		area = base*altura;
		perimetro = 2*base+2*altura;
	}
	
}
