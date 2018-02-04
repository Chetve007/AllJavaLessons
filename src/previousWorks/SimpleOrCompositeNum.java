package previousWorks;
import java.util.Scanner;

public class SimpleOrCompositeNum {

	public static void main(String[] args) {
		// опеределение числа на простое и составное
		
		Scanner simple = new Scanner(System.in);
		System.out.println("Введите число: ");
		int simpNum = simple.nextInt();
		boolean b = false;
		for(int i = 2; i <= Math.sqrt(simpNum); i++) {
			if(simpNum % i == 0) {
				b = true;
				break;
			}
		}
		if(b)
			System.out.println("Number " + simpNum + " is composite");
		else 
			System.out.println("Number " + simpNum + " is simple");


	}

}
