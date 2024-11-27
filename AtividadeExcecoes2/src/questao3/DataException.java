package questao3;

public class DataException extends Exception {
	protected int dia;
	protected int mes;
	protected int ano;
	
	public DataException(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		return "A data inválida é "+dia+"/"+mes+"/"+ano;
	}
	
}
