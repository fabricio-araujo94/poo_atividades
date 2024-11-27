import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int x;
		int anterior1 = 1, anterior2 = 0, atual;
		
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			if(i == 0) {
				System.out.print("0 ");
				continue;
			} else if(i == 1) {
				System.out.print("1 ");
				continue;
			} else {
				atual = anterior1 + anterior2;
				anterior2 = anterior1;
				anterior1 = atual;
				
				System.out.print(atual + " ");
			}	
		}
	}
}
