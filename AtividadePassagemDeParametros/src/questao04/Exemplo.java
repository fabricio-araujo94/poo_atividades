package questao04;

public class Exemplo {
	
	public static void main(String[] args) {
		somatorio(1, 5, 7, 2);
		somatorio(1, 5, 7);
		somatorio(1, 5);
		somatorio();
	}
	
	public static void somatorio(int...nums) {
		int soma = 0;
		
		for(int num: nums)
			soma += num;
		
		System.out.println("Soma: "+soma);
	}
}
