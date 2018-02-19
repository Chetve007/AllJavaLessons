package tubeEx;
public class WithAnAsterisk {
	
	public static void main(String[] args) {
		
		int x = 0;
		int[] arr = {20};
		System.out.println(x + " " + arr[0]);
		
		f(x, arr);
		System.out.println(x + " " + arr[0]);
		
		g(x, arr);
		System.out.println(x + " " + arr[0]);
	}
	
	private static void f(int x, int[] arr) {
		x += 30;							
		arr[0] = 40;
	}
	
	private static void g(int x, int[] arr) {
		x = 50;
		arr = new int[]{60};
	}
}
