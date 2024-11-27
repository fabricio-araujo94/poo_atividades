
public class Relogio {
	private int hora;
	private int min;
	private int seg;
	
	public void inicializar(int hora, int min, int seg) {
		if (hora > 24) hora = 1;
		if (min > 60) min = 1;
		if (seg > 60) seg = 1;
		
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public void inicializar(int hora, int min) {
		if (hora > 24) hora = 1;
		if (min > 60) min = 1;
		
		this.hora = hora;
		this.min = min;
		this.seg = 1;
	}
	
	public void inicializar(int hora) {
		if (hora > 24) hora = 1;
		
		this.hora = hora;
		this.min = 1;
		this.seg = 1;
	}
	
	public void mostrarHorario() {
		System.out.println(String.format("Horário: %d:%d:%d", this.hora, this.min, this.seg));
	}
	
}
