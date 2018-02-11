package extra;
import java.io.IOException;

public class Winner {

	public static void main(String[] args) {
		String[] names = {"Elena", "Tom", "Bob", "Scot", "Alex", "John", "Tina", "Margo", "Robin", "Kate"};
		int[] times = {341, 388, 410, 411, 450, 398, 407, 420, 370, 350};
		
		int first = first(times);
		
		System.out.println(names[first]);
	}
	
	public static int first(int[] array) {
		int num = array[0];
		int ind = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > num) {
				num = array[i];
				ind = i;
			}
		}
		return ind;
	}
}
