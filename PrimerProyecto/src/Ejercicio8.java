import java.util.Scanner;

/**8. Programa que calcula el volumen de una esfera.
 */


public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner salida=new Scanner(System.in);
		
		System.out.println("Radio esfera(cm); ");
		double radio=salida.nextDouble();
		
		final double PI=3.14159;
		
		double esfera=(4*PI*radio*radio*radio/3);
		
		System.out.printf("El volumen de la esfera es %.2f", esfera);
		
		salida.close();

	}

}
