package br.univel.interfaces;

import br.univel.classeabstrata.DesenhoAbstrato;


public class ExH extends DesenhoAbstrato {

	public static int ALTURA = 8;
	
	@Override
	public void desenhar() {
		identificar();
		
		int traco1 = 8;
		int traco2 = 0;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (linha == 0 || linha == ALTURA - 1 || coluna == traco1 || coluna ==traco2) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			traco1--;
			traco2++;
			System.out.print("\n");
		}
		
	}

	@Override
	protected String getNome() {
		return "H";
	}

}
//linha == 0 || linha == ALTURA - 1 || coluna == traco