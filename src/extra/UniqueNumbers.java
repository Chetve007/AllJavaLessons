package extra;
import java.util.Random;
import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of massive");
		int[] arr = new int[sc.nextInt()];
		int count = 0;
		int count2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			arr[i] = rnd.nextInt(5) + 1;
			System.out.print(arr[i] + "  ");
		}	
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			count++;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] == arr[i])
					++count2;
			}
		}
		int res = count - count2;
		System.out.println("This massive have " + res + " unique elements");
	}
}
