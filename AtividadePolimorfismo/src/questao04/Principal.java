package questao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		List<Produto> produto = new ArrayList<Produto>();
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Cadastrar livro");
			System.out.println("4 - Lista livros");
			System.out.println("5 - Imprimir tudo");
			System.out.println("6 - Sair");
			System.out.print("\nEscolha: ");
			int escolha = entrada.nextInt();
			
			switch(escolha) {
			case 1:
				cadastrarProduto(produto);
				break;
			case 2:
				exibirProdutos(produto);
				break;
			case 3:
				cadastrarLivro(produto);
				break;
			case 4:
				exibirLivros(produto);
				break;
			case 5:
				exibirProdutos(produto);
				break;
			}
			
			if(escolha == 6)
				break;
			
		}
		
		entrada.close();
	}
	
	public static void cadastrarProduto(List<Produto> produto) {
		String nome = null;
		String descricao = null;
		double preco = 0;
		
		int i = 1;
		
		while (i <= 3) {
			Scanner entrada = new Scanner(System.in);
			
			switch(i) {	
				case 1: 
					System.out.print("\nNome: ");
					nome = entrada.nextLine();
					break;
				
				case 2:
					System.out.print("\nDescrição: ");
					descricao = entrada.nextLine();
					break;
				
				case 3:
					System.out.print("\nPreço: ");
					preco = entrada.nextDouble();
			}
			
			i++;
		}
		
		produto.add(new Produto(nome, descricao, preco));
	}
	
	public static void exibirProdutos(List<Produto> produto) {
		System.out.println("");
		
		for(Produto p: produto) 
			System.out.println(p.toString());
		
		System.out.println("");
	}
	
	public static void cadastrarLivro(List<Produto> produto) {
		String nome = null;
		String descricao = null;
		double preco = 0;
		String autores = null;
		int ISBN = 0;
		String editora = null;
		
		int i = 1;
		
		while(i <= 6) {
			Scanner entrada = new Scanner(System.in);
			
			switch(i) {
				case 1:
					System.out.print("\nNome: ");
					nome = entrada.nextLine();
					break;
				
				case 2:
					System.out.print("\nDescrição: ");
					descricao = entrada.nextLine();
					break;
					
				case 3:
					System.out.print("\nPreço: ");
					preco = entrada.nextDouble();
					break;
					
				case 4:
					System.out.print("\nAutores: ");
					autores = entrada.nextLine();
					break;
					
				case 5:
					System.out.print("\nISBN: ");
					ISBN = entrada.nextInt();
					break;
					
				case 6:
					System.out.print("\nEditora: ");
					editora = entrada.nextLine();
					break;
			}
			
			i++;
		}
		
		produto.add(new Livro(nome, descricao, preco, autores, ISBN, editora));
		
	}
	
	public static void exibirLivros(List<Produto> produto) {
		System.out.println("");
		
		for(Produto p: produto)
			if(p instanceof Livro)
				System.out.println(p.toString());
		
		System.out.println("");
	}
}


