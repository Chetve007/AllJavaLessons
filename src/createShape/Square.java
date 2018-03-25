package createShape;

public class Square implements Figure  {
	
	private Point bottomLeft;
	private Point bottomRight;
	private Point topRight;
	private Point topLeft;
	private Integer sideLength;

	public Square(Point bottomLeft, Point topRigth) {
		try {
			this.bottomLeft = bottomLeft;
			this.topRight = topRigth;			
			bottomRight = new Point(topRigth.x, bottomLeft.y);
			topLeft = new Point(bottomLeft.x, topRigth.y);
    		if (bottomRight.x - bottomLeft.x != topRight.y - bottomRight.y)
    			System.out.println("You enter uncorrect points. You have some problems with your code. Check it! Check it now you bastard!!!");
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    }

    public Square(Point bottomLeft, Integer sideLength) {
    	this.bottomLeft = bottomLeft;
    	this.sideLength = sideLength;
    	this.bottomRight = new Point(bottomLeft.x + sideLength, bottomLeft.y);
    	this.topLeft = new Point(bottomLeft.x, bottomLeft.y + sideLength);
    	this.topRight = new Point(bottomRight.x, bottomRight.y + sideLength);
    }
//    @Override
//    public void side() {
//    	if (bottomRight.x - bottomLeft.x != topRight.y - bottomRight.y)
//    		return;
//    }

    public Point getTopLeft() {
        // TODO возврат координаты верхнего левого угла
        return topLeft;
    }

    public Point getTopRigth() {
        // TODO возврат координаты верхнего правого угла
        return topRight;
    }

    public Point getBottomLeft() {
        // TODO возврат координаты нижнего левого угла
        return bottomLeft;
    }

    public Point getBottomRight() {
        // TODO возврат координаты нижнего правого угла
        return bottomRight;
    }

    public void setTopLeft(Point point) {
        // TODO изменение положения координаты левого верхнего угла
        // TODO весь квадрат должен сдвинуться относительно этого угла
    	topRight = new Point(point.x + sideLength, point.y);
    	bottomRight = new Point(point.x + sideLength, point.y - sideLength);
    	bottomLeft = new Point(point.x, point.y - sideLength);
    	topLeft = point;
    }

    public void setTopRight(Point point) {
        // TODO также как и для setTopLeft только для правого верхнего угла
    }

    public void setBottomLeft(Point point) {
        // TODO также как и для setTopLeft только для левого нижнего угла
    }

    public void setBottomRight(Point point) {
        // TODO также как и для setTopLeft только для правого нижнего угла
    }
    
	@Override
	public void draw(Painter painter) {
		painter.drawline(getBottomRight(), getBottomLeft());
		painter.drawline(getTopRigth(), getTopLeft());
		painter.drawline(getBottomRight(), getTopRigth());
		painter.drawline(getTopLeft(), getBottomLeft());
	}
}
