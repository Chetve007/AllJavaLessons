package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkClass3 {
	public static void main(String[] args) {

		Map<String, String> foreignWords = new HashMap<>();
		
		foreignWords.put("animal", "Животное");
		foreignWords.put("cat", "Котейка");
		foreignWords.put("dog", "Собака");
		foreignWords.put("frog", "Лягушка");
		foreignWords.put("penguin", "Пингвин");
		foreignWords.put("ostrich", "Страус");
		foreignWords.put("squirrel", "Белка");
		foreignWords.put("hamster", "Хомяк");
		foreignWords.put("sparrow", "Воробей");
		
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
