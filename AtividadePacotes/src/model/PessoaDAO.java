package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaDAO {

	public static void salvar(Pessoa p) throws IOException {

		try {
			PrintWriter outFile = new PrintWriter("arquivo.txt");
			outFile.println(p.getNome());
			outFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao criar e escrever no arquivo.");
		}
		
	}

}
