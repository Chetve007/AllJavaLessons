package hw5;
import java.util.Scanner;

public class HW5_1 {
	public static void main(String[] args) {
		String consonants = "ЙЦКНГШЩЗХФВПРЛДЖЭЧСМТЬБйцкнгшщзхъфвпрлджэчсмтьб";
		String vowels = "ЁУЕЫАОЭЯИЮёуеыаоэяию";
		String numbers = "0123456789";
		String punctuation = ";:'\",().-!?";
		int cons = 0, vow = 0, num = 0, punct = 0, others = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш запрос: ");
		String sentence = sc.nextLine();
		String[] words = sentence.trim().split("\\s+");
		int qWords = words.length;
		System.out.println("Количество слов в вашем запросе: " + qWords);
		
		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < consonants.length(); j++) {
				if (sentence.charAt(i) == consonants.charAt(j))
					cons++;
			}
			for (int j = 0; j < vowels.length(); j++) {
				if (sentence.charAt(i) == vowels.charAt(j))
					vow++;
			}
			for (int j = 0; j < numbers.length(); j++) {
				if (sentence.charAt(i) == numbers.charAt(j))
					num++;
			}
			for (int j = 0; j < punctuation.length(); j++) {
				if (sentence.charAt(i) == punctuation.charAt(j))
					punct++;
			}
		}
		others = sentence.replaceAll("\\s+", "").length() - cons - vow - num - punct;
		
		System.out.println("Количество согласных букв в вашем запросе: " + cons);
		System.out.println("Количество гласных букв в вашем запросе: " + vow);
		System.out.println("Количество цифр в вашем запросе: " + num);
		System.out.println("Количество знаков припинания в вашем запросе: " + punct);
		System.out.println("Количество прочих символов в вашем запросе: " + others);
	}
}
