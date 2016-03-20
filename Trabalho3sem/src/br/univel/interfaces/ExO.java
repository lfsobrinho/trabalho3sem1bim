package br.univel.interfaces;

import br.univel.classeabstrata.*;

public class ExO extends DesenhoAbstrato {
	public static int ALTURA = 8;

	public void desenhar() {

		identificar();

		int brancos = 0;
		for (int linha = 0; linha <= 8; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print(coluna);
				} else {
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.print("\n");
		}
	}

	@Override
	protected String getNome() {
		return "O";
	}

}