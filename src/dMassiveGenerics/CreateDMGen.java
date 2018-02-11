package dMassiveGenerics;
import java.util.Arrays;

public class CreateDMGen <E> {

	E [] elements = (E[])new Object[0];
	int countElemets = 0;
	
	public void add(E el) {	
		if (countElemets == elements.length) {
			E[] newArray = (E[]) new Object[elements.length + 1];
			System.arraycopy(elements, 0, newArray, 0, elements.length);
			elements = newArray;
		}
		elements[countElemets] = el;
		countElemets++;		
	}
//	public void add (E el) {
//		elements = Arrays.copyOf(elements, elements.length + 1);
//		elements[elements.length-1] = el;
//	}
	public int length() {
		return elements.length;
	}
	
	public void print() {
		for (E item : elements) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public E[] toArray() {
		for (E item : elements) {
			System.out.print(item + " ");
		}
		System.out.println();
		return elements;
	}
	
	public void index(int ind) {
		try {
			System.out.print(elements[ind]);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.err.println("Error: in your array only " + elements.length + " elements :( ");
			a.printStackTrace();
		}
	}
}
