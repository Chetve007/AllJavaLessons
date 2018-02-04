package extra;
public class SimpleEx2 {
	
	public static void main(String[] args) {
		
		int[] mas = new int[] {1,2,3};
		System.out.println((indexOf(mas, 2)));
	}
	
	private static int indexOf(int[] mas, int value) {
		int index;
		for (index = 0; index < mas.length; index++) {
			if (mas[index] == value) {
			}
		}
		return index; // error compilation
	}
}
