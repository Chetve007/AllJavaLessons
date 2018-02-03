package previousWorks;
public class Quadratic {

	public static void main(String[] args) {
		// вычисление квадратных корей уравнения ax^2 + bx + c = 0, через дискриминант: 
		double a = 6, b = -12, c = 0;
		double D = b * b - 4 * a * c;
		System.out.print("Answer to the second task: ");
//		System.out.println("The discriminant is " + D);
								
		if (D > 0) {
			double x1, x2;
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("The equation has 2 square roots " + x1 + ", " + x2);
			}
		else if (D == 0) {
			double x;
			x = -b / (2 * a);
			System.out.println("The equation has 1 square roots " + x);
			}
		else
			System.out.println("The equation hasn't square roots");
	}

}
