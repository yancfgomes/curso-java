package heranca;

public class Funcionario extends Pessoa{
	private String setor;
	private Boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = !this.trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(Boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	@Override
	public String toString() {
		return super.toString()+"\n > Setor: " + setor + 
				" \n > Trabalhando? " + trabalhando +
				"";
	}

	public Funcionario(String nome, Integer idade, String sexo, String setor, Boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}
	
	
	
}
