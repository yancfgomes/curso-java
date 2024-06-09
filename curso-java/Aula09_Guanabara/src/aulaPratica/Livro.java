package aulaPratica;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private Integer totPaginas;
	private Integer pagAtual;
	private Boolean aberto;
	private Pessoa leitor;
	
	// metodo acessor 
	public Livro(String titulo, String autor, Integer totPaginas,Integer pagAtual, Boolean aberto, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	

	// getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(Integer totPaginas) {
		this.totPaginas = totPaginas;
	}
	public Integer getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}
	public Boolean getAberto() {
		return aberto;
	}
	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// metodo especial toString()
	@Override
	public String toString() {
		return "Livro:" + titulo + "\nAutor:" + autor + "\nTotal de Paginas: " + totPaginas +"\nLeitor:" + leitor.getNome()+ " | Idade: " + leitor.getIdade()+" | Sexo: "+ leitor.getSexo();
	}
	
	// 
	@Override
	public void abrir() {
		this.aberto=true;
	}
	@Override
	public void fechar() {
		this.aberto=false;
	}
	@Override
	public void folhear(int p) {
		if (p>this.getTotPaginas())
			this.pagAtual=0;
		else
			this.pagAtual=p;
		this.pagAtual=p;
	}
	@Override
	public void avancarpag() {
		this.pagAtual++;
	}
	@Override
	public void voltarpag() {
		this.pagAtual--;
	}
	
}
