package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;

public class ExG extends DesenhoAbstrato{
	
	public static int ALTURA = 8;

	@Override
	public void desenhar() {
		identificar();
		

		int traco = 8;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (linha == 0 || linha == ALTURA - 1 || coluna == traco) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			traco--;
			System.out.print("\n");
		}
	}

	@Override
	protected String getNome() {
		return "G";
	}
	
}