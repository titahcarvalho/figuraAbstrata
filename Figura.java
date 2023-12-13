package prog2_aula15;

public abstract class Figura {
	private String nome;
		
	public Figura ( String nome) {	
		this.nome = nome;
		
	}
	public void imprimirDados() {
		System.out.println("Nome: "+ this.nome );
	}
	
	public abstract void calculaPerimetro();
	public abstract void calculaArea();
	
	public String toString() {
		return "\nNome: " + this.nome;
 	}
	
	}


