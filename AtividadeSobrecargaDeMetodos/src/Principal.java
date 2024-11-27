
import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		f1.setNome("Claudio");
		Date d1 = sdf.parse("10/02/2015"); 
		f1.setDataAdmissao(d1);
		f1.setSalario(2500);
		
		f2.setNome("Vitória");
		Date d2 = sdf.parse("04/09/2017"); 
		f2.setDataAdmissao(d2);
		f2.setSalario(5000);
		
		f3.setNome("Vicente");
		Date d3 = sdf.parse("09/01/2020"); 
		f3.setDataAdmissao(d3);
		f3.setSalario(3850);
		
	}
}
