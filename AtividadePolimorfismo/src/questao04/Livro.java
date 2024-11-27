package questao04;

import java.util.Objects;

public class Livro extends Produto {
	private String autores;
	private int ISBN;
	private String editora;
	
	public Livro(String nome, String descricao, double preco, String autores, int iSBN, String editora) {
		super(nome, descricao, preco);
		this.autores = autores;
		ISBN = iSBN;
		this.editora = editora;
	}
	
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return super.equals(obj) && ISBN == other.ISBN && Objects.equals(autores, other.autores) && Objects.equals(editora, other.editora);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + getNome() + ", descricao=" + getDescricao() + ", preco=" + getPreco()  + "autores=" + autores + ", ISBN=" + ISBN + ", editora=" + editora + "]";
	}
	
	
	
	
	
}
