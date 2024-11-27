package questao3;

public class Execucao {
	public static void main(String[] args) throws DataException {
		try {
			Data a = new Data(12, 8, 2010);
			Data b = new Data(29, 2, 2020);
			Data c = new Data(29, 2, 2021);
			Data d = new Data(10, 30, 2021);
		} catch (DataException e) {
			System.out.println(e);
		}
	}
}
