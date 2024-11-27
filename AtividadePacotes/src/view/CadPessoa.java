package view;

import java.util.Scanner;
import controller.CtrlPessoa;
import model.Pessoa;

public class CadPessoa {
	
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine();
		
		Pessoa pessoa = new Pessoa(nome);
		
		CtrlPessoa ctrlPessoa = new CtrlPessoa();
		
		ctrlPessoa.salvar(pessoa);
		
		entrada.close();
	}

}
