package previousWorks;
public class Clock {

	public static void main(String[] args) {
		// вывести на экран все симметричные комбинации эл. часов 00:00 до 23:59
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				if (i / 10 % 10 == j % 10 & i % 10 == j / 10 % 10)
					System.out.print(i + ":" + j + "\t");
			}	
			if (i == 11)
				System.out.println("");
		}
	}
}
