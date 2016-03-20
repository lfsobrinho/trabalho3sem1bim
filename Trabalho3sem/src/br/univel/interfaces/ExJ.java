package br.univel.interfaces;
import br.univel.classeabstrata.DesenhoAbstrato;

public class ExJ extends DesenhoAbstrato {

	public static int SIZE = 13;
	
	@Override
	public void desenhar() {
		identificar();
		
		
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int col = 0; col < SIZE; col++) {
				System.out.print(col < linha || col >= SIZE - linha ? " " : "#");
			}
			System.out.print("\n");
		}
	}

	@Override
	protected String getNome() {
		return "J";
	}
	
	
//	public static void main(String[] args) {
//		
//		int a = 2;
//		int b = 3;
//		
//		if ( a > b) {
//			System.out.println("maior");
//		} else {
//			System.out.println("menor");
//		}
//		
//		
//		System.out.println(a > b ? "maior" : "menor");
//	}
}