package heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private Double salario;
	
	public void receberAumento(Double aumento) {
		this.salario+=aumento;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public Professor(String nome, Integer idade, String sexo, String especialidade, Double salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()+"\n > Especialidade: " + especialidade + "\n > Salario: R$ " + salario + "";
	}
	
	

}
