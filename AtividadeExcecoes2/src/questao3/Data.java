package questao3;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	
	public Data(int dia, int mes, int ano) throws DataException {
		if((ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 31) ||
				(mes == 1 && dia > 31) ||
				(ano % 4 != 0 && mes == 2 && dia > 28 ) ||
				(ano % 4 == 0 && mes == 2 && dia > 29 ) ||
				(mes == 3 && dia > 31) ||
				(mes == 4 && dia > 30) ||
				(mes == 5 && dia > 31) ||
				(mes == 6 && dia > 30) ||
				(mes == 7 && dia > 31) ||
				(mes == 8 && dia > 31) ||
				(mes == 9 && dia > 30) ||
				(mes == 10 && dia > 31) ||
				(mes == 11 && dia > 30) ||
				(mes == 12 && dia > 31))
			throw new DataException(dia, mes, ano);
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		return "Data: "+dia+"/"+mes+"/"+ano;
	}
}
