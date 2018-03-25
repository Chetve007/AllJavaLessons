package createShape;

public class ConsoleMain {

	public static void main(String[] args) {
		TextPainter painter = new TextPainter();
		Square figure = new Square(new Point(80,80), 60);
		figure.draw(painter);
	}

}
