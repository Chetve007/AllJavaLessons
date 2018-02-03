package hw5;

public class HW5_6 {
	public static void main(String[] args) {
		
//		double pi = Math.PI;
		String piStr = "3.141592653589793238462643383279502884197169399375105820974";
		String[] piArray = piStr.split("[9]");
		int max = piArray[0].length();
		
		for (int i = 0; i < piArray.length; i++) {
			if (piArray[i].length() > max)
				max = piArray[i].length();
		}
		System.out.println("Максимальное количество чисел между двумя '9' в числе Пи = " + max);
	}
}
