import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el radio (en cm): ");
		double radio=teclado.nextDouble();
		
		final double PI=3.14159;
		
		double area=PI*Math.pow(radio, 2);
		double longitud=2*PI*radio;
		
		System.out.println("El area es: "+area+" cm \ny la longitud es " +longitud+ " cm");

	}

}
