package questao05;

public class Cadastro {
	private String nomeCompleto;
	private String telefone;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) throws NomeNulo{
		if (nomeCompleto.isEmpty()) {
			throw new NomeNulo();
		} else {
			this.nomeCompleto = nomeCompleto;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws DddErrado, NumeroErrado {
		if(this.telefone == null) {
			if(telefone.length() == 2 && isInteger(telefone))
				this.telefone = telefone;
			else
				throw new DddErrado();
		} else {
			if((telefone.length() == 8 || telefone.length() == 9) && isInteger(telefone)) {
				this.telefone = this.telefone.concat(telefone);
			}
			else
				throw new NumeroErrado();
		}
	}
	
	private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
