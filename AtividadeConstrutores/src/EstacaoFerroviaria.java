
public class EstacaoFerroviaria {
	private String sigla;
	private String descricao;
	private LinhaFerroviaria linha[] = new LinhaFerroviaria[2];
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LinhaFerroviaria[] getLinha() {
		return linha;
	}
	public void setLinha(LinhaFerroviaria[] linha) {
		this.linha = linha;
	}
	
	
}
