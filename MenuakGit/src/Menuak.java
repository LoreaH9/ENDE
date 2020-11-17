//ariketa
import java.util.*;
public class Menuak {
	public static void suma(int z1, int z2) {
		System.out.print(z1+z2);
	}
	public static void resta(int z1, int z2) {
		System.out.print(z1-z2);
	}
	public static void mult(int z1, int z2) {
		System.out.print(z1*z2);
	}
	public static void div(int z1, int z2) {
		System.out.print(z1/z2);
	}
	public static void fact(int z1) {
		int i=1,fact=1;
		while (i<=z1) {
			fact=i*fact;
			i++;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println(""
				+ "********************************\r\n"
				+ "Menu: \r\n"
				+ "1. + \r\n"
				+ "2. - \r\n"
				+ "3. * \r\n"
				+ "4. / \r\n"
				+ "5. factorial \r\n"
				+ "********************************");
		
		System.out.println("Que operacion quieres hacer");
		String aukera=entrada.next();
		switch (aukera) {
		case "+":
			System.out.println("Mete los dos numeros");
			int x=entrada.nextInt(), y=entrada.nextInt();
			suma(x,y);break;
		case "-":
			System.out.println("Mete los dos numeros");
			x=entrada.nextInt();
			y=entrada.nextInt();			
			resta (x,y);break;
		case "*":
			System.out.println("Mete los dos numeros");
			x=entrada.nextInt();
			y=entrada.nextInt();			
			mult(x,y);break;
		case "/":
			System.out.println("Mete los dos numeros");
			x=entrada.nextInt();
			y=entrada.nextInt();
			div(x,y);break;
		case "factorial":
			System.out.println("Mete el numeros");
			x=entrada.nextInt();
			fact(x);break;
		default:
			System.out.println("no has metido un valor válido");
			aukera=entrada.next();
			
		
		}

	}
	
}
