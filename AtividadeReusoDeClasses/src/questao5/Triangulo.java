package questao5;

public class Triangulo extends ObjetoGeometrico {

	public Triangulo(double a, double b, double c) {
		dado = new double[3];
		dado[0] = a;
		dado[1] = b;
		dado[2] = c;
		
		perimetro = a+b+c;
		
		double s = perimetro/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
}
