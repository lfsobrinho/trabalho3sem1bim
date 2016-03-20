package br.univel.interfaces;

/**
 *    Desenha a figura abaixo com largura = SIZE;
 * 
 * 
 *      ****
 *      *  *
 *      *  *
 *      ****
 */
public class QuadradoProfessor implements Desenho {

	public static int SIZE = 4;
	public void desenhar() {
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if (linha == 0 || linha == SIZE - 1) {
					System.out.print("*");
				} else {
					if (coluna == 0 || coluna == SIZE - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
