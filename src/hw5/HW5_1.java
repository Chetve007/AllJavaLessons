package hw5;
import java.util.Scanner;

public class HW5_1 {
	public static void main(String[] args) {
		String consonants = "�����������������������������������������������";
		String vowels = "���������޸���������";
		String numbers = "0123456789";
		String punctuation = ";:'\",().-!?";
		int cons = 0, vow = 0, num = 0, punct = 0, others = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ������: ");
		String sentence = sc.nextLine();
		String[] words = sentence.trim().split("\\s+");
		int qWords = words.length;
		System.out.println("���������� ���� � ����� �������: " + qWords);
		
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
		
		System.out.println("���������� ��������� ���� � ����� �������: " + cons);
		System.out.println("���������� ������� ���� � ����� �������: " + vow);
		System.out.println("���������� ���� � ����� �������: " + num);
		System.out.println("���������� ������ ���������� � ����� �������: " + punct);
		System.out.println("���������� ������ �������� � ����� �������: " + others);
	}
}
