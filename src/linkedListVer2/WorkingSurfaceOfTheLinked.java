package linkedListVer2;

import java.util.Iterator;

public class WorkingSurfaceOfTheLinked {

	public static void main(String[] args) {
		
		LinkedContainer<String> stringLinked = new LinkedContainer<>();
		stringLinked.addLast("bad");
		System.out.println(stringLinked.size());
		System.out.println(stringLinked.getElementByIndex(0));
		stringLinked.addFirst("worse");
		System.out.println(stringLinked.size());
		System.out.println(stringLinked.getElementByIndex(0));
		stringLinked.addLast("normal");
		stringLinked.addLast("good");
		stringLinked.addLast("better");
		stringLinked.addLast("the best");
		stringLinked.addLast("best of the best");
		
		for (String str : stringLinked) {
			System.out.print(str + " --> ");
		}
		System.out.println("\n\tElements = " + stringLinked.size());
		
		Iterator iterator = stringLinked.descendingIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " --> ");
		}
		System.out.println("\n\tIt's reverse.");
		
		stringLinked.deleteAtPosition(3);
		for (String str : stringLinked) {
			System.out.print(str + " --> ");
		}
//		System.out.println("\n\tElements = " + stringLinked.size());
	}
}
