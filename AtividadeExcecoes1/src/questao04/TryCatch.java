package questao04;

public class TryCatch {
	static boolean teste = false;
	
	public static void main (String [] args) {
		try {
			ehFalso(false);
		} catch (ExceptionExemplo e) {
			System.out.println("Deu ruim");
		}
	}
	
	public static void ehFalso(boolean v) throws ExceptionExemplo {
		if (v == true) {
			System.out.println("Deu bom");
		} else {
			throw new ExceptionExemplo();
		}
	}
}
