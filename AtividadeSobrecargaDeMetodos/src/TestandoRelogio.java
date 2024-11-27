
public class TestandoRelogio {
	public static void main(String[] args) {
		Relogio r1 = new Relogio();
		Relogio r2 = new Relogio();
		Relogio r3 = new Relogio();
		
		r1.inicializar(24, 8, 23);
		r1.mostrarHorario();
		
		r2.inicializar(12, 4);
		r2.mostrarHorario();
		
		r3.inicializar(13);
		r3.mostrarHorario();
	}
}
