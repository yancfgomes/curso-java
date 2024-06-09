package objetosCompostos;
import java.util.Random;

public class Luta {
	//ATRIBUTOS
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// METODOS PUBLICOS
	public void marcarLuta(Lutador l1,Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria())&& l1!=l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println(" >>> A Luta foi marcada <<<");
			System.out.println("");
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println(" >>> A Luta não foi marcada <<<");

		}
	}
	public void lutar() {
		if (this.aprovada) {
			System.out.println("APRESENTACAO DO DESAFIADO: ");
			this.desafiado.apresentar();
			System.out.println("APRESENTACAO DO DESAFIANTE: ");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
				case 0: //empate
					System.out.println("Resultado da Luta:");
					System.out.println("");
					System.out.println(">>> EMPATE <<<");
					System.out.println("");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: // desafiado vence
					System.out.println("Resultado da Luta: Vitoria do " + this.desafiado.getNome());
					System.out.println("");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: // desafiante vence
					System.out.println("Resultado da Luta: Vitoria do " + this.desafiante.getNome());
					System.out.println("");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
			
		}
	}
	
	// Getters e Setters
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}
