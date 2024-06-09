package aulaPratica;

public class Teste {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro",22,"M");
		p[1] = new Pessoa("Maria",32,"F");
		
		l[0]= new Livro("Java", "Paulo", 200, 0, false, p[0]);
		l[1]= new Livro("Java 2", "Paulo", 200, 0, false, p[1]);
		l[2]= new Livro("Java 3", "Paulo", 200, 0, false, p[0]);
		
		System.out.println(l[0].toString());
	}

}
