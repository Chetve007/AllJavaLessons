package extra;

import java.util.Random;
import java.util.Scanner;

public class TryToGuesseTheLetter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch = (char) ('A' + new Random().nextInt(26));
		System.out.println(ch);
		System.out.println("Hey man, try to guess the letter!");
		char s = 'A';

		while (s != ch) {
			for (char i = 0; i < 26; i++) {
				s = sc.next().charAt(0);
				if (s == ch) {
					System.out.println("Yeeeeeeah!!! You win");
					break;
				} else
					System.out.println("Sorry, you didn't guess. Try again");
				if (Character.getNumericValue(ch) > Character.getNumericValue(s))
					System.out.println("I give you a hint! Your are too low.");
				else if (Character.getNumericValue(ch) < Character.getNumericValue(s))
					System.out.println("I give you a hint! Your are too high.");
			}
		}
	}
}
