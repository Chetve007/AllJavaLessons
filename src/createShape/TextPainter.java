package createShape;

public class TextPainter implements Painter {

	@Override
	public void drawline(Point from, Point to) {
		System.out.println("Draw line from " + from + " to " + to);
	}
}
