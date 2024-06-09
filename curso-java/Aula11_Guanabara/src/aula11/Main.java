package aula11;

public class Main {
	public static void main(String[] args) {
		/* Visitante p1 = new Visitante("Jose",56,"M");
		System.out.println(p1.toString()); */
		
		Aluno al1 = new Aluno("Jordan",19,"M",2024101,"Análise e Desenvolvimento de Sistemas");
		al1.pagarMensalidade();
		Bolsista bol1 = new Bolsista("Jéssica", 17, "F", 2024106, "Engenharia de SW", true);
		bol1.pagarMensalidade();
		
	}

}
