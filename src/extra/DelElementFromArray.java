package extra;
import java.util.Random;

public class DelElementFromArray {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int tmp = 6;
		int actual = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			arr[i] = rnd.nextInt(6) + 1;
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == tmp) {
				i++;
				for (int j = i; j < arr.length; j++) {
					arr[j-1] = arr[j];
				}
				actual--;
//				break;
			}
		}
		int del = arr.length - actual;
		
		for (int item : arr)
			System.out.print(item + "  ");
		System.out.println();
		for (int i = 0; i < actual; i++) 
			System.out.print(arr[i] + "  ");
		System.out.println();
		System.out.println("There were " + del + " element(s) which were delete");
	}
}
