
public class Fatorial {
	public static void main(String[] args) {
		int fatorial;
		
		for(int i = 1; i <= 10; i++) {
			fatorial = 1;
			
			for(int j = i; j >= 1; j--) {
				fatorial *= j;
			}
			
			System.out.println("Fatorial de " + i + " é " + fatorial + ".");
		}

	}
}
