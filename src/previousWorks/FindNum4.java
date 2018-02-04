package previousWorks;
public class FindNum4 {

	public static void main(String[] args) {
		// вывести числа от 0 до 99999, в которых есть числа 4 или 13 и сколько всего таких чисел
		
		int n = 0;
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			n = i;
			while (n != 0) {
				if (n % 10 == 4 || n % 100 == 13) {
					System.out.println(i);
					count++;
					break;
					}
				n = n / 10;
			}
		}
		System.out.println("Таких номеров всего: " + count);
	}
}
