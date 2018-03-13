package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkClass3 {
	public static void main(String[] args) {

		Map<String, String> foreignWords = new HashMap<>();
		
		foreignWords.put("animal", "��������");
		foreignWords.put("cat", "�������");
		foreignWords.put("dog", "������");
		foreignWords.put("frog", "�������");
		foreignWords.put("penguin", "�������");
		foreignWords.put("ostrich", "������");
		foreignWords.put("squirrel", "�����");
		foreignWords.put("hamster", "�����");
		foreignWords.put("sparrow", "�������");
		
		System.out.println("Size matters: " + foreignWords.size());
		
//		System.out.println("Keys: " + foreignWords.keySet());
//		System.out.println("Values: " + foreignWords.values());
//		System.out.println(foreignWords.entrySet());		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String w = sc.nextLine().toLowerCase();
			if(foreignWords.containsKey(w))
				System.out.println("maps to " + foreignWords.get(w));
			else
				System.err.println("maps to nothing");
		}
	}
}
