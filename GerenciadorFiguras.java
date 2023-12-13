package prog2_aula15;

import java.util.ArrayList;

public class GerenciadorFiguras {

	public static void main(String[] args) {
		ArrayList <Figura> figuras = new ArrayList<>();
		Figura circulo1 = new Circulo( "Circulo colorido", 89);
		Figura retangulo1 = new Retangulo ("Retangulo listrado", 56, 45);
		
		figuras.add(retangulo1);
		figuras.add(circulo1);
		
		for( Figura f : figuras ) {
			System.out.println(circulo1.toString());
			f.calculaArea();
			f.calculaPerimetro();
			
			System.out.println("--------------------------------------");
			System.out.println(retangulo1.toString());
			f.imprimirDados();
			/*f.calculaArea();
			f.calculaPerimetro();*/
		}
	
	}

}
