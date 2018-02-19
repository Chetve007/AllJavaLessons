package tubeEx;
public class WithAnAsterisk2 {
	
	public static void main(String[] args) {
		
		int x = 0;
		int[] arr = {20};
		System.out.println(x + " " + arr[0]);
		
		x = f(x, g(x, arr));						// if arr = ...
		System.out.println(x + " " + arr[0]);
		
		g(x, arr);
		System.out.println(x + " " + arr[0]);
	}
	
	private static int f(int x, int[] arr) {		// if int[] f (...)
		x += 30;
		arr[0] = 40;
		return 42;									// if return arr;
	}
	
	private static int[] g(int x, int[] arr) {
		x = 50;
		arr = new int[]{60};
		return arr;
	}
}
