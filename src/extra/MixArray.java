package extra;
import java.util.Random;
import java.util.Scanner;
public class MixArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] array = new int[size];
		Random rnd = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100) + 1;
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		System.out.println("This is your mixed array: ");
		
        for (int i = 1; i < array.length; i++) {            
        	int j = rnd.nextInt(i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for(int item : array) {
        	System.out.print(item + "  ");        	
        }
	}

}
