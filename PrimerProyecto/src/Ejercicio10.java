import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce precio; ");
	float precio = teclado.nextFloat();
	
	System.out.println("Introduce importe: ");
	float importe = teclado.nextFloat();
	
	float cambio = importe-precio;
	
	int euros = (int) cambio;
	int moneda2euros = euros/2;
	int m1e = euros%2;
	
	int centimos = (int) ((cambio - euros)*100);
	
	int m50c = centimos / 50;
	int resto = centimos %50;
	
	int m20c = resto /20;
	resto = resto %20;
	
	int m10c = resto /10;
	resto = resto % 10;
	
	int m5c = resto /5;
	resto = resto % 5;
	
	int m2c = resto /2;
	int m1c = resto % 2;
	
	System.out.printf("Devolver %.2f", cambio);
	System.out.printf("Monedas de 2€: %d", moneda2euros);
	System.out.printf("Monedas de 1€: %d", m1e);
	System.out.printf("Monedas de 50centimos: %d", m50c);
	System.out.printf("Monedas de 20centimos: %d", m20c);
	System.out.printf("Monedas de 10centimos: %d", m10c);
	System.out.printf("Monedas de 5centimos: %d", m5c);
	System.out.printf("Monedas de 1centimo: %d", m1c);
	
	teclado.close();
		

	}

}
