package questao5;

public class Circulo extends ObjetoGeometrico{
	
	public Circulo(double centro, double raio) {
		dado = new double[2];
		dado[0] = centro;
		dado[1] = raio;
		
		area = Math.PI*raio*raio;
		perimetro = 2*Math.PI*raio;
	}
	
}
