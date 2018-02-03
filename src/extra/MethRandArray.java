package extra;
import java.util.Random;

public class MethRandArray {
	public static void main(String[] args) {
		
		randomArray(10, 200);
		
	}
	
	public static void randomArray (int a, int random) {
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			arr[i] = rnd.nextInt(random) + 1;
		}
		for (int item : arr)
			System.out.print(item + "  ");
	}

}
