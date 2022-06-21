import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
	
		int num1,num2;
		float media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("introduce otro numero: ");
		num2 = entrada.nextInt();
		
		media = (num1+num2)/2.0f;
		System.out.println("La media es: "+media);

	}

}
