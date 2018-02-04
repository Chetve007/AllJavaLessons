package extra;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number ");
		int last = sc.nextInt();
		System.out.println("Now you have to guess the number from 1 to " + last);
		int randomNum = (int)(Math.random() * last) + 1;
		System.out.println(randomNum);
		System.out.println("How many attempts do you need to guess the number?");
		int k = sc.nextInt();
		System.out.println("Ok, let's play!!!");
		int count = 1;
		
		while (count <= k) {
			int num = sc.nextInt();
			if (num == randomNum) {
				System.out.println("You did it!!! You guess!!! It's amazing! Well done!");
				break;
			}
			else {
				System.out.println("No, try again");
			}
			if (count == k && num != randomNum)
				System.out.println("Sorry, you used all your attempts. Maybe you'll get lucky another time");
			count++;
		}
	}
}
