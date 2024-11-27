
public class Ternario {
	public static void main (String[] args) {
		int x = 13, y;
		
		while (true) {
			y = (x % 2 == 0)? x / 2 : 3 * x + 1;
			
			if (y == 1) {
				System.out.println(y);
				break;
			} else {
				System.out.print(y + " - > ");
				x = y;
			}
		}
	}
}
