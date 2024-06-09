package Aula05;

public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// Metodos Personalizados
	public void estadoAtual() {
		System.out.println("-----------------------------------------");
		System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------------------");
		
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);

		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta nao pode ser fechada pois ainda tem dinheiro");
			System.out.println("Saldo em conta: " + this.getSaldo());
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada pois ainda tem debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada!");
		}
	}

	public void depositar(Double v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.getDono());

		} else {
			System.out.println("Impossivel Depositar!");
		}
	}

	public void sacar(Double v) {
	    if (this.getStatus()) {  // Simplificado: não precisa comparar diretamente com true
	        if (this.getSaldo() >= v) {
	            this.setSaldo(this.getSaldo() - v);
	            System.out.println("Saque realizado na conta de " + this.getDono());
	        } else {
	            System.out.println("Saldo Insuficiente para saque");
	        }
	    }else {
	    	System.out.println("Impossivel sacar de um conta fechada");
		}
	}

	public void pagarMensal() {
		int v=0;
		if (this.getTipo()== "CC") {
			v=12;
		}else if (this.getTipo()=="CP") {
			v=20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por: "+ this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}
	}

	// Metodos Especiais

	// - Construtor
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	// - Getters e Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
