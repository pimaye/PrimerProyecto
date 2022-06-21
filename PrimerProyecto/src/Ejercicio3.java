import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		// Comentario: definimos una variable de tipo float
		float num;
		
		//definimos el Scanner para leer desde teclado
		Scanner entrada = new Scanner(System.in);
		
		//mostramos el mensaje por pantalla
		System.out.println("Introduce un numero: ");
		// pedimos el numero por teclado
		num = entrada.nextFloat();
		
		float doble = num*2;
		float triple = num*3;
		
		System.out.println("el doble es: "+ doble+ " y el triple "+triple);

	}

}
