import java.util.Scanner;

/**7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
de la hipotenusa según el teorema de Pitágoras. 
*/

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Longitud cateto1 (cm): ");
		double longitudcateto1=teclado.nextDouble();
		
		System.out.println("Longitud cateto2 (cm); ");
		double longitudcateto2=teclado.nextDouble();
		
		double hipotenusa=Math.sqrt(longitudcateto1*longitudcateto1+longitudcateto2*longitudcateto2);
				
		System.out.printf("La hipotenusa es %.2f", hipotenusa);
		

	}

}
