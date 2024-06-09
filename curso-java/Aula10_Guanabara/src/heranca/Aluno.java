package heranca;

public class Aluno extends Pessoa {
	private Integer matricula;
	private String curso;
	
	public void cancelarMatricula() {
		System.out.println("Matrícula será Cancelada...");
	}
	//Construtor
	public Aluno(String nome, Integer idade, String sexo, Integer matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	// Getters e Setters 
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return super.toString()+"\n > Matricula: " + matricula + "\n > Curso: " + curso + "";
	}
	
	
	
	
	
	
	

}
