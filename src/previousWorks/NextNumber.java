package previousWorks;
public class NextNumber {

	public static void main(String[] args) {
		int num = 10;
		double first = 13.2, second = 6.95;
		double res1 = first - num;
		double res2 = second - num;
		if (res1 < 0)
			res1 = res1 * -1;
		if (res2 < 0)
			res2 = res2 * -1;
		
			System.out.print("Answer to the first task: ");
		if (res1 > res2)
			System.out.println("Число " + second + " ближайшее к числу " + num);
		else 
			System.out.println("Число " + first + " ближайшее к числу " + num);
	}
}
