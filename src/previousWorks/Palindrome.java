package previousWorks;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// опеределить является ли число от пользователя палиндромом
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		String number = sc.next();
		int i = number.length() - 1;
		int j = 0;
		boolean b = false;
			while (i > j) {
				if (number.charAt(i) == number.charAt(j)) {
					b = true;
				}
				else {
					b = false;
				}
				i--;
				j++;
			}
			if (b == true)
				System.out.println("Your number " + number + " is palindrome");
			else 
				System.out.println("Your number " + number + " isn't palindrome");
	}

}
