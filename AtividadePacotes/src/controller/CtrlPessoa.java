package controller;

import model.*;

public class CtrlPessoa {
	
	public void salvar(Pessoa p) throws Exception {
		if(p.getNome() == null || p.getNome().isEmpty())
			throw new Exception("Não é possível salvar uma pessoa com nome nulo ou vazio.");
		else {
			System.out.println(p.getNome());
			PessoaDAO.salvar(p);}
	}
	
}
