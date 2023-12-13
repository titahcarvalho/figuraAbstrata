package prog2_aula15;

public class Retangulo extends Figura{
	private int comprimento, largura;
	
	public Retangulo (String nome, int comprimento, int largura) {
		super(nome);
		this.comprimento = comprimento;
		this.largura = largura;
	}
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		}
	
	public void calculaArea() {
		double area = comprimento*largura;
		System.out.println("Area:" + area);
	}
	public void calculaPerimetro() {
		double perimetro = 2*(comprimento + largura);
		System.out.println("Perímetro:" + perimetro);
	}
	public String toString() {
		return super.toString() + "\nComprimento: " + this.comprimento + "\nLargura: " + this.largura;
	}

}
