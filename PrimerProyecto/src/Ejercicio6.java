import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la velocidad: ");
		double km = teclado.nextDouble();
		
		double metrosSg=km*1000/3600;
		System.out.printf("%.2f km/h son %.2f m/sg",km, metrosSg);
	}

}
