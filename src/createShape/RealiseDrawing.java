package createShape;
import java.io.IOException;
import java.util.Scanner;
import lesson20.Point;

public class RealiseDrawing extends Drawing  {

	@Override
	public void main(Painter painter) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set point bottom left 'x' ");
		int pointBLX = sc.nextInt();
		System.out.println("Set point bottom left 'y' ");
		int pointBLY = sc.nextInt();
		System.out.println("Set point top right 'x' ");
		int pointTRX = sc.nextInt();
		System.out.println("Set point top right 'y' ");
		int pointTRY = sc.nextInt();
		Square figure = new Square(new Point(pointBLX,pointBLY), new Point(pointTRX,pointTRY));
		figure.draw(painter);
//		try {
//			figure.side();
//		} catch (Exception e) {
//			System.out.println("You enter uncorrect points. You have some problems with your code. Check it! Check it now you bastard!!!");
//			e.printStackTrace();
//		}
//		System.out.println("Let's shift this figure");
//		System.out.println("Set new point 'x' ");
//		int pointNewX = sc.nextInt();
//		System.out.println("Set new point 'y' ");
//		int pointNewY = sc.nextInt();
//		figure.setTopLeft(new Point(pointNewX, pointNewY));
//		figure.draw(painter);
		
//		System.out.println("Set point 'x' ");
//		int pointX = sc.nextInt();
//		System.out.println("Set point 'y' ");
//		int pointY = sc.nextInt();
//		System.out.println("Set side length ");
//		int sideLength = sc.nextInt();
//		Square figure = new Square(new Point(pointX,pointY), sideLength);
//		figure.draw(painter);
//		System.out.println("Let's shift this figure");
//		System.out.println("Set new point 'x' ");
//		int pointNewX = sc.nextInt();
//		System.out.println("Set new point 'y' ");
//		int pointNewY = sc.nextInt();
//		figure.setTopLeft(new Point(pointNewX, pointNewY));
//		figure.draw(painter);
	}

}
