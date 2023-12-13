package prog2_aula15;

public class Circulo extends Figura {
	private int raio;
	public Circulo (String nome,int raio) {
		super(nome);
		this.raio = raio;
	}
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		}
	
	public void calculaArea() {
		double area = (3.14 * (raio*raio));
		System.out.println("Area:" + area);
	}
	public void calculaPerimetro() {
		double perimetro = 2*3.14*raio;
		System.out.println("Perímetro:" + perimetro);
	}
	public String toString() {
		return  super.toString() + "\nRaio: " + this.raio;
	}
}
