package extra;
import java.util.Random;

public class ExtraExamles {
	public static void main(String[] args) {
		
		// conversely array
		
		final int EL = 10;
		int[] mas = new int[10];
		int tmp = 0;
		
		for (int i = 0; i < mas.length; i++) {
			Random rnd = new Random();
			mas[i] = rnd.nextInt(10) + 1;
			System.out.print(mas[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < mas.length / 2; i++) {
			tmp = mas[i];
			mas[i] = mas[(mas.length-2) - i + 1];
			mas[(mas.length-2) - i + 1] = tmp;
		}
		
		for (int item : mas) 
			System.out.print(item + " ");
	}
}
