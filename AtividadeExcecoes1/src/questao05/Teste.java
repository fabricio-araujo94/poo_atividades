package questao05;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String [] args) {
		Cadastro a = new Cadastro();
		
		while(true) {
			try {
				if(a.getNomeCompleto() == null)
					a.setNomeCompleto(JOptionPane.showInputDialog("Digite o seu nome completo:"));
				if(a.getTelefone() == null)
					a.setTelefone(JOptionPane.showInputDialog("Digite o DDD de sua área:"));
				a.setTelefone(JOptionPane.showInputDialog("Digite o seu número:"));
				break;
			} catch (NomeNulo e) {
				JOptionPane.showMessageDialog(null, "É obrigatório inserir um nome.");
			} catch (DddErrado e) {
				JOptionPane.showMessageDialog(null, "DDD inválido");
			} catch (NumeroErrado e) {
				JOptionPane.showMessageDialog(null, "Número inválido");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Cadastro concluído.");
		JOptionPane.showMessageDialog(null, "Nome: " + a.getNomeCompleto());
		JOptionPane.showMessageDialog(null, "Número: " + a.getTelefone());
	}
}

