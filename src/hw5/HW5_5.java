package hw5;
import java.util.Scanner;

public class HW5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово/предложение: ");
		String sentence = sc.nextLine();
		PermutationMeth(0, sentence);
	}
	
	private static void PermutationMeth (int num, String str) {
		char[] ch = str.toCharArray();
	    for (int i = num; i < str.length(); i++) {
	        char ch2 = ch[i];
	        ch[i] = ch[num];
	        ch[num] = ch2;
	        PermutationMeth(num + 1, new String(ch));
	    }   
	        if (num == str.length())
	        	System.out.println(str);
	}
}

