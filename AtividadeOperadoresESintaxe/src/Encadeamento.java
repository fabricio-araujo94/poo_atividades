
public class Encadeamento {
	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 1; i < n; i++) {
			System.out.println();
			for(int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
		}
	}
	
}
