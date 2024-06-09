package Aula05;

public class Aula05 {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		
		p1.setDono("Xubileu");
		//p2.setDono("Creuza");
		
		p1.setNumConta(1111);
		//p2.setNumConta(2222);
		
		p1.abrirConta("CC");
		//p2.abrirConta("CP");
		
		p1.depositar(300.0);
		//p2.depositar(500.0);
		
		p1.sacar(350.0);
		
		
		p1.fecharConta();
		
		
		p1.estadoAtual();
		//p2.estadoAtual();
		
	}

}
