package questao5;

public class Teste {
	public static void main(String[] args) {
		Circulo a = new Circulo(5, 5);
		Retangulo b = new Retangulo(3, 4);
		Triangulo c = new Triangulo(3, 4, 5);
		
		System.out.println(a.getArea());
		System.out.println(a.getPerimetro());
		
		System.out.println(b.getArea());
		System.out.println(b.getPerimetro());
		
		System.out.println(c.getArea());
		System.out.println(c.getPerimetro());
		
	}
}
