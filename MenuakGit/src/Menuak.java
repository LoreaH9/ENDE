//ariketa
import java.util.*;
public class Menuak {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println(""
				+ "********************************\r\n"
				+ "Menu: \r\n"
				+ "1. + \r\n"
				+ "2. - \r\n"
				+ "3. * \r\n"
				+ "4. / \r\n"
				+ "********************************");
		System.out.println("Mete los dos numeros");
		int x=entrada.nextInt(), y=entrada.nextInt();
		System.out.println("Que operacion quieres hacer");
		String aukera=entrada.next();
		switch (aukera) {
		case "+":
			System.out.print(x+y);break;
		case "-":
			System.out.print(x-y);break;
		case "*":
			System.out.print(x*y);break;
		case "/":
			System.out.print(x/y);break;
		default:
			System.out.println("no has metido un valor válido");
			aukera=entrada.next();
			
		
		}

	}
	
}
