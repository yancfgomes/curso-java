package heranca;

public class ProjetoPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose",33,"Masculino");
		Aluno p2 = new Aluno("Maria",46,"Feminino",2024001,"Engenharia de Software");
		Professor p3 = new Professor("Jefferson",50,"Masculino","Desenvolvedor",10000.00);
		Funcionario p4 = new Funcionario("Joaquina",20,"Feminino","Serviçoes Gerais",true);
		
		
		
		System.out.println("\n PESSOA \n");
		System.out.println(p1.toString());
		System.out.println("______________________________");
		System.out.println("\n ALUNO \n");
		System.out.println(p2.toString());
		System.out.println("______________________________");
		System.out.println("\n PROFESSOR(A) \n");
		System.out.println(p3.toString());
		System.out.println("______________________________");
		System.out.println("\n FUNCIONÁRIO \n");
		System.out.println(p4.toString());
		System.out.println("______________________________");
		
		
		
		
		
		
	}

}
