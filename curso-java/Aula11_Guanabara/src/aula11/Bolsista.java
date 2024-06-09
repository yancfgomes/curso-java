package aula11;

public class Bolsista extends Aluno{
	private Boolean bolsa;
	
	// Construtor
	public Bolsista(String nome, Integer idade, String sexo, Integer matricula, String curso, Boolean bolsa) {
		super(nome, idade, sexo, matricula, curso);
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de "+this.getNome());
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista:\n > Pagamento facilitado.");
	}
	
	// Getters e Setters
	public Boolean getBolsa() {
		return bolsa;
	}

	public void setBolsa(Boolean bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
