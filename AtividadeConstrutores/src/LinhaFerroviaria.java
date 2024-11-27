
public class LinhaFerroviaria {
	private int id = count;
	private double extensao;
	private String descricao;
	private static int count = 1;

	LinhaFerroviaria() {
		LinhaFerroviaria.count++;
	}
	
	public int getId() {
		return id;
	}

	public double getExtensao() {
		return extensao;
	}
	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
