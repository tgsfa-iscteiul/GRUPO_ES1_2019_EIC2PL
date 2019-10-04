package test.javapackage;

public class Classe_Teste {





	public int soma(int x, int y) {
		return (x+y);
	}


	//comentario teste


	public static void main(String[] args) {

		Classe_Teste teste = new Classe_Teste();
		int x = teste.soma(7, 4);

		System.out.println(x);

	}

}