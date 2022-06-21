import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		float centigrados;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce grados centigrados: ");
		
		centigrados = entrada.nextFloat();
		
		float Fahrenheit = 32 + (9 * centigrados / 5);
		System.out.println("Son "+ Fahrenheit+ "grados Fahrenheit");

	}

}
