package dMassiveGenerics;
import java.util.Arrays;

public class DynMassiveGeneric {
	public static void main(String[] args) {
	
		try {
			CreateDMGen<Integer> arrayInt = new CreateDMGen<>();
			CreateDMGen<String> arrayStr = new CreateDMGen<>();
			
			arrayInt.add(1);
			arrayInt.add(121);
			arrayInt.add(1);
			arrayInt.add(121);
			arrayInt.add(1);
			arrayInt.add(121);
			arrayStr.add("Good life!");
			arrayStr.add("Party hard all day, all night!");
			
			System.out.println(arrayInt.length()); // 6
			System.out.println(arrayStr.length()); // 2
			
			arrayInt.print(); // 1, 121, 1, 121, 1, 121
			arrayStr.print();// Good life
			
			Object[] javaArray = arrayInt.toArray();// пришлось сделать класс Object, т.к. при Integer выдает ClassCastException
			
			System.out.println(Arrays.toString(javaArray));
			
			arrayInt.index(3);
			
		} catch(NullPointerException e) {
			System.err.println("You are an incorrigible idiot!!! You haven't elements in this dynamic array! Please, corrected your code!");
			e.printStackTrace();
		}
	}
}
