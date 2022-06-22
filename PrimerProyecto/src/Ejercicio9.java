import java.util.Scanner;

/**9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
*/

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un lado por favor: ");
		double longitudladoa=teclado.nextDouble();
		
		System.out.println("Dame otro lado por favor: ");
		double longitudladob=teclado.nextDouble();
		
		System.out.println("Dame el tercer lado por favor: ");
		double longitudladoc=teclado.nextDouble();
		
		double semiperimetro=((longitudladoa+longitudladob+longitudladoc)/2.0);
		
		double areatriangulo=Math.sqrt(semiperimetro*(semiperimetro-longitudladoa)*semiperimetro*(semiperimetro-longitudladob)*semiperimetro*(semiperimetro-longitudladoc));
		
		
		System.out.printf("areatriangulo: %.2f", areatriangulo);
		
	}

}
