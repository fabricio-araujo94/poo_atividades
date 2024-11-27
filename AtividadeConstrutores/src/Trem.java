import java.util.Date;

public class Trem {
	private Vagao vagao[];
	private Locomotiva locomotiva[];
	private String prefixo;
	private Date dataDeFormacao;
	private EstacaoFerroviaria origem;
	private EstacaoFerroviaria destino;
	
	public Trem(Vagao[] vagao, Locomotiva[] locomotiva, String prefixo, Date dataDeFormacao, EstacaoFerroviaria origem,
			EstacaoFerroviaria destino) throws Exception {
		super();
		
		if (vagao.length + locomotiva.length <= 150) {
			this.vagao = vagao;
			this.locomotiva = locomotiva;
		} else {
			throw new Exception("Capacidade máxima ultrapassada");
		}
		
		this.prefixo = prefixo;
		this.dataDeFormacao = dataDeFormacao;
		this.origem = origem;
		this.destino = destino;
	}

	public Vagao[] getVagao() {
		return vagao;
	}

	public Locomotiva[] getLocomotiva() {
		return locomotiva;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public Date getDataDeFormacao() {
		return dataDeFormacao;
	}

	public EstacaoFerroviaria getOrigem() {
		return origem;
	}

	public EstacaoFerroviaria getDestino() {
		return destino;
	}
		
}
