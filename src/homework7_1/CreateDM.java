package homework7_1;
import java.util.Arrays;

public class CreateDM {
	
	int[] elements = new int[0];
	int countElemets = 0;

	public void add(int el) {		
		if (countElemets == elements.length) {
			int[] newArray = new int[elements.length + 1];
			System.arraycopy(elements, 0, newArray, 0, elements.length);
			elements = newArray;
		}
		elements[countElemets] = el;
		countElemets++;		
	}
	
//	public void add(int el) {
//		elements = Arrays.copyOf(elements, elements.length + 1);
//		elements[elements.length-1] = el;
//	}
	
	public int length() {
		return elements.length;
	}
	
	public void print() {
		for (int item : elements) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public int[] toArray() {
		for (int item : elements) {
			System.out.print(item + " ");
		}
		System.out.println();
		return elements;
	}
}
