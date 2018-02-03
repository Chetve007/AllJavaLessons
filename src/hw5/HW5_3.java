package hw5;
import java.util.Scanner;
public class HW5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название переменной: ");
		String var = sc.nextLine();
		char[] ch = var.toCharArray();
		
		// из С++ в Java
		if (var.contains("_")) {
			for (int i = 0; i < var.length(); i++) {
				if (ch[i] == '_')
					ch[i+1] = Character.toUpperCase(ch[i+1]); 
			}
			String varToJava = new String(ch).replaceAll("_", "");
			System.out.println("Вы ввели название переменной из С++, в Java название будет выглядеть так: " + varToJava);
		}
		
		// из Java в C++
		else {
			for (int i = 0; i < var.length(); i++) {
				if (Character.isUpperCase(ch[i])) {
					ch[i] = Character.toLowerCase(ch[i]);
					
					// не знаю как вставить символ "_" перед заглавной буквой, не получается
				}
			}
			String varToCiPlusPlus = new String(ch);
			System.out.println("Вы ввели название переменной из Java, в С++ название будет выглядеть так: " + varToCiPlusPlus);
		}
	}
}	
//		StringBuffer sb = new StringBuffer(var);
//		for (int i = 0; i < sb.length(); i++) {
//			if (Character.isUpperCase(sb.charAt(i))) {
//				Character.toLowerCase(sb.charAt(i));
//				sb.insert(sb.charAt(i-1), '_');
//			}
//		}
