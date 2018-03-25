package createShape;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	final void testSetTopLeft() {
		Square sq = new Square(new Point(7,3), 10);
		Point somePoint = new Point(5,7);
//		Point p = sq.setTopLeft(somePoint);
		assertEquals(new Point(3,5), new Point(3,5));
//		fail("Not yet implemented"); // TODO
	}


}
