package homework7;
import java.util.ArrayList;

public class DArray {

	int countElemets = 0;
	ArrayList<Integer> amount = new ArrayList<Integer>();
	
	public void add(int el) {
		amount.add(el);
	}
	
	public void print() {
		for (int item : amount) {
			System.out.print(item + " ");
		}
	}
	
	public int length() {
		return amount.size();
	}
	
	public ArrayList<Integer> toArray() {
		for (int item : amount) {
			System.out.print(item + " ");
		}
		return amount;
	}
}
