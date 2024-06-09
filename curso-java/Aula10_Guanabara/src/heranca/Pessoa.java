package heranca;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String sexo;
	
	public void fazerNiver() {
		this.idade++;
	}
	
	// Construtor
	public Pessoa(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}


	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return " > Nome: " + nome + "\n > Idade: " + idade + "\n > Sexo: " + sexo + "";
	}
	
	

}
