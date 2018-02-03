package previousWorks;
public class FibonacciNumbers {

	public static void main(String[] args) {
		int count = 0;
		int j = 0;
		for (int i = 1; count < 23; i = i + j) {
			count++;
			j = i - j;
			System.out.println(i);
		}
	}
}
