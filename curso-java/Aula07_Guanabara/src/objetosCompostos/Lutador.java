package objetosCompostos;

public class Lutador {
	// atributos
	private String nome, nacionalidade, categoria;
	private Double altura, peso;
	private Integer idade, vitorias, derrotas, empates;

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso< 52.2) {
			this.categoria = "INVALIDO";
		}else if (this.peso <= 70.3) {
			this.categoria = "LEVE";
		}else if (this.peso <= 83.9) {
			this.categoria = "MEDIO";
		}else if (this.peso <= 120.2) {
			this.categoria = "PESADO";
		}else {
			this.categoria = "INVALIDO";
		}
	}
			
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getVitorias() {
		return vitorias;
	}

	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

	// construtor
	public Lutador(String nome, String nacionalidade, Double altura, Double peso, Integer idade, Integer vitorias,
			Integer derrotas, Integer empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.setPeso(peso);
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// metodos
	public void apresentar() {
		System.out.println("-------------------------------------------");
		System.out.println("Apresentador: ");
		System.out.println("- Chegou a hora!!!");
		System.out.println("Apresentamos o lutador "+ this.getNome()+"!,");
		System.out.println("diretamente do/da "+this.getNacionalidade()+",");
		System.out.println("com "+ this.getIdade()+" anos e "+this.getAltura()+" metros de altura,");
		System.out.println("pesando "+this.getPeso()+" kg,");
		System.out.println(this.getVitorias()+" vitórias,");
		System.out.println(this.getDerrotas()+" derrotas,");
		System.out.println(this.getEmpates()+" empates");
		System.out.println("-------------------------------------------");
		System.out.println("");
	}

	public void status() {
		System.out.println("**********CARTEL**********");
		System.out.println("Lutador: "+ this.getNome());
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: "+ this.getDerrotas());
		System.out.println("Empates: "+this.getEmpates());
		System.out.println("**************************");
		System.out.println("");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
		System.out.println("> "+this.getNome()+ " ganhou uma luta");
		System.out.println("");
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
		System.out.println("> "+this.getNome()+ " perdeu uma luta");
		System.out.println("");
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
		System.out.println("> "+this.getNome()+ " empatou uma luta");
		System.out.println("");
	}

}
