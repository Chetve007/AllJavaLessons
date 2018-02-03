package hw5;
import java.util.Arrays;
import java.util.Scanner;

public class HW5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваше первое предложение: ");
		String firstSent = sc.nextLine().trim();
		System.out.println("Введите ваше второе предложение: ");
		String secondSent = sc.nextLine().trim();
		
		firstSent = firstSent.replaceAll("\\p{Punct}+", "").toLowerCase();
		secondSent = secondSent.replaceAll("\\p{Punct}+", "").toLowerCase();

		char[] one = firstSent.toCharArray();
		char[] two = secondSent.toCharArray();
		
		for (int i = 0; i < firstSent.length(); i++) {
			for (int j = 0; j < firstSent.length()-i-1; j++) {
				if (one[j] < one[j+1]) {
					char temp = one[j+1];
					one[j+1] = one[j];
					one[j] = temp;	
				}
			}
		}
//		System.out.println(Arrays.toString(one));
		
		for (int i = 0; i < secondSent.length(); i++) {
			for (int j = 0; j < secondSent.length()-i-1; j++) {
				if (two[j] < two[j+1]) {
					char temp = two[j+1];
					two[j+1] = two[j];
					two[j] = temp;	
				}
			}
		}
//		System.out.println(Arrays.toString(two));
		
		String firstSent2 = new String(one).replaceAll("\\s+", "");
		String secondSent2 = new String(two).replaceAll("\\s+", "");
	
//		System.out.println(firstSent2);
//		System.out.println(secondSent2);
		
		if (firstSent2.equals(secondSent2))
			System.out.println("Строки являются анаграммами, молодцом!");
		else
			System.out.println("Они не анаграммы, сразу же видно. Опять все не так сделал ...");
	}
}
