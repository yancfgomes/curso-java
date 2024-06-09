package aula11;
// Classes abstratas não podem ser instanciadas (gerar objts)
public abstract class Pessoa {
	private String nome;
	private Integer idade;
	private String sexo;
		
	
	public void fazerNiver() {
		this.idade++;
		}



	//Getters e Setters
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
		return "Dados \n > Nome: " + nome + "\n > Idade: " + idade + "\n > Sexo: " + sexo + "";
	}



	
	// Construtor
	public Pessoa(String nome, Integer idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	

	
	
}
